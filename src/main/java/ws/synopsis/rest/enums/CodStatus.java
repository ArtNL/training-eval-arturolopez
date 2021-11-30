package ws.synopsis.rest.enums;

import lombok.Getter;
import ws.synopsis.rest.bean.response.InfoResponse.Status;

@Getter
public enum CodStatus {

	OK("1000","Proceso exitoso"),
	CAMPO_VACIO("2000","Complete todos los cmapos"),
	CELULAR_ERROR("2001","El celular ya ha sido previamente ingresado");
	
	private final Status status;
	
	CodStatus(String codigo,String mensaje) {
		this.status=new Status(codigo,mensaje);
	}
}
