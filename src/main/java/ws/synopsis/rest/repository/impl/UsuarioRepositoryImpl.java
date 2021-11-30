package ws.synopsis.rest.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ws.synopsis.rest.model.Usuario;
import ws.synopsis.rest.repository.UsuarioRepository;
public class UsuarioRepositoryImpl implements UsuarioRepository {

	//pass un solo valor

	private static final Map<Long,Usuario> USUARIOS;
	static {
		USUARIOS=new HashMap<Long, Usuario>();
		USUARIOS.put(1L, Usuario.builder().nombre("Pedro").apellido("Suarez").celular(993819283).build());
		USUARIOS.put(2L, Usuario.builder().nombre("Juan").apellido("Soto").celular(942434565).build());
	}
	@Override
	public List<Usuario> listaUsuarios() {
		List<Usuario> lista= new ArrayList<Usuario>(USUARIOS.values());
		return lista;
	}
	@Override
	public boolean add(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean update(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}
}
