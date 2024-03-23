
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MainClass {

	public static void main(String[] args)  {

		TicTacToeModel      model      = new TicTacToeModel();
		TicTacToeView       view       = new TicTacToeView(model);
        TicTacToeController controller = new TicTacToeController( view, model);
        
        view.setVisible(true);

	}

}
 