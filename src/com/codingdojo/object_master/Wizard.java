package com.codingdojo.object_master;

public class Wizard extends Human {

	public Wizard() {
		// TODO Auto-generated constructor stub
		this.health = 50;
		this.intelligence = 8;
	}
	public Human heal(Human toBeHealed) {
		toBeHealed.health += this.intelligence;
		return this;
	}
	public Human fireball(Human toBeAttacked) {
		toBeAttacked.health -= (3* this.intelligence);
		return this;
	}
}
