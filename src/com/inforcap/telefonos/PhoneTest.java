package com.inforcap.telefonos;

public class PhoneTest {

	public static void main(String[] args) {
		
		IPhone iphone = new IPhone("X", 89, "Entel", "Ziiing, Ziiing!");
		Galaxy samsung = new Galaxy("S10", 95, "Movistar", "Ring, Ring, Ring!");
		
		iphone.displayInfo();
		System.out.println(iphone.ring());
		System.out.println(iphone.unlock());
		
		samsung.displayInfo();
		System.out.println(samsung.ring());
		System.out.println(samsung.unlock());
	}

}
