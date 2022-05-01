package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class FrameNewAct extends JFrame {

	private JPanel contentPane;
	private JTextField txtIdActv;
	private JTextField txtNombre;
	private JLabel lblMessage = new JLabel("");
	private JTextField txtActividad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameNewAct frame = new FrameNewAct();
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
	public FrameNewAct() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnlArriba = new JPanel();
		pnlArriba.setLayout(null);
		pnlArriba.setForeground(Color.BLACK);
		pnlArriba.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlArriba.setBackground(new Color(102, 204, 204));
		pnlArriba.setBounds(0, 0, 600, 40);
		contentPane.add(pnlArriba);
		
		JLabel lblTitle = new JLabel("Project manager");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(227, 11, 134, 20);
		pnlArriba.add(lblTitle);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?", "Confirmación", JOptionPane.YES_NO_OPTION)==0) {
					FrameNewAct.this.dispose();
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
		pnlArriba.add(lblExit);
		
		JPanel pnlAzul = new JPanel();
		pnlAzul.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlAzul.setBackground(new Color(224, 255, 255));
		pnlAzul.setForeground(Color.WHITE);
		pnlAzul.setBounds(0, 334, 600, 66);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);
		
		JPanel pnlBtnRegresar = new JPanel();
		pnlBtnRegresar.setBounds(10, 11, 132, 44);
		pnlAzul.add(pnlBtnRegresar);
		pnlBtnRegresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO:
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnRegresar.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnRegresar.setBackground(new Color(135, 206, 250));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnRegresar.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnRegresar.setBackground(new Color(135, 206, 250));
			}
		});
		

		pnlBtnRegresar.setLayout(null);
		pnlBtnRegresar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnRegresar.setBackground(new Color(135, 206, 250));
		
		JLabel lbRegresar = new JLabel("Regresar");
		lbRegresar.setHorizontalAlignment(SwingConstants.CENTER);
		lbRegresar.setForeground(new Color(30, 144, 255));
		lbRegresar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbRegresar.setBackground(Color.WHITE);
		lbRegresar.setBounds(0, 0, 132, 44);
		pnlBtnRegresar.add(lbRegresar);
		
		JPanel pnlBtnAdd = new JPanel();
		pnlBtnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (txtNombre.getText().equals("") || txtActividad.getText().equals("") || txtIdActv.getText().equals("") || 
					txtNombre.getText().equals("Nombre Encargado") || txtActividad.getText().equals("Nombre Actividad") || txtIdActv.getText().equals("ID Actividad")) {
					lblMessage.setText("¡ Ingresa todos los datos !");
				}
				else {
					// TODO: Agregar Actividad Lo feo
					
					lblMessage.setText("");
					JOptionPane.showMessageDialog(null, "¡ Agrego con exito !");
				}
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(135, 206, 250));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(153, 204, 255));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				pnlBtnAdd.setBackground(new Color(135, 206, 250));
			}
		
		});
		pnlBtnAdd.setLayout(null);
		pnlBtnAdd.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnAdd.setBackground(new Color(135, 206, 250));
		pnlBtnAdd.setBounds(458, 11, 132, 44);
		pnlAzul.add(pnlBtnAdd);
		
		JLabel lbAdd = new JLabel("Agregar");
		
		lbAdd.setHorizontalAlignment(SwingConstants.CENTER);
		lbAdd.setForeground(new Color(30, 144, 255));
		lbAdd.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbAdd.setBackground(Color.WHITE);
		lbAdd.setBounds(0, 0, 132, 44);
		pnlBtnAdd.add(lbAdd);
		
		txtIdActv = new JTextField();
		txtIdActv.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtIdActv.getText().equals("ID Actividad")) {
					txtIdActv.setText("");
				}
				else {
					txtIdActv.selectAll();
					// TODO
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtIdActv.getText().equals("")) {
					txtIdActv.setText("ID Actividad");
				}
				
			}
		});
		txtIdActv.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtIdActv.setForeground(new Color(100, 149, 237));
		txtIdActv.setBackground(new Color(240, 255, 255));
		txtIdActv.setText("ID Actividad");
		txtIdActv.setHorizontalAlignment(SwingConstants.LEFT);
		txtIdActv.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtIdActv.setColumns(10);
		txtIdActv.setBounds(155, 211, 280, 37);
		contentPane.add(txtIdActv);
		
		txtNombre = new JTextField();
		txtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombre.getText().equals("Nombre Encargado")) {
					txtNombre.setText("");
				}
				else {
					txtNombre.selectAll();
					// TODO
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNombre.getText().equals("")) {
					txtNombre.setText("Nombre Encargado");
				}
				
			}
		});
		txtNombre.setText("Nombre Encargado");
		txtNombre.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombre.setForeground(new Color(100, 149, 237));
		txtNombre.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtNombre.setBackground(new Color(240, 255, 255));
		txtNombre.setBounds(155, 259, 280, 37);
		contentPane.add(txtNombre);
		
		lblMessage.setForeground(new Color(139, 0, 0));
		lblMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblMessage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblMessage.setBounds(155, 115, 279, 37);
		contentPane.add(lblMessage);
		
		txtActividad = new JTextField();
		txtActividad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtActividad.getText().equals("Nombre Actividad")) {
					txtActividad.setText("");
				}
				else {
					txtActividad.selectAll();
					// TODO
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtActividad.getText().equals("")) {
					txtActividad.setText("Nombre Actividad");
				}
				
			}
		});
		txtActividad.setText("Nombre Actividad");
		txtActividad.setHorizontalAlignment(SwingConstants.LEFT);
		txtActividad.setForeground(new Color(100, 149, 237));
		txtActividad.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtActividad.setColumns(10);
		txtActividad.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtActividad.setBackground(new Color(240, 255, 255));
		txtActividad.setBounds(155, 163, 280, 37);
		contentPane.add(txtActividad);
		
		JLabel lblTitulo = new JLabel("Agregar una actividad");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lblTitulo.setForeground(new Color(51, 102, 204));
		lblTitulo.setBounds(155, 68, 280, 40);
		contentPane.add(lblTitulo);
		
		
		setLocationRelativeTo(null);
	}
}
