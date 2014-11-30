package pl.wbd.ui.frames;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import pl.wbd.panels.LoginPanel;
import pl.wbd.ui.LoginBar;


@SuppressWarnings("serial")
public class MotorcycleMain extends JFrame{

	private LoginPanel loginPanel;
	protected LoginBar loginBar;
	public static MotorcycleMain connector;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					connector = new MotorcycleMain();
				} catch (Exception e) {
					System.err.println("Error executing MotorcycleMain");
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MotorcycleMain() {
		loginPanel = new LoginPanel(this);
		getContentPane().add(loginPanel);
		loginBar = new LoginBar();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setTitle("Salon motocyklowy - LOGIN");
		setBounds(5, 5, 290, 257);
		loginPanel.setVisible(true);
		setJMenuBar(loginBar);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setAlwaysOnTop(true);
		setVisible(true);
	}

	public static MotorcycleMain getMainFrame() {
		return connector;
	}
}
