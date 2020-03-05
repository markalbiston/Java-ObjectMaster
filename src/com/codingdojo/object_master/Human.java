package com.codingdojo.object_master;

public class Human {
	protected int strength;
	protected int intelligence; 
	protected int stealth;
	protected int health;
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	
	public void Attack(Human attackedHuman) {
		attackedHuman.health -= this.strength;
	}
	public void displayHealth() {
		System.out.println(this.health);
	}
}
