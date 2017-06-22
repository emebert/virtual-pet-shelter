
public class VirtualPet {
	String name;
	int boredom = 50;
	int healthNeed = 50;
	int happiness = 50;
	String species;
	String description;

	public VirtualPet(String nameParam, String descriptionParam, String speciesParam, int boredomParam, int happinessParam, int healthNeedParam) {
		name = nameParam;
		description = descriptionParam;
		boredom = boredomParam;
		happiness = happinessParam;
		species = speciesParam;
		healthNeed = healthNeedParam;
	}

	@Override
	public String toString() {
		return "\n" + name + "\t species" + species + "\t Description" + description + "\t Boredom:" + boredom + "\t Happiness Level" + happiness + "\t Health Level";
	}

	public void tick() {
		boredom = boredom + 5;

	}

	public void feed() {
		// TODO Auto-generated method stub
		
	}

	public void water() {
		// TODO Auto-generated method stub
		
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}

}
