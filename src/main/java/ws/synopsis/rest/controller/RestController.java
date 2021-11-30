package ws.synopsis.rest.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ws.synopsis.rest.bean.response.InfoResponse.InfoResponse;
import ws.synopsis.rest.enums.CodStatus;
import ws.synopsis.rest.model.Usuario;
import ws.synopsis.rest.service.UsuarioService;

@RequestMapping("/usuarios")
public class RestController {

	private UsuarioService usuarioService;
	
	@GetMapping("")
	public ResponseEntity<?> listar(@RequestParam Usuario usuario){
		List<Usuario> listaUsuario=usuarioService.listarUsuarios();
		return ResponseEntity.ok(
				InfoResponse.builder()
				.status(CodStatus.OK.getStatus())
				.mensaje(listaUsuario)
				.build());
	}
}
