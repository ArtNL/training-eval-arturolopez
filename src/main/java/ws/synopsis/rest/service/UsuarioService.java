package ws.synopsis.rest.service;

import java.util.List;

import ws.synopsis.rest.model.Usuario;

public interface UsuarioService {

	public List<Usuario> listarUsuarios();
	public boolean add(Usuario usuario);
	public boolean update(int idUsuario,Usuario usuario);
	public boolean delete(int idUsuario);
	
}
