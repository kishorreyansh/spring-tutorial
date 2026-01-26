package com.springcore.javaconfiguration;

import org.springframework.stereotype.Component;

@Component("player")
public class Player {
	
	
	
	private PlayerDependency playerDependency;

	public Player(PlayerDependency playerDependency) {
		super();
		this.playerDependency = playerDependency;
	}

	public PlayerDependency getPlayerDependency() {
		return playerDependency;
	}

	public void setPlayerDependency(PlayerDependency playerDependency) {
		this.playerDependency = playerDependency;
	}
	
	public void play() {
		this.playerDependency.display();
		System.out.println("Player is playing cricket");
	}

	@Override
	public String toString() {
		return "Player [playerDependency=" + playerDependency + "]";
	}
	
	

}
