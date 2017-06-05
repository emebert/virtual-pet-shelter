
public class VirtualPet {
	String name;
	int hunger = 50;
	int thirst = 50;
	int boredom = 50;
	String description;

	public VirtualPet(String nameParam, String descriptionParam, int hungerParam, int thirstParam, int boredomParam) {
		name = nameParam;
		description = descriptionParam;
		hunger = hungerParam;
		thirst = thirstParam;
		boredom = boredomParam;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t Description" + description + "\t Hunger:" + hunger + "\t Thirst: " + thirst + "\t Boredom:" + boredom;
	}

	void feed() {
		hunger = hunger - 10;
	}

	void water() {
		thirst = thirst - 10;
	}

	void play() {
		boredom = boredom - 10;
	}

	public void tick() {
		hunger = hunger + 5;
		thirst = thirst + 5;
		boredom = boredom + 5;
	}

}
