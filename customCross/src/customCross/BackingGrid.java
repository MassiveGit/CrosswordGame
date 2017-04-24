package customCross;

/* Grid of 100*100 squares to start  with.
 *  Possibly start with a smaller grid, and add rows/collumns if absolutely necessary to decrease search space. */
public class BackingGrid {
	
	private static final int HEIGHT = 10;
	private static final int WIDTH = 10;
	
	private char[][] grid;
	
	
	public BackingGrid(){
		grid = new char[HEIGHT][WIDTH];
	}
	
	
	public void printGrid(){
		for(char[] row : grid){
			for(char c : row){
				System.out.print((c != '\u0000') ? c : "0");
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
	public void printBlankGrid(){
		for(char[] row : grid){
			for(char c : row){
				System.out.print(0 +" ");
			}
			System.out.print("\n");
		}
	}
	
	public void insertWordDown(String word, int row, int col){
		int i = 0;
		for(char c : word.toCharArray()){
			insertChar(c, row + i, col);
			i++;
		}
	}
	
	public void insertWordAcross(String word, int row, int col){
		int i = 0;
		for(char c : word.toCharArray()){
			insertChar(c, row, col - i);
			i++;
		}
	}
	
	public void insertChar(char c, int row, int col){
		String result = "INSERT '" + c + "' AT COORDS: " + row + " " + col + " "; 
		if(row > WIDTH || col > HEIGHT){
			System.err.println(result +  "FAILED. OUT OF BOUNDS. MAX BOUNDS: " + WIDTH + " " + HEIGHT);
		}
		if(grid[row][col] != '\u0000' && grid[row][col] != c){
			System.err.println(result + "FAILED. POSITION ALREADY CONTAINS: " + grid[row][col]);
		} else {
			grid[row][col] = c;
			System.err.println(result + " SUCCEEDED");
		}
		
	};
	
	public enum DIRECTION {
		ACROSS, DOWN;
	}
	
	
	

}
