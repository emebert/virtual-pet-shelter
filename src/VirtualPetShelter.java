import java.util.HashMap;
import java.util.Collection;
import java.util.Map;

public class VirtualPetShelter {

	Map<String, VirtualPet> allPets = new HashMap<String, VirtualPet>();

	public VirtualPet getPet(String pet) {
		return allPets.get(pet);
	}

	void intakePets(VirtualPet pet) {
		allPets.put(pet.name, pet);
	}

	void adoptPets(String name) {
		allPets.remove(name);
	}

	public void feedPets() {
		for (VirtualPet currentPet : allPets.values()) {
			currentPet.feed();
		}
	}

	public void waterPets() {
		for (VirtualPet currentPet : allPets.values()) {
			currentPet.water();
		}
	}

	public void playWith(String name) {
		getPet(name).play();
	}

	public void tick() {
		for (VirtualPet currentPet : allPets.values()) {
			currentPet.tick();
		}
	}

}
