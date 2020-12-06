public class Application {

	 public static void main(String[] args ){ 
		 // The purpose of the program is to provide informal details of a lion and a cheetah using inheritance, setters and getters, arraylist and booleans expressions.
		 // The program will also be usefule if the parameters - see line 10 and 14 - is changed to describe the animal features.
		 // This program will print out methods and data created in the derived(subclasses).
		 // The subclasses is called "Animal", "Lion", and "Cheetah"
		System.out.println("LION" + "\n");
		// Below is the creation of the Lion objet with it's elements
		Lion lion = new Lion(30, false, 80);
		System.out.println(lion.toString() +"\n");
		System.out.println("CHEETAH (Name: Hunter)" + "\n");
		// Below is the creation of the Cheetah object with its elements.
		Cheetah cheetah = new Cheetah(30, true, 120, 100 );
		System.out.println(cheetah.toString() + "\n");
		
	 }
        
}      
   	 
   	 

       
    
        
        
        
        
        
	

	
		
	


	