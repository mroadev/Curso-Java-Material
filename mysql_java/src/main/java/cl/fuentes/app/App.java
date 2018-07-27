package cl.fuentes.app;

import java.sql.ResultSet;

import cl.clase.modelo.Usuario;
import cl.clase.query.UsuarioQuery;
import cl.fuentes.db.Mysqlconn;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	/*
    	ResultSet resultSet = null;
    	    	
    	Mysqlconn mc = new Mysqlconn("localhost", "ventas", "root", "1234");
    	try {
        	mc.open();
        	resultSet = mc.ejecutarQuery("select * from usuario;");
        	mc.obtenerColumnas(resultSet);
        	mc.mostrarQuery(resultSet);
        	//mc.ejecutarUpdate("delete .....");
        	mc.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	*/
    	Usuario usuario1 = new Usuario("Pamela","2222","Pamela Fuentes");
    	UsuarioQuery uq = new UsuarioQuery();
    	uq.create(usuario1);
    	
    	Usuario usuario2 = new Usuario();
    	usuario2 = uq.read("profe");
    	
    	System.out.println(usuario2.getUsuario()+" "+usuario2.getClave()+" "+usuario2.getNombre());

    	uq.delete("pamela");
    	
    }

}
