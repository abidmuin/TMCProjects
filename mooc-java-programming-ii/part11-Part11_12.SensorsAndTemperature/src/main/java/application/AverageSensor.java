package application;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class AverageSensor implements Sensor {
	private final List<Sensor> sensors;
	private final List<Integer> averageReading;

	public AverageSensor() {
		this.sensors = new ArrayList<>();
		this.averageReading = new ArrayList<>();
	}

	public void addSensor(Sensor toAdd) {
		sensors.add(toAdd);
	}

	@Override
	public boolean isOn() {
		boolean isOn = false;

		for (Sensor sensor : sensors) {
			if (sensor.isOn()) {
				isOn = true;
			}

			break;
		}

		return isOn;
	}

	@Override
	public void setOn() {
		for (Sensor sensor : sensors) {
			sensor.setOn();
		}
	}

	@Override
	public void setOff() {
		for (Sensor sensor : sensors) {
			sensor.setOff();
		}
	}

	@Override
	public int read() {
		try {
			if (isOn() && !sensors.isEmpty()) {
				OptionalDouble average = sensors.stream().mapToInt(Sensor::read).average();

				if (average.isPresent()) {
					int reading = (int) average.getAsDouble();
					averageReading.add(reading);
					return reading;
				}
			}

			throw new IllegalStateException("Error getting average of sensors");
		} catch (Exception e) {
			System.out.println("Sensor is not on" + e.getMessage());
		}

		return 0;
	}

	public List<Integer> readings() {
		return averageReading;
	}
}
