package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {
	private boolean isOn;

	public TemperatureSensor() {
		isOn = false;
	}


	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void setOn() {
		if (!isOn()) {
			isOn = true;
		}
	}

	@Override
	public void setOff() {
		if (isOn()) {
			isOn = false;
		}
	}

	@Override
	public int read() {
		try {
			if (isOn()) {
				Random rand = new Random();
				int minValue = -30;
				int maxValue = 30;
				int range = maxValue - minValue + 1;

				return rand.nextInt(range) + minValue;
			}

			throw new IllegalStateException("Sensor is not on");
		} catch (Exception e) {
			System.out.println("Error reading temperature" + e.getMessage());
		}

		return 0;
	}
}
