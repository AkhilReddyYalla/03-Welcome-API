package in.ashokit.rest;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	private final Environment env;  //Environment is used to access environment properties such as configuration properties.
	
	public WelcomeRestController(Environment env) {
		this.env = env;
	}
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		String port = env.getProperty("server.port");
		String msg = "Welcome To Ashok IT(" + port + ")";
		return msg;
	}
}
