package com.springcore.javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.springcore.javaconfiguration")
public class JavaConfiguration {
	
	@Bean
	public PlayerDependency getPlayerDependency() {
		return new PlayerDependency();
	}
	
	@Bean
	public Player getPlayer() {
		Player player = new Player(getPlayerDependency());
		return player;
	}
	
	@Bean
	// @Bean(name="playerbean")
	public PlayerBean getPlayerBean() {
		PlayerBean player = new PlayerBean();
		return player;
	}

}
