package ws.synopsis.rest.bean.request;

import lombok.Data;

@Data
public class UsuarioRequest {
    private String nombre;
    private String apellido;
    private int celular;
    private String contraseña;
}
