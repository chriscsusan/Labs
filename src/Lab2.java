import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int question;
		int dead = 0;
		double rdm;
		String name;
		String color;
		String capital;
		String proceed = "y";
		String approach;
		String follow;

		while (proceed.equalsIgnoreCase("y")) {
			System.out.println(
					"You are traveling with a group of knights in your service.  You approach a bridge guarded by a small, scraggly man in a tattered robe.\r");
			System.out.println("Bridgekeeper: STOP!");
			System.out
					.println("Bridgekeeper: Who would cross the Bridge of Death must answer me these questions three.");
			System.out.println("Bridgekeeper: Ere the other side he see.");
			System.out.println("You: Ask me your questions, Bridgekeeper.  I'm not afraid!");
			System.out.println("Bridgekeeper: What is your name?");
			name = scanner.next();
			System.out.println("Bridgekeeper: What is your quest?");
			System.out.println("" + name + ": To seek the Holy Grail.");

			rdm = Math.random() * 100;

			if (rdm >= 0 && rdm < 34) {
				question = 1;
			} else if (rdm >= 34 && rdm < 67) {
				question = 2;
			} else {
				question = 3;
			}

			switch (question) {
			case 1:
				System.out.println("Bridgekeeper: What is your favorite color?");
				color = scanner.next();
				if (color.equalsIgnoreCase("blue")) {
					System.out.println("Bridgekeeper: Right, off you go.\r");
					dead = 0;
				} else {
					System.out.println(
							"*You answered incorrectly and are cast off the bridge, into the Gorge of Eternal Peril.*\r");
					dead = 1;
				}
				break;
			case 2:
				System.out.println("Bridgekeeper: What is the capital of Assyria?");
				capital = scanner.next();
				if (capital.equalsIgnoreCase("Assur")) {
					System.out.println("Bridgekeeper: Right, off you go.");
					dead = 0;
				} else {
					System.out.println(
							"*You answered incorrectly and are cast off the bridge, into the Gorge of Eternal Peril.*");
					dead = 1;
				}
				break;
			case 3:
				System.out.println("Bridgekeeper: What is the air-speed velocity of an unladen swallow??");
				System.out.println("" + name + ": What do you mean, an African or European swallow?");
				System.out.println("Bridgekeeper: Huh?  What?  I...I don't know that. AAGGGHFHHHH!!");
				System.out.println(
						"*The Bridgekeeper is cast off the bridge, into the Gorge of Eternal Peril.*\r");
				dead = 0;
				break;
			}
			if (dead != 1) {
				System.out.println(
						"*You continue on your journey and approach a curious man on a small mountain.  He inexplicably has ram horns on his head.*");
				System.out.println("" + name + ": Knights!  Forward!");
				System.out.println(
						"*The man doesn't notice you and continues to point his finger, seemingly shooting explosions from his hand.*");
				System.out.println(
						"" + name + ": What manner of man are you that can summon up fire without flint or tinder?");
				System.out.println("Man: I...am an enchanter.");
				System.out.println("" + name + ": By what name are you known?");
				System.out.println("Enchanter: There are some who call me...Tim?");
				System.out.println("" + name + ": Greetings, Tim the Enchanter.");
				System.out.println("Tim?: Greetings, " + name + "!");
				System.out.println("" + name + ": You know my name?");
				System.out.println("Tim?: I do.");
				System.out.println("*[boom] He creates another explosion, causing everyone else to flinch.*");
				System.out.println("Tim?: You seek the Holy Grail!");
				System.out.println(
						"" + name + ": Yes, we're looking for the grail.  Our quest is to find the Holy Grail.");
				System.out
						.println("*After some awkward conversation, the enchanter agrees to help you on your quest.*");
				System.out.println(
						"Tim?: To the north there lies a cave -- the cave of Caerbannog -- wherein, carved in mystic runes upon the very living rock, the last words of Ulfin Bedweer of Regett [boom] proclaim the last resting place of the most Holy Grail.");
				System.out.println("" + name + ": And where could we find this cave, oh Tim?");
				System.out.println(
						"Tim?: Follow!  But follow only if ye be men of valor, for the entrance to this cave is guarded by a creature so foul, so cruel that no man yet has fought with it and lived!  Bones of four fifty men lie strewn about its lair. So, brave knights, if you do doubt your courage or your strength, come no further, for death awaits you all with nasty, big pointy teeth.");
				System.out.println("Do you want to follow? (y/n)");
				follow = scanner.next();
				if (follow.equalsIgnoreCase("y")) {
					System.out.println("*You and the knights head for the cave, accompanyed by Tim?*");
					System.out.println(
							"*Before too long you all arrive at the cave and take cover behind a nearby ridge to assess the situation.  There are bones strewn across the ground in front of the cave.*");
					System.out.println("" + name + ": Right!  Keep me covered.");
					System.out.println("Knight: With what?");
					System.out.println("" + name + ": Just keep me covered.");
					System.out.println("Tim? Too late.  There he is.");
					System.out.println("*At the mouth of the cave, a small, white rabbit hops into view.*");
					System.out.println("" + name + ": What, behind the rabbit?");
					System.out.println("Tim?: It IS the rabbit!");
					System.out.println("" + name + ": You silly man.  You got us all worked up!");
					System.out.println("Tim?: Look, that rabbit's got a vicious streak a mile wide.  It's a killer!");
					System.out.println("Knight: Oh yeah?");
					System.out.println("Tim?: I'm warning you.");
					System.out.println("\r\nDo you want to approach the cave? (y/n)");
					approach = scanner.next();
					if (approach.equalsIgnoreCase("y")) {
						System.out.println("" + name + ": Right.");
						System.out.println("Knights: CHARGE!");
						System.out.println(
								"*You and the knights unsheathe your swords and charge toward the cave.  As you approach the rabbit, it leaps into the air and attacks a knight, killing him before he can fight back.  It then leaps to another knight, killing him as well.  This continues for about a minute before you call for retreat.*");
						System.out.println("" + name + ": RUN AWAY!  RUN AWAY!");

					} else {
						System.out.println("" + name + ": On second thought, let's not risk it.");
					}
				}
			}
			System.out.println(
					"Unfortunately you cannot contine; you either died or ran away.  Would you like to try again? (y/n)");
			proceed = scanner.next();
		}
		System.out.println("Fin.");
		scanner.close();
	}
}
