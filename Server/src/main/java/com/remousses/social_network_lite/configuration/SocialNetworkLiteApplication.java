package com.remousses.social_network_lite.configuration;

import com.remousses.social_network_lite.component.ModelMapperCustomize;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.remousses.social_network_lite.model.entity")
@EnableJpaRepositories("com.remousses.social_network_lite.repository")
@ComponentScan(basePackages = { "com.remousses.social_network_lite" })
public class SocialNetworkLiteApplication {
	
	public static void main(final String[] args) {
		SpringApplication.run(SocialNetworkLiteApplication.class, args);
	}

	@Bean
	public ModelMapperCustomize modelMapper() {
		return new ModelMapperCustomize();
	}
}