import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FootBol extends JFrame {
	int sMilan = 0, sReal = 0;
	private JButton milan = new JButton("AC Milan");
	private JButton real = new JButton("Real Madrid");
	private JLabel result = new JLabel("Result:0x0");
	private JLabel score = new JLabel("Last Score:");
	private Label Победитель = new Label ("Winner:");

	public FootBol(){
		super ("Что угодно");
		this.setBounds(100, 100, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container window = this.getContentPane();
		window.setLayout(new GridLayout(2,3,2,2));
		window.add(milan);
		window.add(result);

		window.add(real);
		window.add(score);
		window.add(Победитель);
		ButtonGroup buttonGroup = new ButtonGroup(); //группа кнопок
		milan.addActionListener(new ButtonEventListenner1());
		real.addActionListener(new ButtonEventListenner2());
	}

	private class ButtonEventListenner1 implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			sMilan++;
			score.setText("Last Score: AC Milan");
			WhoПобедитель(sMilan,sReal);
			result.setText("Result:"+sMilan+"x"+sReal);
		}
	}



	private class ButtonEventListenner2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			sReal++;
			score.setText("Last Score: Real Madrid");
			WhoПобедитель(sMilan,sReal);
			result.setText("Result:"+sMilan+"x"+sReal);
		}
	}
	private void WhoПобедитель(int sMilan, int sReal) {
		if (sMilan>sReal){
			Победитель.setText("Winner:AC Milan");
		}
		if (sMilan<sReal){
			Победитель.setText("Winnet: Real Madrid");
		}
		if (sMilan == sReal){
			Победитель.setText("Ничья");
		}
	}

	public static void main(String[] args) {
	FootBol Приложение = new FootBol();
	Приложение.setVisible(true);
	}
}