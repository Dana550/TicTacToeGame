
import java.awt.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TicTacToeView extends JFrame{
	
	//Components:
	public JButton   m_b01  = new JButton();
	public JButton   m_b02 = new JButton();
	public JButton   m_b03= new JButton();
	public JButton   m_b04    = new JButton();
	public JButton   m_b05  = new JButton();
	public JButton   m_b06 = new JButton();
	public JButton   m_b07= new JButton();
	public JButton   m_b08    = new JButton();
	public JButton   m_b09    = new JButton();
	public JButton replay = new JButton("REPLAY");
	
	
	public TicTacToeModel model;
	
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel scoreLabel= new JLabel();
	JLabel winnerLabel=new JLabel();
	
    ImageIcon image;
    
    public TicTacToeView(TicTacToeModel model2){
    	
		super("TIC TAC TOE");
		panel.setBackground(Color.cyan);;
		setSize(400,400);
	
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(4,4));
		panel.add(m_b01);
		panel.add(m_b02);
		panel.add(m_b03);
		panel.add(m_b04);
		panel.add(m_b05);
		panel.add(m_b06);
		panel.add(m_b07);
		panel.add(m_b08);
		panel.add(m_b09);
		panel.add(replay);
		panel.add(winnerLabel);
		winnerLabel.setBackground(Color.cyan);
		winnerLabel.setText("WINNERS: ");
		panel.add(scoreLabel);
		scoreLabel.setText("X:0 O:0");
	
		add(panel);
		setVisible(true);
		
		image = new ImageIcon("LOGO.png");
		setIconImage(image.getImage());
		getContentPane().setBackground(Color.blue);
	}
    
    
}
