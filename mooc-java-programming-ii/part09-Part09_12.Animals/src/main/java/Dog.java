public class Dog extends Animal implements NoiseCapable {
	private String name;

	public Dog() {
		super("Dog");
	}

	public Dog(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(super.getName() + " eats");
	}

	@Override
	public void sleep() {
		System.out.println(super.getName() + " sleeps");
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void makeNoise() {
		System.out.println(super.getName() + " barks");
	}

	public void bark() {
		System.out.println(super.getName() + " barks");
	}
}
