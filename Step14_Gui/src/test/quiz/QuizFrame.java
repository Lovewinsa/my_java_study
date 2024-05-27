package test.quiz;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class QuizFrame extends JFrame implements ActionListener{
	JTextField inputMsg;
	JTextField outputMsg;
	public QuizFrame() {
		setTitle("quiz frame");
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
		setLayout(layout);
		
		inputMsg = new JTextField(10);
		add(inputMsg);
		
		JButton sendBtn = new JButton("전송");
		add(sendBtn);
		sendBtn.addActionListener(this);
		
		outputMsg = new JTextField(10);
		add(outputMsg);
		
		this.setVisible(true);
		
	}
	public static void main(String[] args) {
		new QuizFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = inputMsg.getText();
		outputMsg.setText(msg);
		inputMsg.setText("");
	}
}
