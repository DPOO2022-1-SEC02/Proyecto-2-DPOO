package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Window;

import javax.swing.border.MatteBorder;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComponent;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameReporteActividades extends JFrame {

	private JPanel contentPane;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameReporteActividades frame = new FrameReporteActividades();
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
	public FrameReporteActividades() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlArriva = new JPanel();
		pnlArriva.setLayout(null);
		pnlArriva.setForeground(Color.BLACK);
		pnlArriva.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlArriva.setBackground(new Color(102, 204, 204));
		pnlArriva.setBounds(0, 0, 600, 40);
		contentPane.add(pnlArriva);
		
		JLabel lblTitle = new JLabel("Project manager");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(227, 11, 134, 20);
		pnlArriva.add(lblTitle);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "�Estas seguro que quieres salir?", "Confirmaci�n", JOptionPane.YES_NO_OPTION)==0) {
					FrameReporteActividades.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblExit.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblExit.setForeground(Color.WHITE);
			}
		});
		lblExit.setHorizontalAlignment(SwingConstants.CENTER);
		lblExit.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblExit.setBounds(558, 11, 32, 19);
		pnlArriva.add(lblExit);
		
		JPanel pnlAzul = new JPanel();
		pnlAzul.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlAzul.setBackground(new Color(224, 255, 255));
		pnlAzul.setForeground(Color.WHITE);
		pnlAzul.setBounds(0, 0, 202, 400);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);
		
		JLabel reporteTxt = new JLabel("<html>Reporte de<br>actividades</html>");
		reporteTxt.setHorizontalAlignment(SwingConstants.CENTER);
		reporteTxt.setFont(new Font("Roboto Black", Font.BOLD, 14));
		reporteTxt.setBounds(10, 187, 182, 39);
		pnlAzul.add(reporteTxt);
		
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMessage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLoginMessage.setBounds(263, 91, 279, 37);
		contentPane.add(lblLoginMessage);
		
		JButton backBtn = new JButton("Regresar");
		backBtn.setBorder(new LineBorder(new Color(0, 110, 197),1));
		backBtn.setBackground(new Color(204, 226, 243));
		backBtn.setForeground(new Color(0, 110, 197));
		backBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				backBtn.setBackground(new Color(135, 149, 250));
		    	JComponent comp = (JComponent) e.getSource();
		        Window win = SwingUtilities.getWindowAncestor(comp);
		        win.dispose();
		        FrameListadoProyectos irAReporte = new FrameListadoProyectos();
		        irAReporte.setVisible(true);
				}
		});

		
		backBtn.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		backBtn.setBounds(450, 334, 109, 40);
		contentPane.add(backBtn);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBorder(new LineBorder(new Color(51, 51, 204)));
		panel.setBounds(212, 62, 352, 258);
		contentPane.add(panel);
		
		
		setLocationRelativeTo(null);
	}
}
