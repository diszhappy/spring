package in.diszhappy;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author Saumm
 * Created on 03-Aug-2017 10:55:22 PM
 */
public class SprigJpaAppBuilder extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringJpaApplication.class);
	}

}
