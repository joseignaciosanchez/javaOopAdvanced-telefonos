package com.inforcap.telefonos;

public class Galaxy extends Phone implements Ringable{

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		if (getBatteryPercentage() > 10) {
			System.out.println("El teléfono es un Samsung "+getVersionNumber()+", tiene "+getBatteryPercentage()+"% de batería, "
					+ "Compañía "+getCarrier());
		}else {
			System.out.println("Batería baja, debe cargar su teléfono Samsung "+getVersionNumber());
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
