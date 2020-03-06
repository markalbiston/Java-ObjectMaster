package com.codingdojo.object_master;

public class Samurai extends Human {
	private int samuraiCount;
	public Samurai() {
		// TODO Auto-generated constructor stub
		this.health = 200;
		samuraiCount++;
	}
	public Human deathBlow(Human deadGuy) {
		deadGuy.health = 0;
		this.health = this.health/2;
		return this;
	}
	public Human meditate() {
		this.health = this.health + this.health/2;
		return this;
	}
	public int howMany() {
		return samuraiCount;
	}

}
