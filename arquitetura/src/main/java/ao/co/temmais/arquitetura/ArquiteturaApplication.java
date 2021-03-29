package ao.co.temmais.arquitetura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ArquiteturaApplication {

	public static void main(String[] args) {
	//System.out.println(new BCryptPasswordEncoder().encode("654321"));
		SpringApplication.run(ArquiteturaApplication.class, args);
	}

}
