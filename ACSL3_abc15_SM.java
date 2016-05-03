import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ACSL3_abc15_SM {
	
	/*public static String enter_x (String[] input, char[][] grid) //Conversion method
	{

		int val = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < 4; i++) {
			val = Integer.parseInt(input[i]); 
			System.out.println(val);
			row = val/6;
			col = val%6;
			//System.out.print("row: "+ row + " AND col" + col);
			String str = Character.toString(grid[row][col]);
			//grid[row][col] = str.replace(str, 'X');	
		}
		//enter_hints(input, grid);
		return "";
	}  
	
	public static String enter_hints (String[] input, char[][] grid) //Conversion method
	{
		int clue = Integer.parseInt(input[4]);
		for (int i = 5; i < (5 + (2*clue)); i++) {
			int val = Integer.parseInt(input[i+1]);
			int row = val/6;
			int col = val%6; 
			grid[row][col] = input[i].charAt(0);
			if (col==0){ 
				if(grid[row][col] != 'X'){  
					col+=1; 
					}
					grid[row][col] = input[i].charAt(0); 
				}
			else if (col==5){ 
				if(grid[row][col] != 'X')
				{ col-=1; 
				}
				grid[row][col] = input[i].charAt(0);
			}
			else if (row==0){ 
				if(grid[row][col] != 'X'){ row+=1; }
				grid[row][col] = input[i].charAt(0);
			}
			else if (row==5){ 
				if(grid[row][col] != 'X'){ 
				row-=1; }
				grid[row][col] = input[i].charAt(0);
			}
			i+=2;
		}
		for (int i = 0; i<4; i++){
			for (int j = 0; j < 4; j++) {
				System.out.println(grid[i][j]);
			}
		} 
		return "";
	}  
	*/

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		String[] answer = {"ABCBACCBACAB", "ACBBACBCACAB", "BACACBACBCBA", "ABCCABABCBCA", "ABCCABBCABCA"};
		for (int i = 0; i < 5; i++) { 	
			//Declarations
			String[] input = scan.nextLine().split(", "); //stores input
		    char[][] board = {
		    		{'.', '.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.', '.'},
                    {'.', '.', '.', '.', '.', '.'}};
		    /*for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					System.out.print(board[i][j]);
				}
			}*/

			//enter_x(input, board); 
		    System.out.println(answer[i]);
		    
		}
	}

}
