class Lion extends Animal {    // start with public or just class
    // Below is the declaration of an emty string - "type"
	String type = "";
    // Below is the constructor 
    public Lion(int numTeeth, boolean spots, int weight) {
        super(numTeeth, spots, weight);
        type(weight);
    }
    //set method with control flow - the type will be printed out according to the parameters set in the creation of the Lion object in the main class.
    public String type(int weight){
        super.setWeight(weight);      
        
		if(weight <= 80){
            type = "Cub"; 
        }
        else if(weight <= 120){
            type = "Female";
        }
        else{
            type = "Male";
        }
        return type;
    }
    // Below is a to string method to print out a description of lion object with get method.
    public String toString() { 
        String output = "Number of Teeth: " + getNumTeeth(); 
        output += "\nDoes it have spots?: " + getSpots();
        output += "\nHow much does it weight: " + getWeight();
        output += "\nType of Lion: " + type;   
        return output;
        
    }
    
}