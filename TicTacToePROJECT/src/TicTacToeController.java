
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TicTacToeController implements ActionListener{
	public TicTacToeView view;
	public TicTacToeModel model;
	
	public TicTacToeController(TicTacToeView view, TicTacToeModel model) {
		this.view = view;
		this.model = model;
		
		view.m_b01.addActionListener(this);
		view.m_b02.addActionListener(this);
		view.m_b03.addActionListener(this);
		view.m_b04.addActionListener(this);
		view.m_b05.addActionListener(this);
		view.m_b06.addActionListener(this);
		view.m_b07.addActionListener(this);
		view.m_b08.addActionListener(this);
		view.m_b09.addActionListener(this);
		view.replay.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == view.m_b01 && model.board[0][0]==0){
			model.playerMove(0,0);
			if(model.current_player == 1) {
				view.m_b01.setText("X");
				view.m_b01.setBackground(Color.cyan);
			}
				
			else{
				view.m_b01.setText("O");
				view.m_b01.setBackground(Color.pink);
			}
		} else if(e.getSource() == view.m_b02 && model.board[0][1]==0){
			model.playerMove(0,1);
			if(model.current_player == 1) {
				view.m_b02.setText("X");
				view.m_b02.setBackground(Color.cyan);

			}
				
			else{
				view.m_b02.setText("O");
				view.m_b02.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b03 && model.board[0][2]==0){
			model.playerMove(0,2);
			if(model.current_player == 1) {
				view.m_b03.setText("X");
				view.m_b03.setBackground(Color.cyan);

			}
				
			else{
				view.m_b03.setText("O");
				view.m_b03.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b04 && model.board[1][0]==0){
			model.playerMove(1,0);
			if(model.current_player == 1) {
				view.m_b04.setText("X");
				view.m_b04.setBackground(Color.cyan);

			}
				
			else{
				view.m_b04.setText("O");
				view.m_b04.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b05 && model.board[1][1]==0){
			model.playerMove(1,1);
			if(model.current_player == 1) {
				view.m_b05.setText("X");
				view.m_b05.setBackground(Color.cyan);

			}
				
			else{
				view.m_b05.setText("O");
				view.m_b05.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b06 && model.board[1][2]==0){
			model.playerMove(1,2);
			if(model.current_player == 1) {
				view.m_b06.setText("X");
				view.m_b06.setBackground(Color.cyan);

			}
				
			else{
				view.m_b06.setText("O");
				view.m_b06.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b07 && model.board[2][0]==0){
			model.playerMove(2,0);
			if(model.current_player == 1) {
				view.m_b07.setText("X");
				view.m_b07.setBackground(Color.cyan);

			}
				
			else{
				view.m_b07.setText("O");
				view.m_b07.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b08 && model.board[2][1]==0){
			model.playerMove(2,1);
			if(model.current_player == 1) {
				view.m_b08.setText("X");
				view.m_b08.setBackground(Color.cyan);

			}
			
			else{
				view.m_b08.setText("O");
				view.m_b08.setBackground(Color.pink);

			}
		} else if(e.getSource() == view.m_b09 && model.board[2][2]==0){
			model.playerMove(2,2);
			if(model.current_player == 1) {
				view.m_b09.setText("X");
				view.m_b09.setBackground(Color.cyan);

			}
				
			else{
				view.m_b09.setText("O");
				view.m_b09.setBackground(Color.pink);

			}
		}
		if(e.getSource() == view.replay) {
			model.replay();
			view.m_b01.setText("");
			view.m_b02.setText("");
			view.m_b03.setText("");
			view.m_b04.setText("");
			view.m_b05.setText("");
			view.m_b06.setText("");
			view.m_b07.setText("");
			view.m_b08.setText("");
			view.m_b09.setText("");
			view.m_b01.setBackground(Color.white);
			view.m_b02.setBackground(Color.white);
			view.m_b03.setBackground(Color.white);
			view.m_b04.setBackground(Color.white);
			view.m_b05.setBackground(Color.white);
			view.m_b06.setBackground(Color.white);
			view.m_b07.setBackground(Color.white);
			view.m_b08.setBackground(Color.white);
			view.m_b09.setBackground(Color.white);
			System.out.println("The replay button is cliked");
			TicTacToeModel.scoreX=0;
			TicTacToeModel.scoreO=0;
			model.winner1=false;
			model.winner2=false;
			view.scoreLabel.setText("X:"+ TicTacToeModel.scoreX+"\n"+ " O:"+TicTacToeModel.scoreO+"\n");
			view.scoreLabel.setText("X:"+ TicTacToeModel.scoreX+"\n"+ " O:"+TicTacToeModel.scoreO+"\n");
			model.createBoard();
			model.playerMove(3, 3);
			
			
		}
		
		if(model.winner1 == true) {
			//System.out.println("HERE x: The winner is x based on the boolean winner1");
			view.scoreLabel.setText("X:"+ TicTacToeModel.scoreX+"\n"+ " O:"+TicTacToeModel.scoreO+"\n");
			TicTacToeModel.replay();
			
		}
		if(model.winner2 == true) {
			//System.out.println("HERE o: The winner is O based on the boolean winner2");
			view.scoreLabel.setText("X:"+ TicTacToeModel.scoreX+"\n"+ " O:"+TicTacToeModel.scoreO+"\n");
		}
		model.player_turn++;
	}
	
	
	
}