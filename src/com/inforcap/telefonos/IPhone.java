package com.inforcap.telefonos;

public class IPhone extends Phone implements Ringable{

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public void displayInfo() {
		if (getBatteryPercentage() > 10) {
			System.out.println("El teléfono es un iPhone "+getVersionNumber()+", tiene "+getBatteryPercentage()+"% de batería, "
					+ "Compañía "+getCarrier());
		}else {
			System.out.println("Batería baja, debe cargar su teléfono iPhone "+getVersionNumber());
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
