package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class FrameCrearProyecto extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreProyecto;
	private JTextField txtDescripcion;
	private JTextField txtNombreDuenio;
	private JTextField txtCorreoDuenio;
	private JTextField txtFechaFinal;
	private JTextField txtTipo;
	private JPanel btnAgregar;
	private JLabel lblAgregar;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameCrearProyecto frame = new FrameCrearProyecto();
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
	public FrameCrearProyecto() {
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
					FrameCrearProyecto.this.dispose();
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
		pnlAzul.setBounds(0, 0, 186, 400);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);

		txtNombreProyecto = new JTextField();
		txtNombreProyecto.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombreProyecto.getText().equals("Nombre Proyecto")) {
					txtNombreProyecto.setText("");
				}
				else {
					txtNombreProyecto.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNombreProyecto.getText().equals("")) {
					txtNombreProyecto.setText("Nombre Proyecto");
				}
				
			}
		});
		txtNombreProyecto.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtNombreProyecto.setForeground(new Color(100, 149, 237));
		txtNombreProyecto.setBackground(new Color(240, 255, 255));
		txtNombreProyecto.setText("Nombre proyecto");
		txtNombreProyecto.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombreProyecto.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtNombreProyecto.setColumns(10);
		txtNombreProyecto.setBounds(196, 51, 280, 37);
		contentPane.add(txtNombreProyecto);

		txtDescripcion = new JTextField();
		txtDescripcion.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtDescripcion.getText().equals("Descripcion Proyecto")) {
					txtDescripcion.setText("");
				}
				else {
					txtDescripcion.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtDescripcion.getText().equals("")) {
					txtDescripcion.setText("Descripcion Proyecto");
				}
				
			}
		});
		txtDescripcion.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtDescripcion.setForeground(new Color(100, 149, 237));
		txtDescripcion.setBackground(new Color(240, 255, 255));
		txtDescripcion.setText("Descripcion proyecto");
		txtDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		txtDescripcion.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(196, 99, 280, 37);
		contentPane.add(txtDescripcion);

		
		txtNombreDuenio = new JTextField();
		txtNombreDuenio.setText("Nombre dueño");
		txtNombreDuenio.setHorizontalAlignment(SwingConstants.LEFT);
		txtNombreDuenio.setForeground(new Color(100, 149, 237));
		txtNombreDuenio.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtNombreDuenio.setColumns(10);
		txtNombreDuenio.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtNombreDuenio.setBackground(new Color(240, 255, 255));
		txtNombreDuenio.setBounds(196, 162, 280, 37);
		contentPane.add(txtNombreDuenio);
		txtNombreDuenio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtNombreDuenio.getText().equals("Nombre Dueño")) {
					txtNombreDuenio.setText("");
				}
				else {
					txtNombreDuenio.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtNombreDuenio.getText().equals("")) {
					txtNombreDuenio.setText("Nombre Dueño");
				}
				
			}
		});
		
		txtCorreoDuenio = new JTextField();
		txtCorreoDuenio.setText("Correo dueño");
		txtCorreoDuenio.setHorizontalAlignment(SwingConstants.LEFT);
		txtCorreoDuenio.setForeground(new Color(100, 149, 237));
		txtCorreoDuenio.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtCorreoDuenio.setColumns(10);
		txtCorreoDuenio.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtCorreoDuenio.setBackground(new Color(240, 255, 255));
		txtCorreoDuenio.setBounds(196, 210, 280, 37);
		contentPane.add(txtCorreoDuenio);
		txtCorreoDuenio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtCorreoDuenio.getText().equals("Correo Dueño")) {
					txtCorreoDuenio.setText("");
				}
				else {
					txtCorreoDuenio.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtCorreoDuenio.getText().equals("")) {
					txtCorreoDuenio.setText("Correo Dueño");
				}
				
			}
		});		
		
		
		txtFechaFinal = new JTextField();
		txtFechaFinal.setText("Fecha de finalizacion(d/m/a)");
		txtFechaFinal.setHorizontalAlignment(SwingConstants.LEFT);
		txtFechaFinal.setForeground(new Color(100, 149, 237));
		txtFechaFinal.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtFechaFinal.setColumns(10);
		txtFechaFinal.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtFechaFinal.setBackground(new Color(240, 255, 255));
		txtFechaFinal.setBounds(196, 258, 280, 37);
		contentPane.add(txtFechaFinal);
		txtFechaFinal.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtFechaFinal.getText().equals("Fecha de finalizacion(d/m/a)")) {
					txtFechaFinal.setText("");
				}
				else {
					txtFechaFinal.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtFechaFinal.getText().equals("")) {
					txtFechaFinal.setText("Fecha de finalizacion(d/m/a)");
				}
				
			}
		});	
		
		JPanel btnRegresar = new JPanel();
		btnRegresar.setLayout(null);
		btnRegresar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnRegresar.setBackground(new Color(135, 206, 250));
		btnRegresar.setBounds(21, 300, 148, 50);
		pnlAzul.add(btnRegresar);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnRegresar.setBackground(new Color(135, 149, 250));
	    	JComponent comp = (JComponent) e.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
	        FrameListadoProyectos irAReporte = new FrameListadoProyectos();//FrameReporteUser
	        irAReporte.setVisible(true);
		}
		});
		lblRegresar.setForeground(new Color(30, 144, 255));
		lblRegresar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblRegresar.setBackground(Color.WHITE);
		lblRegresar.setBounds(10, 11, 128, 28);
		btnRegresar.add(lblRegresar);
		
		txtTipo = new JTextField();
		txtTipo.setText("Tipo Actividad");
		txtTipo.setHorizontalAlignment(SwingConstants.LEFT);
		txtTipo.setForeground(new Color(100, 149, 237));
		txtTipo.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
		txtTipo.setColumns(10);
		txtTipo.setBorder(new LineBorder(new Color(135, 206, 250), 2));
		txtTipo.setBackground(new Color(240, 255, 255));
		txtTipo.setBounds(196, 321, 207, 37);
		contentPane.add(txtTipo);
		txtTipo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtTipo.getText().equals("Tipo Actividad")) {
					txtTipo.setText("");
				}
				else {
					txtTipo.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(txtTipo.getText().equals("")) {
					txtTipo.setText("Tipo Actividad");
				}
				
			}
		});	
		
		btnAgregar = new JPanel();
		btnAgregar.setLayout(null);
		btnAgregar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnAgregar.setBackground(new Color(135, 206, 250));
		btnAgregar.setBounds(421, 321, 103, 37);
		contentPane.add(btnAgregar);

		
		lblAgregar = new JLabel("Agregar");
		lblAgregar.setForeground(new Color(30, 144, 255));
		lblAgregar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblAgregar.setBackground(Color.WHITE);
		lblAgregar.setBounds(10, 0, 72, 39);
		btnAgregar.add(lblAgregar);
		btnAgregar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			txtTipo.setText("");
		}
		});//emptyCommit
	}
}
