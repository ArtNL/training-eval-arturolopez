package ws.synopsis.rest.repository;

import java.util.List;

import ws.synopsis.rest.model.Usuario;

public interface UsuarioRepository {
	public List<Usuario> listaUsuarios();
	public boolean add(Usuario usuario);
	public boolean update(Usuario usuario);
	public boolean delete(Usuario usuario);
}
