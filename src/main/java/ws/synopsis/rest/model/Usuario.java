package ws.synopsis.rest.model;

import lombok.Data;

@Data
public class Usuario {
	private String nombre;
	private String apellido;
	private int celular;
	private String contraseña;
}
