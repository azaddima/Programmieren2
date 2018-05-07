package windowBuilderTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class WindowBuilderFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WindowBuilderFrame frame = new WindowBuilderFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public WindowBuilderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		JButton button_6 = new JButton("");
		panel.add(button_6);
		
		JButton button_3 = new JButton("");
		panel.add(button_3);
		
		JButton button_1 = new JButton("");
		panel.add(button_1);
		
		JButton button_4 = new JButton("");
		panel.add(button_4);
		
		JButton button_2 = new JButton("");
		panel.add(button_2);
		
		JButton button = new JButton("");
		panel.add(button);
		
		JButton button_5 = new JButton("");
		panel.add(button_5);
	}

}
