package JFrameTest;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame windows1 = new JFrame("第一个窗口");
		JFrame windows2 = new JFrame("第二个窗口");
		Container con = windows1.getContentPane();
		con.setBackground(Color.blue);
		windows1.setBounds(60,100,188,108);
		windows2.setBounds(260,100,188,108);
		windows1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);//关闭窗口1
		windows2.setVisible(true);
		windows1.setVisible(true);
		windows1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
