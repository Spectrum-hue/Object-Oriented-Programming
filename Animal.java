public class Animal {
	// Decleration of initials variables and values used in the Cheetah- and Lion class.
	private int numTeeth = 0;
	private boolean spots = false;
	private int weight = 0;
	// Below is the constructor applicable to Cheetah- and Lion classes.
	// This will be used to create and additional element of "speed" for the Chheetah class.
	public Animal(int numTeeth, boolean spots, int weight){
		this.setNumTeeth(numTeeth);
		this.setSpots(spots);
		this.setWeight(weight);
		
	}
	// Initial setter and getter methods - additional setter/getter methods as well as other methods will be created in the other subclasses.
    public int getNumTeeth(){
		return numTeeth;
	}

	public void setNumTeeth(int numTeeth) {
		this.numTeeth = numTeeth;
	}
	
	public boolean getSpots() {
		return spots;
	}

	public void setSpots(boolean spots) {
		this.spots = spots;
	}
    // The weight getter and setters will be used in the Cheetah- and Lion class to determine the features of the lion and cheetah.
	public int getWeight() {
		return weight;
	}
    
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}