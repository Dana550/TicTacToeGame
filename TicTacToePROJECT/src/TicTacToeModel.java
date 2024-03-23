
import java.util.ArrayList;
import java.util.Observable;

public class TicTacToeModel {
	int[][] board;
	int player_turn = 0;
	int current_player =1 ; //1=O, 2=X, 3=EMPTY
	int size_of_board = 4;
	boolean winner1= false;
	boolean winner2=false;
	static int scoreX=0;
	static int scoreO=0;
	
	/*
	public int clicked_b1=0;
	public int clicked_b2=0;
	public int clicked_b3=0;
	public int clicked_b4=0;
	public int clicked_b5=0;
	public int clicked_b6=0;
	public int clicked_b7=0;
	public int clicked_b8=0;
	public int clicked_b9=0;
	*/
	
	TicTacToeModel(){
		createBoard();
	}
	public void createBoard(){
		board = new int[size_of_board][size_of_board];
	}
	// position of players move
		public void playerMove(int x, int y){
			if(player_turn%2 == 0) {
				current_player = 1;
			}
			else{
				current_player = 2;
			}
			
			if(board[x][y] == 0 ){
				board[x][y] = current_player;
			}else{
				System.out.println("illegal move");
			}
			
			checkWinner();
		}
		
		private void checkWinner(){
			//horizontal winner
			if(board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			if(board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			if(board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			
			//Vertical
			if(board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			if(board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			if(board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1){
				winner1 = true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2){
				winner2 = true;
				scoreO++;
				System.out.println("O wins");
			}
			
			//Diagonal
			if(board[0][0]==1 && board[1][1]==1 && board[2][2]==1){
				winner1=true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][0]==2 && board[1][1]==2 && board[2][2]==2) {
				winner2=true;
				scoreO++;
				System.out.println("O wins");
			}
			if(board[0][2]==1 && board[1][1]==1 && board[2][0]==1){
				winner1=true;
				scoreX++;
				System.out.println("X wins");
			}
			if(board[0][2]==2 && board[1][1]==2 && board[2][0]==2){
				winner2=true;
				scoreO++;
				System.out.println("O wins");
			}
		}
		
		public static void replay(){
			int board[][] = { {0},{0},{0},
							{0},{0},{0},
							{0},{0},{0} };
			scoreX=0;
			scoreO=0;
			
		}
}
