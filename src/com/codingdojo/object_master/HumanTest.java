package com.codingdojo.object_master;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human gus = new Human();
		Human luke = new Human();
		luke.attack(gus);
		System.out.println("luke health: ");
		luke.displayHealth();
		System.out.println("gus health: ");
		gus.displayHealth();
	}

}
