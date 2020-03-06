package com.codingdojo.object_master;

public class NinjaWizardSamuraiTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard mark = new Wizard();
		Ninja stacia = new Ninja();
		Samurai danny = new Samurai();
		danny.attack(mark);
		stacia.steal(danny);
		mark.attack(danny);
		danny.attack(mark);
		mark.heal(danny);
		stacia.runAway();
		danny.meditate();
		System.out.println(danny.howMany());
		System.out.println(stacia.health);
		System.out.println(mark.health);
		System.out.println(danny.health);
	}

}
