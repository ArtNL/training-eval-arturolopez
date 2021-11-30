package ws.synopsis.rest.bean.response.InfoResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Status {

	private String code;
	private String mensaje;
}
