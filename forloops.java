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
		
		for (int i = 0; i<3; i++) {
				if (matrix[i][0] != '-' && matrix[i][1] != '-' && matrix[i][2] != '-') {
					if (matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2]) {
						System.out.println(matrix[i][0] + " wins!");
						return 1;
			
					}
					
				}
				
		}
					
		for (int j = 0; j<3; j++) {
				if (matrix[0][j] != '-' && matrix[1][j] != '-' && matrix[2][j] != '-') {
					if (matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j]) {
						System.out.println(matrix[0][j] + " wins!");
						return 1;
		
					}
				}
				
		}
		
		if (matrix[0][0] != '-' && matrix[1][1] != '-' && matrix[2][2] != '-') {
			if (matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]) {
					System.out.println(matrix[0][0] + " wins!");
					return 1; }
		}
					
		if (matrix[0][2] != '-' && matrix[1][1] != '-' && matrix[2][0] != '-') {
			if (matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]) {
					System.out.println(matrix[0][2] + " wins!");
					return 1; }
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		TicTacToe game = new TicTacToe();
		game.Fill();
		int Winner = 0;
		int timesPlayed = 0;
		while (Winner == 0 && timesPlayed <= 8) {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("'X', choose your row: ");
			int row = keyboard.nextInt();
			System.out.println("'X', choose your column: ");
			int column = keyboard.nextInt();
			game.Move(row, column, 'X');
			game.Display();
			timesPlayed++;
			Winner = game.Winner();
		
			if (Winner == 0 && timesPlayed <= 8) {
				System.out.println("'O', choose your row: ");
				row = keyboard.nextInt();
				System.out.println("'O', choose your column: ");
				column = keyboard.nextInt();
				game.Move(row, column, 'O');
				game.Display();
				timesPlayed++;
				Winner = game.Winner();
			}

		}
		
		if (timesPlayed > 8 && Winner == 0) {
			System.out.println("It's a tie!");
		}
	}

}
