import java.util.Scanner;
public class TicTacToe {
	char [][] matrix = new char[3][3];
	
	public void Fill() {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				matrix[i][j] = '-';
			}
		}
	}
	
	public void Move(int row, int column, char player) {
		matrix[row][column] = player;
	}
	
	public void Display() {
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	
	}
	
	public int Winner() {
		// FOR X
		if(matrix[0][0] == 'X' && matrix[0][1] == 'X' && matrix[0][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[1][0] == 'X' && matrix[1][1] == 'X' && matrix[1][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[2][0] == 'X' && matrix[2][1] == 'X' && matrix[2][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][0] == 'X' && matrix[1][0] == 'X' && matrix[2][0] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][1] == 'X' && matrix[1][1] == 'X' && matrix[2][1] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'X' && matrix[1][2] == 'X' && matrix[2][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][0] == 'X' && matrix[1][1] == 'X' && matrix[2][2] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'X' && matrix[1][1] == 'X' && matrix[2][0] == 'X') {
			System.out.println("X wins!");
			return 1;
		}
		
		// FOR O
		else if(matrix[0][0] == 'O' && matrix[0][1] == 'O' && matrix[0][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[1][0] == 'O' && matrix[1][1] == 'O' && matrix[1][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[2][0] == 'O' && matrix[2][1] == 'O' && matrix[2][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][0] == 'O' && matrix[1][0] == 'O' && matrix[2][0] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][1] == 'O' && matrix[1][1] == 'O' && matrix[2][1] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'O' && matrix[1][2] == 'O' && matrix[2][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][0] == 'O' && matrix[1][1] == 'O' && matrix[2][2] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else if(matrix[0][2] == 'O' && matrix[1][1] == 'O' && matrix[2][0] == 'O') {
			System.out.println("O wins!");
			return 1;
		}
		
		else {
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.Fill();
		int Winner = 0;
		while (Winner == 0) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("'X', choose your row: ");
			int row = keyboard.nextInt();
			System.out.println("'X', choose your column: ");
			int column = keyboard.nextInt();
			game.Move(row, column, 'X');
			game.Display();
			Winner = game.Winner();
		
			if (Winner == 0) {
				System.out.println("'O', choose your row: ");
				row = keyboard.nextInt();
				System.out.println("'O', choose your column: ");
				column = keyboard.nextInt();
				game.Move(row, column, 'O');
				game.Display();
				Winner = game.Winner();
			}

		}
	}

}