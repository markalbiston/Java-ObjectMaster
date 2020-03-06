package com.codingdojo.object_master;

public class Ninja extends Human {

	public Ninja() {
		// TODO Auto-generated constructor stub
		this.stealth = 10;
	}
	public Human steal(Human stolenFrom) {
		stolenFrom.health -= this.stealth;
		this.health += this.stealth;
		return this;
	}
	public Human runAway() {
		this.health -= 10;
		return this;
	}

}
