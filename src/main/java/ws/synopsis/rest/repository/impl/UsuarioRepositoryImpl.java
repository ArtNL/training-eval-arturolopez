package ws.synopsis.rest.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		//true: el celular ya estaba ingresado
		for(Entry<Long, Usuario> m: USUARIOS.entrySet()) {
			if(m.getValue().getCelular()==usuario.getCelular()) {
				return true;
			}
		}
		long id=(long) USUARIOS.size();
		USUARIOS.put(++id,usuario);
		return false;
	}
	@Override
	public boolean update(int idUsuario,Usuario usuario) {
		//true: sin errores
		for(Entry<Long, Usuario> e:USUARIOS.entrySet()) {
				if(e.getKey()==idUsuario) {
					USUARIOS.put(e.getKey(), usuario);
					return true;
				}
			}
		return false;
	}
	
	@Override
	public boolean delete(int idUsuario, Usuario usuario) {
		
		USUARIOS.remove((long)idUsuario);
		return true;
	}
}
