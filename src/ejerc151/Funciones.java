package ejerc151;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Funciones {
    static PreparedStatement psLogin = null;
    static PreparedStatement psPublic = null;
    static PreparedStatement psPrivate = null;
    static PreparedStatement psUsuario = null;
    static PreparedStatement psTags = null;
    static PreparedStatement psTagsEtiqueta = null;
    static PreparedStatement psAñadirTags = null;
    static PreparedStatement psNuevoUsuario = null;
    static PreparedStatement psModificarUsuario = null;
    static PreparedStatement psNuevoEnlace = null;
    static PreparedStatement psModificarEnlace = null;
    public static ArrayList<Enlace> enlaces = new ArrayList<Enlace>();
    public static Connection connection = null;

    static Connection conectar() {
    Connection connection = null;
    try {
        connection = DriverManager.getConnection( "jdbc:mysql://localhost:3307/enlaces", "root", "root" );
        psLogin = connection.prepareStatement( "SELECT * FROM usuarios WHERE usuario=?", Statement.RETURN_GENERATED_KEYS );
        psPublic = connection.prepareStatement( "SELECT * FROM enlaces WHERE acceso=0" );
        psPrivate = connection.prepareStatement( "SELECT * FROM enlaces" );
        psUsuario = connection.prepareStatement( "SELECT * FROM enlaces where usuario=?" );
        psTags = connection.prepareStatement( "SELECT * FROM etiquetas where idenlace=?" );
        psTagsEtiqueta = connection.prepareStatement( "SELECT * FROM etiquetas where idenlace=? and etiqueta=?" );
        psAñadirTags = connection.prepareStatement( "INSERT INTO etiquetas( id, etiqueta, idenlace ) VALUES ( null, ?, ? )" );
        psNuevoUsuario = connection.prepareStatement("INSERT INTO usuarios( id, usuario, clave, nombre ) VALUES ( null, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);    
        psModificarUsuario = connection.prepareStatement("UPDATE usuarios set usuario=?, clave=?, nombre=? WHERE id=?");    
        psNuevoEnlace = connection.prepareStatement("INSERT INTO enlaces( id, url, descripcion, usuario, acceso ) VALUES ( null, ?, ?, ?, ? )", Statement.RETURN_GENERATED_KEYS);    
        psModificarEnlace = connection.prepareStatement("UPDATE enlaces set url=?, descripcion=?, acceso=? WHERE id=?", Statement.RETURN_GENERATED_KEYS );    
    }
    catch( SQLException ex ) {
        ex.printStackTrace();
    }
    return connection;
}

    static String[] leerLogin( String usuario, String clave, String accion ) {
        ResultSet resultado = null;
        String[] datosUser = new String[4];
        String[] datosUsuario = new String[4];
        try {
            connection = Funciones.conectar();
            psLogin.setString( 1, usuario );
//            psLogin.setString( 2, clave );
            resultado = psLogin.executeQuery();
            if ( resultado.next() ) {
                if ( accion.equals( "L" ) && resultado.getString( "clave" ).equals( clave ) ) {
                    datosUser[0] = Integer.toString( resultado.getInt( "id" ) );
                    datosUser[1] = resultado.getString( "usuario" );
                    datosUser[2] = resultado.getString( "clave" );
                    datosUser[3] = resultado.getString( "nombre" );
                }
                else if ( accion.equals( "M" ) ) {
                    datosUser[0] = Integer.toString( resultado.getInt( "id" ) );
                }
            }
            else {
                datosUser[0] = "0";
            }
        }
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        return datosUser;
    }

    public static String[] AñadirUsuario( int idUsuario, String usuario, String clave, String nombre ) {
        int filas = 0;
        int idUser = 0;
        String[] datosUser = new String[4];
        if ( idUsuario != 0 ) {
            try {
                Funciones.psModificarUsuario.setString( 1, usuario );
                Funciones.psModificarUsuario.setString( 2, clave );
                Funciones.psModificarUsuario.setString( 3, nombre );
                Funciones.psModificarUsuario.setInt( 4, idUsuario );
                Funciones.psModificarUsuario.executeUpdate();
                datosUser[0] = Integer.toString( idUsuario );
                datosUser[1] = usuario;
                datosUser[2] = clave;
                datosUser[3] = nombre;
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else {
            try {
                Funciones.psNuevoUsuario.setString( 1, usuario );
                Funciones.psNuevoUsuario.setString( 2, clave );
                Funciones.psNuevoUsuario.setString( 3, nombre );
                filas = Funciones.psNuevoUsuario.executeUpdate();
                if ( filas > 0 ) {
                    ResultSet resultado = Funciones.psNuevoUsuario.getGeneratedKeys();
                    if ( resultado.next() ) {
                        idUser = resultado.getInt( 1 );
                        datosUser[0] = Integer.toString( idUser );
                        datosUser[1] = usuario;
                        datosUser[2] = clave;
                        datosUser[3] = nombre;
                    }
                    else {
                        idUser = 0;
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return datosUser;
    }
    
    static ArrayList<String> leerTags( int idenlace ) {
        ArrayList<String> tagsEnlace = new ArrayList<String>();
        ResultSet resultado = null;
        try {
            connection = Funciones.conectar();
            psTags.setInt( 1, idenlace );
            resultado = psTags.executeQuery();
            while ( resultado.next() ) {
                tagsEnlace.add( resultado.getString( "etiqueta" ) );
            }
       }   
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        return tagsEnlace;
    }
    
    static ArrayList<Enlace> leerEnlaces( int id ) {
        ResultSet resultado = null;
        Enlace e = null;
        enlaces.clear();
        try {
            connection = Funciones.conectar();
            if ( id == 0 ) {
                resultado = psPublic.executeQuery();
            }
            else {
                resultado = psPrivate.executeQuery();
            }
            while ( resultado.next() ) {
                e = new Enlace( resultado.getInt( "id" ), resultado.getString( "url" ), resultado.getString( "descripcion" ), resultado.getInt( "usuario" ), resultado.getInt( "acceso" ) );
                psTags.setInt( 1, resultado.getInt( "id" ) );
                ResultSet rsEtiq = psTags.executeQuery();
                while ( rsEtiq.next() ) {
                    e.setEtiqueta( rsEtiq.getString( "etiqueta" ) );
                }
                enlaces.add( e );
            }
       }   
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        return enlaces;
    }

    static ArrayList<Enlace> leerEnlacesUsuario( int id ) {
        ResultSet resultado = null;
        Enlace e = null;
        enlaces.clear();
        try {
            connection = Funciones.conectar();
            if ( id == 0 ) {
                resultado = psPrivate.executeQuery();
            }
            else {
                psUsuario.setInt( 1, id );
                resultado = psUsuario.executeQuery();
            }
            while ( resultado.next() ) {
                e = new Enlace( resultado.getInt( "id" ), resultado.getString( "url" ), resultado.getString( "descripcion" ), resultado.getInt( "usuario" ), resultado.getInt( "acceso" ) );
                psTags.setInt( 1, resultado.getInt( "id" ) );
                ResultSet rsEtiq = psTags.executeQuery();
                while ( rsEtiq.next() ) {
                    e.setEtiqueta( rsEtiq.getString( "etiqueta" ) );
                }
                enlaces.add( e );
            }
       }   
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        return enlaces;
    }
    
    static ArrayList<Enlace> buscaEnlaces( int tipo, int idUsuario, String[] lin ) {
        ResultSet resultado = null;
        Enlace e = null;
        enlaces.clear();
        String subsentencia = "";
        String sentencia = "";
        if ( lin.length > 0 ) {
//            sentencia = "SELECT etiquetas.idenlace, enlaces.* FROM etiquetas INNER JOIN enlaces ON etiquetas.idenlace = enlaces.id";
            sentencia = "SELECT enlaces.* FROM enlaces";
            subsentencia += "'";
            for ( int i=0; i<lin.length; i++ ) {
                subsentencia += lin[i];
                if ( i < lin.length-1 ) {
                    subsentencia += "|";
                }
            }
            subsentencia += "'";
            if ( tipo == 0 ) {
                sentencia += " WHERE upper(descripcion) REGEXP " + subsentencia;
            }
            else if ( tipo == 1 ) {
                sentencia += " WHERE id in (SELECT idenlace FROM etiquetas WHERE etiquetas.idenlace=enlaces.id and upper(etiqueta) REGEXP " + subsentencia + ")";
            }
            else if ( tipo == 2 ) {
                sentencia += "  WHERE ( ( upper(descripcion) REGEXP " + subsentencia  + ") or (" + "id in (SELECT idenlace FROM etiquetas WHERE etiquetas.idenlace=enlaces.id and upper(etiqueta) REGEXP " + subsentencia + ") ) )";
            }
            if ( idUsuario == 0 ) {
                sentencia += " and acceso = 0";
            }
        }
        else {
            sentencia = "SELECT * FROM enlaces ";
            if ( idUsuario == 0 ) {
                sentencia += " WHERE acceso = 0";
            }
        }
        try {
            connection = Funciones.conectar();
            Statement consulta = connection.createStatement();
            resultado = consulta.executeQuery( sentencia );
            while ( resultado.next() ) {
                int iden = resultado.getInt( "id" );
                e = new Enlace( resultado.getInt( "id" ), resultado.getString( "url" ), resultado.getString( "descripcion" ), resultado.getInt( "usuario" ), resultado.getInt( "acceso" ) );
                psTags.setInt( 1, resultado.getInt( "id" ) );
                ResultSet rsEtiq = psTags.executeQuery();
                while ( rsEtiq.next() ) {
                    e.setEtiqueta( rsEtiq.getString( "etiqueta" ));
                }
                enlaces.add( e );
            }
        }
        catch( SQLException ex ) {
            ex.printStackTrace();
        }
        return enlaces;
    }

    static int añadirEnlace( int id, String url, String descri, boolean esPublico, String modEtiqueta, String accion, int idenlace ) {
        int filas = 0;
        ResultSet resultado = null;
        connection = Funciones.conectar();
        if ( accion.equals( "A" ) ) {
            try {
                psNuevoEnlace.setString( 1, url );
                psNuevoEnlace.setString( 2, descri );
                psNuevoEnlace.setInt( 3, id );
                if ( esPublico ) {
                    psNuevoEnlace.setInt( 4, 0 );
                }
                else {
                    psNuevoEnlace.setInt( 4, 1 );
                }
                filas = psNuevoEnlace.executeUpdate();
                if ( filas>0 ) {
                    resultado = Funciones.psNuevoEnlace.getGeneratedKeys();
                    if ( resultado.next() ) {
                        int idenl = resultado.getInt( 1 );
                        String[] lin = modEtiqueta.split(",");
                        for ( int i=0; i<lin.length; i++ ) {
                            psAñadirTags.setString( 1, lin[i] );
                            psAñadirTags.setInt( 2, idenl );
                            psAñadirTags.executeUpdate();
                        }
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if ( accion.equals( "M" ) ) {
            try {
                psModificarEnlace.setString( 1, url );
                psModificarEnlace.setString( 2, descri );
                if ( esPublico ) {
                    psModificarEnlace.setInt( 3, 0 );
                }
                else {
                    psModificarEnlace.setInt( 3, 1 );
                }
                psModificarEnlace.setInt( 4, idenlace );
                filas = psModificarEnlace.executeUpdate();
                if ( filas>0 ) {
                    Statement consulta = connection.createStatement();
                    consulta.executeUpdate("DELETE FROM etiquetas WHERE idenlace=" + idenlace );
                    String[] lin = modEtiqueta.split(",");
                    for ( int i=0; i<lin.length; i++ ) {
                        psAñadirTags.setString( 1, lin[i] );
                        psAñadirTags.setInt( 2, idenlace );
                        psAñadirTags.executeUpdate();
                    }
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        else if ( accion.equals( "E" ) ) {
            try {
                Statement consulta = connection.createStatement();
                consulta.executeUpdate("DELETE FROM etiquetas WHERE idenlace=" + idenlace );
                filas = consulta.executeUpdate("DELETE FROM enlaces WHERE id=" + idenlace );
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return filas;
    }
    
}

class Usuario  {
    private int id;
    private String usuario;
    private String clave;
    private String nombre;
    
    public Usuario( int id, String usuario, String clave, String nombre ) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave( String clave ) {
        this.clave = clave;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario( String usuario ) {
        this.usuario = usuario;
    }
    
    public static boolean Existe( String usuario, String clave, String accion ) {
        boolean existe = false;
        String[] datosUser = Funciones.leerLogin( usuario, clave, accion );
        if ( !datosUser[0].equals( "0" ) ) {
            existe = true;
        }
        return existe;
    }

    public static String[] GuardarUsuario( int idUsuario, String usuario, String clave, String nombre ) {
        return Funciones.AñadirUsuario( idUsuario, usuario, clave, nombre );
    }
}

class Enlace {
    private int id;
    private String url;
    private String descripcion;
    private int usuario;
    private int acceso;
    ArrayList<String>Etiquetados = new ArrayList<String>();

    public Enlace( int id, String url, String descripcion, int usuario, int acceso ) {
        this.id = id;
        this.url = url;
        this.descripcion = descripcion;
        this.usuario = usuario;
        this.acceso = acceso;
    }
    
    public int getAcceso() {
        return acceso;
    }

    public void setAcceso( int acceso ) {
        this.acceso = acceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion( String descripcion ) {
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl( String url ) {
        this.url = url;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario( int usuario ) {
        this.usuario = usuario;
    }
    
    public ArrayList getEtiquetados() {
        return this.Etiquetados;
    }

    public void setEtiqueta( String etiqueta ) {
         this.Etiquetados.add( etiqueta );
    }

    public static ArrayList Etiquetados( int tipo, int idUsuario, String[] etiqueta ) {
        return Funciones.buscaEnlaces( tipo, idUsuario, etiqueta );
    }

    public void setEtiquetados( ArrayList etiquetados ) {
        this.Etiquetados = etiquetados;
    }
    
    @Override
    public String toString(){
        return this.url;
    }
}