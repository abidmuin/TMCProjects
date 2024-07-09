package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor {
	private final List<Sensor> sensors;
	private boolean isOn;

	public AverageSensor() {
		this.sensors = new ArrayList<>();
		isOn = false;
	}

	public void addSensor(Sensor toAdd) {
		sensors.add(toAdd);
	}

	@Override
	public boolean isOn() {
		return isOn;
	}

	@Override
	public void setOn() {
		for (Sensor sensor : sensors) {
			isOn = sensor.isOn();
		}
	}

	@Override
	public void setOff() {
		for (Sensor sensor : sensors) {
			if (sensor.isOn()) {
				sensor.setOff();
				isOn = false;
			}
		}
	}

	@Override
	public int read() {
		try {
			if (isOn) {
				OptionalDouble average = sensors.stream().mapToInt(Sensor::read).average();

				if (average.isPresent()) {
					return Integer.parseInt(String.valueOf(average.getAsDouble()));
				}
			}

			throw new IllegalStateException("Sensor is not on");
		} catch (Exception e) {
			System.out.println("Sensor is not on" + e.getMessage());
		}

		return 0;
	}
}
