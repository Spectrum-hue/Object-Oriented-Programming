import java.util.ArrayList;

class Cheetah extends Animal {
	// Declarations
	int Speed;
	String type = "";
	// Declaration (in fields) of empty array below which will be used as a array list
	public static String []  CheetahNames;
	public static String EyeSight = "20km";
	public static double Height = 1.1;
	public static String Name = "Hunter";
	
	// Method for creating an arraylist by adding names to the original emty arraylist
	public ArrayList<String> CheetahNames() {
    ArrayList<String> CheetahNames = new ArrayList<String>();
    CheetahNames.add("Spotter");
    CheetahNames.add("Jasper");
	CheetahNames.add("Sparky");
	return CheetahNames;
	}
	//Below is additional methods created relating to the cheetah.
	public static String getEyeSight() {
		return EyeSight;
	}
    public static void setEyeSight(String newEyeSight) {
    	EyeSight = newEyeSight;
    	
    }
    public static double getHeight() {
    	return Height;
    }
    public static void setHeight(double newHeight) {
    	Height = newHeight;
    }
    public static String getName( ) {
    	return Name;
    }
    public static void setName(String newName) {
    	Name = newName;
    	
    }
    // "Speed" inherited from the Animal class.
public Cheetah(int numTeeth, boolean spots, int weight, int Speed) {
    super(numTeeth, spots, weight);
    this.Speed = Speed;
    type(weight);

}
    //set method with control flow - the type will be printed out according to the parameters set in the creation of the Cheetah object in the main class.
	public String type(int weight){
        super.setWeight(weight);   
		if(weight <= 70){
            type = "Cub";
            
        }
        else if(weight <= 110){
            type = "Female";
            
        }
        else{
            type = "Male";
        }
        return type;
    }
        
    
    
	// This toString() method below will print out all relevant information in the main class.
    public String toString() { 
        String output = "Number of Teeth: " + getNumTeeth(); 
        output += "\nDoes it have spots?: " + getSpots();
        output += "\nHow much does it weight: " + getWeight();
        output += "\nType of Cheetah: " + type;
        output += "\nSpeed of Cheetah: " + Speed;
        output += "\nEyeSight of Cheetah: " + getEyeSight();
        output += "\nHeight of Cheetah: " + getHeight();
        output += "\nName of Cheetah: " + getName();
        output += "\nPossible new name for Hunter - the Cheetah:" + CheetahNames();
        return output;
       
        }
	
     }

     
            
    


       	
       	
    	   
       
	
		
	
 






	









	














