package ao.co.temmais.arquitetura.controller.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import ao.co.temmais.arquitetura.modelo.PerfilTipo;
import ao.co.temmais.arquitetura.repository.service.UsuarioService;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{


	private static final String ADMIN = PerfilTipo.ADMIN.getDesc();
	private static final String ARQUITETOS = PerfilTipo.ARQUITETOS.getDesc();
	private static final String CANDIDATOS = PerfilTipo.CANDIDATOS.getDesc();
	private static final String SECRETARIA = PerfilTipo.SECRETARIA.getDesc();
   
	
	@Autowired
	private UsuarioService service;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
			// acessos públicos liberados
			.antMatchers("/webjars/**", "/css/**", "/image/**", "/js/**").permitAll()
			.antMatchers("/", "/home").permitAll()
			.antMatchers("/u/novo/cadastro", "/u/cadastro/realizado", "/u/cadastro/paciente/salvar").permitAll()
			
			// acessos privados admin
			.antMatchers("/u/editar/senha", "/u/confirmar/senha").hasAnyAuthority(ARQUITETOS, CANDIDATOS)
			.antMatchers("/u/**").hasAuthority(ADMIN)
			
			// acessos privados medicos
			.antMatchers("/medicos/especialidade/titulo/*").hasAnyAuthority(SECRETARIA, SECRETARIA)
			.antMatchers("/medicos/dados", "/medicos/salvar", "/medicos/editar").hasAnyAuthority(SECRETARIA, ADMIN)
			.antMatchers("/ano/inserir").hasAuthority(ADMIN)
			.antMatchers("/emolumentos/**").hasAuthority(ADMIN)
			.antMatchers("/grau/**").hasAuthority(ADMIN)
			.antMatchers("/canditatos/**").hasAuthority(ADMIN)
			.antMatchers("/arquitetos/**").hasAuthority(ADMIN)
			.antMatchers("/diagnosticos/**").hasAuthority(SECRETARIA)
			
			// acessos privados pacientes
			.antMatchers("/pacientes/**").hasAuthority(SECRETARIA)			
			
			// acessos privados especialidades
			.antMatchers("/especialidades/datatables/server/medico/*").hasAnyAuthority(SECRETARIA, ADMIN)
			.antMatchers("/especialidades/titulo").hasAnyAuthority(SECRETARIA, ADMIN, SECRETARIA)
			.antMatchers("/especialidades/**").hasAuthority(ADMIN)
			
			.anyRequest().authenticated()
			.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/", true)
				.failureUrl("/login-error")
				.permitAll()
			.and()
				.logout()
				.logoutSuccessUrl("/")
			.and()
				.exceptionHandling()
				.accessDeniedPage("/acesso-negado")
			.and()
			.sessionManagement().maximumSessions(1);
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(service).passwordEncoder(new BCryptPasswordEncoder());
	}

}
