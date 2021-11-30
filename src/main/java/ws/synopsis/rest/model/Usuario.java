package ws.synopsis.rest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	private String nombre;
	private String apellido;
	private int celular;
	private String contraseña;
}
