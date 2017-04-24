package customCross;

public class CrosswordApp {
	
	public static void main(String[] args){
		CrosswordApp ca = new CrosswordApp();
		System.out.println("Generating new crossword");
		ca.generateCrossword();
	}
	
	public void generateCrossword(){
		BackingGrid bg = new BackingGrid();
		bg.insertWordDown("0123456789", 0, 0);
		bg.insertWordDown("0123456789", 0, 9);
		
		//bg.insertWordAcross("0123456789", 0, 0);
		//bg.insertWordAcross("0123456789", 9, 0);
		bg.printGrid();
		//bg.printBlankGrid();
		
	}

}
