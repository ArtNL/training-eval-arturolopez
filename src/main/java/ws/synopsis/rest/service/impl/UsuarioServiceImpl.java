package ws.synopsis.rest.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import ws.synopsis.rest.bean.request.UsuarioRequest;
import ws.synopsis.rest.model.Usuario;
import ws.synopsis.rest.repository.UsuarioRepository;
import ws.synopsis.rest.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService{

	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> listarUsuarios() {
		
		return usuarioRepository.listaUsuarios();
	}

	@Override
	public boolean add(UsuarioRequest usuario) {
		return usuarioRepository.add(Usuario.builder()
				.nombre(usuario.getNombre())
				.apellido(usuario.getApellido())
				.celular(usuario.getCelular())
				.contraseña(usuario.getContraseña()).build());
		
	}

	@Override
	public boolean update(int idUsuario, UsuarioRequest usuario) {
		return usuarioRepository.update(idUsuario, Usuario.builder()
				.nombre(usuario.getNombre())
				.apellido(usuario.getApellido())
				.celular(usuario.getCelular())
				.contraseña(usuario.getContraseña()).build());
		
	}

	@Override
	public boolean delete(int idUsuario) {
		return usuarioRepository.delete(idUsuario);
		
	}
	

}
