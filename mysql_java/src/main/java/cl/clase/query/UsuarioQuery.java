package cl.clase.query;

import java.sql.ResultSet;
import java.sql.SQLException;

import cl.clase.modelo.Usuario;
import cl.fuentes.db.Mysqlconn;

public class UsuarioQuery implements Crud<Usuario> {

	private Mysqlconn con;
	
	public UsuarioQuery() throws Exception {
		con = new Mysqlconn("localhost","ventas","root","1234");
		con.open();
	}
	
	@Override
	public void create(Usuario objeto) {
		// insert into usuario values ('admin','1234','Administrador');
		try {
			con.ejecutarUpdate("insert into usuario values ('" + objeto.getUsuario() + "','" + objeto.getClave() + "','" + objeto.getNombre() + "')");
			con.close();
			
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Usuario read(String valor) {
		// select * from usuario where usuario='admin';
		Usuario usuario = new Usuario();
		
		try {
			ResultSet rs = con.ejecutarQuery("select * from usuario where usuario='" + valor + "';");
			
			//Falta obtener datos del ResultSet y traspasarlos al objeto usuario
			
			while(rs.next()) {
				usuario.setUsuario(rs.getString(1));
				usuario.setClave(rs.getString(2));
				usuario.setNombre(rs.getString(3));
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return usuario;
	}

	@Override
	public void update(Usuario objeto) {
		// Update usuario set clave='1111', nombre='Marcelo Roa' where usuario='alumno';
		
		try {
			con.ejecutarUpdate("Update usuario set clave='"+objeto.getClave()+"', nombre='"+objeto.getNombre()+"' where usuario='"+objeto.getUsuario()+"';");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void delete(String valor) {
		// Delete from usuaro where usuario='alumno';
		
		try {
			con.ejecutarUpdate("delete from usuario where usuario='" + valor + "'");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
