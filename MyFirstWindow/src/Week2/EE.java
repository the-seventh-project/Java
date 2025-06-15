package Week2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class EE extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf1;
	private int count = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EE frame = new EE();
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
	public EE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 570, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf1 = new JTextField();
		tf1.setBounds(43, 44, 139, 58);
		contentPane.add(tf1);
		tf1.setColumns(10);
		
		//
		JLabel l1 = new JLabel("");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		l1.setBounds(53, 113, 354, 52);
		contentPane.add(l1);
		
		JButton b1 = new JButton("Guess");
		b1.setBounds(262, 62, 89, 23);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				count++;
				
				//get text , read from the value from the text field
				//String s = tf1.getText();
				//set the name into s
				//l1.setText("Welcome " + s);
				
				//generates a random number 1-5
				int p = (int)(Math.random()*5)+1;
				
				//user input read as integer
				String m = tf1.getText();
				int q = Integer.valueOf(m);
				
						String r = "";
						if(p==q) {
							 r = "You win!! " + "In " + count + " clicks";
						}
						else	{
							 r = "You lose:(";
						}
						l1.setText(r);
						
				//l1.setText(""+p);
				l1.setText( String.valueOf(r));
				//if you want integer in string
				//Integer.valueOf();
			}
		});
		contentPane.add(b1);
		
		JLabel lblNewLabel = new JLabel("Enter a number between 1-5");
		lblNewLabel.setBounds(43, 19, 206, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(EE.class.getResource("/Week2/images.jpeg")));
		lblNewLabel_1.setBounds(168, 208, 218, 169);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(55, 131, 127, 58);
		contentPane.add(lblNewLabel_2);
		
		
	}
}
