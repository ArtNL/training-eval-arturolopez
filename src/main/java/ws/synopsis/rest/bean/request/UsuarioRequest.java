package ws.synopsis.rest.bean.request;

import lombok.Data;

@Data
public class UsuarioRequest {
    private String name;
    private String lastName;
    private int celular;
}
