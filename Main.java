import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) throws FileNotFoundException {
		Random rand=new Random();
		Scanner adj=new Scanner(new File("src/adjectives.txt"));
		Scanner noun=new Scanner(new File("src/nouns.txt"));
		Scanner console=new Scanner(System.in);
		String[] adjectives=new String[28479];
		String[] nouns=new String[90963];
		for(int i=0;i<adjectives.length;i++) {
			adjectives[i]=adj.next();
		}
		for(int i=0;i<nouns.length;i++) {
			nouns[i]=noun.next();
		}
		System.out.print("How many? ");
		takeInt(console);
		int lim=console.nextInt();
		System.out.print("What is the minimum length? ");
		takeInt(console);
		int min=console.nextInt();
		System.out.print("What is the maximum length? (Put -1 if you don't want to have a max length) ");
		takeInt(console);
		int max=console.nextInt();
		if(max==-1) max=100;
		for(int i=0;i<lim;) {
			String username=adjectives[rand.nextInt(adjectives.length)]+nouns[rand.nextInt(nouns.length)];
			if(username.length()>=min&&username.length()<=max) {
				System.out.println(username);
				i++;
			}
		}
  }
	public static void takeInt(Scanner in) {
		while(!in.hasNextInt()) {
			System.out.print("Please enter a number: ");
			in.nextLine();
		}		
	}
}