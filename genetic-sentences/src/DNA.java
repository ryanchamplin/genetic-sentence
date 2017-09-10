import java.util.Random;

public class DNA {
	
	// random stuff.
	// pretty much useless tho.
	// besides helping it work.
	// semantics. 
	char[] genes;
	double fitness;
	String alphabet="0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()_+=- '\"\\";
	Random r = new Random();
	int n = alphabet.length();
	
	// Constructor. Initializes a random gene. 
	DNA(int num){
		genes = new char[num];
		for(int i = 0; i<genes.length; i++){
			genes[i] = alphabet.charAt(r.nextInt(n));
		}
	}
	
	// returns the array of characters as a string.
	String getSentence(){
		return new String(genes);
	}
	
	// counts the fitness by comparing gene character and correct character.  
	void getFitness (String correctSentence) {
		int score = 0;
		for (int i = 0; i<genes.length; i++){
			if (genes[i] == correctSentence.charAt(i)){
				score++;
			}
		}
		fitness = Math.pow(2, score); // Is a power to normalize the score.
		//allows for more factors if needed.
	}
	
	
	DNA crossover(DNA partner){
		DNA child = new DNA(genes.length);
		
		int midpoint = r.nextInt(genes.length);
		for (int i = 0; i<genes.length; i++){
			if(i > midpoint){
				child.genes[i] = genes[i];
			}
			else
				child.genes[i] = partner.genes[i];
		}
		return child;
	}
	
	// Allows for some mutation and keeps from getting stuck on a local maximum.
	// Also allows for forward progress if it gets stuck.
	void mutation(float mutateRate){
		for(int i=0; i<genes.length; i++){
			if(r.nextInt(1) < mutateRate){
				genes[i] = alphabet.charAt(r.nextInt(n));
			}
		}
	}
}
