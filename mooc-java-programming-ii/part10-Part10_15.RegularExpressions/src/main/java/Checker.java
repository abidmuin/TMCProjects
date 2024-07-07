public class Checker {
	public boolean isDayOfWeek(String string) {
		String regexPattern = "sat|sun|mon|tue|wed|thu|fri";
		return string.matches(regexPattern);
	}

	public boolean allVowels(String string) {
		String regexPattern = "^[aeiou]+$";
		return string.matches(regexPattern);
	}

	public boolean timeOfDay(String string) {
		String regexPattern = "([01]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)";
		return string.matches(regexPattern);
	}
}
