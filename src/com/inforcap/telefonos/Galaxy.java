package com.inforcap.telefonos;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		if (getBatteryPercentage() > 10) {
			System.out.println("El tel�fono es un Samsung "+getVersionNumber()+", tiene "+getBatteryPercentage()+"% de bater�a, "
					+ "Compa��a "+getCarrier());
		}else {
			System.out.println("Bater�a baja, debe cargar su tel�fono Samsung "+getVersionNumber());
		}
	}

	@Override
	public String ring() {
		return "Samsung "+getVersionNumber()+" suena "+getRingTone();
	}

	@Override
	public String unlock() {
		return "Desbloqueo mediante huella dactilar";
	}

}
