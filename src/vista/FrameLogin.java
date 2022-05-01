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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.border.MatteBorder;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class FrameLogin extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCorreo;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLogin frame = new FrameLogin();
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
	public FrameLogin() {
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
					FrameLogin.this.dispose();
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
		
		JPanel pnlBtnLogin = new JPanel();
		pnlBtnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(txtNombre.getText().equals("sofia") && txtCorreo.getText().equals("sofia")) {
					//TODO: Hacer que ingrese 
					lblLoginMessage.setText("");
					JOptionPane.showMessageDialog(null, "� Ingreso con exito !");
				}
				else if (txtNombre.getText().equals("") || txtCorreo.getText().equals("") ||
						txtNombre.getText().equals("Nombre") || txtCorreo.getText().equals("Correo")) {
					lblLoginMessage.setText("� Ingresa todos los datos !");
				}
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(135, 206, 250));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnLogin.setBackground(new Color(135, 206, 250));
			}
		
		});
		pnlBtnLogin.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnLogin.setBackground(new Color(135, 206, 250));
		pnlBtnLogin.setBounds(410, 301, 132, 51);
		contentPane.add(pnlBtnLogin);
		pnlBtnLogin.setLayout(null);
		
		JLabel lbLogin = new JLabel("LOG IN");
		lbLogin.setForeground(new Color(30, 144, 255));
		lbLogin.setBackground(Color.WHITE);
		lbLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbLogin.setBounds(38, 11, 71, 28);
		pnlBtnLogin.add(lbLogin);
		
		JPanel pnlAzul = new JPanel();
		pnlAzul.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlAzul.setBackground(new Color(224, 255, 255));
		pnlAzul.setForeground(Color.WHITE);
		pnlAzul.setBounds(0, 0, 202, 400);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);
		
		JLabel lblBienvenido = new JLabel("Bienvenid@!");
		lblBienvenido.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(10, 168, 182, 39);
		pnlAzul.add(lblBienvenido);
		
		JLabel lblPorFavor = new JLabel("Por favor ingresa ");
		lblPorFavor.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblPorFavor.setHorizontalAlignment(SwingConstants.CENTER);
		lblPorFavor.setBounds(10, 206, 182, 47);
		pnlAzul.add(lblPorFavor);
		
		JLabel lblTusDatos = new JLabel("tus datos");
		lblTusDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblTusDatos.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTusDatos.setBounds(10, 241, 182, 39);
		pnlAzul.add(lblTusDatos);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombre.getText().equals("Nombre")) {
					txtNombre.setText("");
				}
				else {
					txtNombre.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNombre.getText().equals("")) {
					txtNombre.setText("Nombre");
				}
				
			}
		});
		txtNombre.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtNombre.setForeground(new Color(100, 149, 237));
		txtNombre.setBackground(new Color(240, 255, 255));
		txtNombre.setText("Nombre");
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBounds(263, 148, 280, 37);
		contentPane.add(txtNombre);
		
		txtCorreo = new JTextField();
		txtCorreo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtCorreo.getText().equals("Correo")) {
					txtCorreo.setText("");
				}
				else {
					txtCorreo.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtCorreo.getText().equals("")) {
					txtCorreo.setText("Correo");
				}
				
			}
		});
		txtCorreo.setText("Correo");
		txtCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		txtCorreo.setForeground(new Color(100, 149, 237));
		txtCorreo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtCorreo.setBackground(new Color(240, 255, 255));
		txtCorreo.setBounds(263, 213, 280, 37);
		contentPane.add(txtCorreo);
		
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMessage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLoginMessage.setBounds(263, 91, 279, 37);
		contentPane.add(lblLoginMessage);
		
		
		setLocationRelativeTo(null);
	}
}