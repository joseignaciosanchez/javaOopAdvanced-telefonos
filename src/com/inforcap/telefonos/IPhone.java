package com.inforcap.telefonos;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		if (getBatteryPercentage() > 10) {
			System.out.println("El tel�fono es un iPhone "+getVersionNumber()+", tiene "+getBatteryPercentage()+"% de bater�a, "
					+ "Compa��a "+getCarrier());
		}else {
			System.out.println("Bater�a baja, debe cargar su tel�fono iPhone "+getVersionNumber());
		}
	}

	@Override
	public String ring() {
		return "iPhone "+getVersionNumber()+" suena "+getRingTone();
	}

	@Override
	public String unlock() {
		return "Desbloqueo mediante reconocimiento facial";
	}

}
