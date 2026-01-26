package com.springcore.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Player player = context.getBean("player",Player.class);
		System.out.println("Player is called: "+player);
		player.play();
		
		PlayerBean playerBean = context.getBean("getPlayerBean",PlayerBean.class);
		System.out.println("Player is called: "+playerBean);
		playerBean.playBean();
		
		

	}

}
