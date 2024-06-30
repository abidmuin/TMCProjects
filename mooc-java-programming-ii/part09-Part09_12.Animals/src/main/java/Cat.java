public class Cat extends Animal implements NoiseCapable {
	public String name;

	public Cat() {
		super("Cat");
	}

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println(super.getName() + " purrs");
	}

	public void purr() {
		System.out.println(super.getName() + " purrs");
	}
}
