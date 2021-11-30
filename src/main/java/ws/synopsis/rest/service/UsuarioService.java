package ws.synopsis.rest.service;

import java.util.List;

import ws.synopsis.rest.bean.request.UsuarioRequest;
import ws.synopsis.rest.model.Usuario;

public interface UsuarioService {

	public List<Usuario> listarUsuarios();
	public boolean add(UsuarioRequest usuario);
	public boolean update(int idUsuario,UsuarioRequest usuario);
	public boolean delete(int idUsuario);
	
}
