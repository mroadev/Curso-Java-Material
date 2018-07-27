package cl.clase.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Usuariogui extends JFrame {
	
	JLabel lbUsuario;
	JTextField txtUsuario;
	JLabel lbClave;
	JTextField txtClave;
	JLabel lbNombre;
	JTextField txtNombre;
	
	JButton btnAgregar;
	JButton btnModificar;
	JButton btnEliminar;
	
	public Usuariogui() {
		super("Formulario Usuario");
		this.iniciarComponentes();
	}
	
	public void iniciarComponentes() {
		this.setLayout(null);
		this.setSize(400,400);
		
		lbUsuario = new JLabel();
		lbClave = new JLabel();
		lbNombre = new JLabel();
		
		lbUsuario.setLocation(20, 20);//x,y
		lbClave.setLocation(20, 60);//x,y
		lbNombre.setLocation(20, 100);//x,y
		
		lbUsuario.setSize(100, 20);//ancho, alto
		lbClave.setSize(100, 20);//ancho, alto
		lbNombre.setSize(100, 20);//ancho, alto
		
		this.add(lbUsuario);
		this.add(lbClave);
		this.add(lbNombre);
		this.add(txtUsuario);
		this.add(txtClave);
		this.add(txtNombre);
		this.add(btnAgregar);
		this.add(btnModificar);
		this.add(btnEliminar);
	}
	
	public static void main(String[] args) {
		
		Usuariogui vista = new Usuariogui();
		vista.setVisible(true);
	}

}
