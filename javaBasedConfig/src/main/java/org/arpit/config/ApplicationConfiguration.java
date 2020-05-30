package org.arpit.config;

import org.arpit.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

	@Bean(name="nameObj")
	public HelloWorldService getName() {
		return new HelloWorldService("Spring");
	}
}
