import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] suit = { "Spades ", "Clubs ", "Diamonds ", "Hearts " };
		String[] value = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int[] waarden =  {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11 };
		String[] deck = new String[52];
		ArrayList <Card> kaarten = new ArrayList();
		
		int teller = 0;
		
		for (int i= 0; i < suit.length; i++) {
			for (int j= 0; j < value.length; j++) {
//				System.out.println(j);
//				System.out.println(i);
				System.out.print(suit[i]);
				System.out.println(value[j]);
				deck[teller]= suit[i] + " - " + value[j];
				Card kaart = new Card();
				kaart.kaartwaarde = waarden[j];
				kaart.kleur = suit[i];
				kaart.waarde = value[j];
				kaarten.add(kaart);
				teller++;
			}
		}
		
		while(true) {
			System.out.println("Wil je een (k)aart?");
			
			String input = scanner.nextLine();
			
			if(input.equals("k")){
				Random random = new Random ();
				int willekeurig = random.nextInt(52);
				System.out.println("=====================================");
				System.out.println(deck[willekeurig]);
				Card deKaart = kaarten.get(willekeurig);
				System.out.println(deKaart);
				System.out.println(deKaart.kleur + " -- " + deKaart.waarde);
				if(deKaart.kaartwaarde == 10) {
					System.out.println("Yes, we hebben een plaatje");
				}else {
					System.out.println("Nee, dit is iets anders");
				}
			}else if(input.equals("p")) {
				System.out.println("passen");
			}else if(input.equals("q")) {
				System.out.println("bedankt voor het spelen");
				break;
			}
		}
			
		
	}

}
