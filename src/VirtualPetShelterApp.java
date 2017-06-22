import java.util.Map;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean fun = false;

		VirtualPet pistol = new VirtualPet("Pistol", "needy French bulldog", null, 30, 50, 65);
		VirtualPet greta = new VirtualPet("Greta", "aggressive tabby", null, 50, 50, 50);
		VirtualPet jenkins = new VirtualPet("Jenkins", "finicky parrot", null, 30, 40, 50);
		VirtualPet kanye = new VirtualPet("Kanye", "insecure chinchilla", null, 30, 40, 95);

		VirtualPetShelter petShelter = new VirtualPetShelter();

		System.out.println(petShelter.allPets); // prints out map (names and
												// stats)
		System.out.println(kanye); // prints out stats for each name
		System.out.println(jenkins);
		System.out.println(pistol);
		System.out.println(greta);

		petShelter.intakePets(pistol);
		petShelter.intakePets(greta);
		petShelter.intakePets(jenkins);
		petShelter.intakePets(kanye);

		writeLine("It's your first day volunteering at Virtual Shelter for Homeless Virtual Pets. Let's get started.");
		do {
			petShelter.tick(); // Time passes each time this loop is run,
								// increasing hunger, thirst, and boredom for
								// all pets
			System.out.println(petShelter.allPets); // prints out map (names and
													// stats)
			writeLine(
					"These are the current pets in the shelter and their stats. How would you like to interact with the animals in the shelter?");
			writeLine(
					"Enter 'feed', 'water','play'. To adopt one of the pets, enter 'adopt.' To add a homeless pet, enter 'add'. To quit, enter 'quit.");

			String interact = input.nextLine();

			switch (interact) {
			case "feed":
				petShelter.feedPets(); // feeds all pets
				writeLine("You fed all the pets in the shelter!");
				break;
			case "water":
				petShelter.waterPets(); // gives all pets water
				writeLine("You provided water to all the pets in the shelter!");
				break;
			case "play":
				writeLine("Which of these pet would you like to play with? Enter the pet's name.");
				System.out.println(petShelter.allPets); // prints all the pets
														// (and stats)
				String petToPlay = input.nextLine(); // user input to select pet
				petShelter.playWith(petToPlay); // decreases boredom by playing
												// with specific pet
				writeLine("Thanks for playing with " + petToPlay
						+ ". These pets get lonely and bored without regular socialization.");
				break;

			case "adopt":
				writeLine("Which of these pets would you like to adopt? Enter the pet's name.");
				System.out.println(petShelter.allPets); // prints all the pets
														// and stats
				String adoptedPet = input.nextLine(); // user input to select
														// pet
				petShelter.adoptPets(adoptedPet); // removes pet from shelter
				writeLine("You adopted " + adoptedPet + ". Please provide this pet with a safe, happy home.");
				break;

			case "add":
				writeLine("A homeless pet! Let's get this little guy officially booked. What is this animal's name?"); // adds
																														// pet
																														// to
																														// shelter
				String newPetName = input.nextLine(); // gets new pet's name
				writeLine("Welcome, " + newPetName + "!");
				VirtualPet x = new VirtualPet(newPetName, "description", null, -1, -1, -1);
				petShelter.intakePets(x);

			case "quit":
				writeLine("You have opted to quit Virtual Pet Shelter. Goodbye.");
				System.exit(0); // exits Virtual Pet Shelter
				break;

			default:
				writeLine("Invalid entry. Your options are 'feed', 'water', 'play', 'adopt', 'add' and 'quit.' "); // options
																													// if
																													// user
																													// enters
																													// an
																													// invalid
																													// word
				break;

			}
		} while (fun = true); // loops forever, user must enter quit to leave
								// game
	}

	public static void writeLine(String message) {
		System.out.println(message);
	}

}