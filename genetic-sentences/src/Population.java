import java.util.*;
public class Population {

	float mutationRate;
	DNA[] population;
	ArrayList<DNA> matingPool;
	String target;
	int generationNumber;
	boolean finishedEvolving;
	int perfScore;
	
	Population(String targ, float mutrate, int size){
		target = targ;
		mutationRate = mutrate;
		population = new DNA[size];
		
		for (int i = 0; i<population.length; i++){
			population[i] = new DNA(target.length());
		}
		calculateFitness();
		matingPool = new ArrayList<DNA>();
		finishedEvolving = false;
		generationNumber = 0;
		
		perfScore = 1;
		
	}
	void calculateFitness(){
		for (int i = 0; i<population.length; i++){
			population[i].getFitness(target);
		}
	}
	/*
	void naturalSelection(){
		matingPool.clear();
		
		float maxFitness = 0;
		for (int i = 0; i<population.length; i++){
			if (population[i].fitness > maxFitness){
				maxFitness = (float) population[i].fitness;
			}
		}
		
		for (int i=0; i<population.length; i++){
			float fitness = 
		}
	}*/
	void generatePopulation(){
		for (int i = 0; i<population.length; i++){
			int a = int(random(matingPool.size()));
			
		}
	}
}
