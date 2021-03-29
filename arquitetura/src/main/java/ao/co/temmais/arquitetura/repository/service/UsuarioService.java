package ao.co.temmais.arquitetura.repository.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ao.co.temmais.arquitetura.modelo.Perfil;
import ao.co.temmais.arquitetura.modelo.Usuario;
import ao.co.temmais.arquitetura.repository.UsuarioRepository;



@Service
public class UsuarioService implements UserDetailsService {

	@Autowired
	private UsuarioRepository repository;
	
	@Transactional(readOnly = true)
	public Usuario buscarPorEmail(String email) {
		
		return repository.findByEmail(email);
	}
	
	
	@Transactional(readOnly = true)
	public Optional<Usuario> buscarPorEmailEAtivo(String email){
		return repository.findByEmailAndAtivo(email);
	}
	
	private String[] getAtuthorities(List<Perfil> perfis) {
		String[] authorities = new String[perfis.size()];
		for (int i = 0; i < perfis.size(); i++) {
			authorities[i] = perfis.get(i).getDesc();
		}
		return authorities;
	}
	
	// metodo usado para fazer a consulta pelo usuario e colocar eme na sesao
		@Override @Transactional(readOnly = true)
		public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			// esta aqui so buscar por email
			//Usuario usuario = buscarPorEmail(username);
			// buscar por email atvio
			Usuario usuario = buscarPorEmailEAtivo(username)
					.orElseThrow(() -> new UsernameNotFoundException("Usuario " + username + "nao encontrado"));
			return new User(
				usuario.getEmail(),
				usuario.getSenha(),
				AuthorityUtils.createAuthorityList(getAtuthorities(usuario.getPerfis()))
			);
		}
		
		

}
