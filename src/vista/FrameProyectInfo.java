package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JList;
import java.awt.ScrollPane;

public class FrameProyectInfo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameProyectInfo frame = new FrameProyectInfo();
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
	public FrameProyectInfo() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 255));
		contentPane.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion (Cambia)");
		lblDescripcion.setForeground(new Color(0, 0, 0));
		lblDescripcion.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion.setBounds(196, 118, 343, 100);
		contentPane.add(lblDescripcion);
		
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
					FrameProyectInfo.this.dispose();
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
	
		JPanel BtnEditar = new JPanel();
		BtnEditar.setBounds(21, 136, 148, 50);
		pnlAzul.add(BtnEditar);
		BtnEditar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			BtnEditar.setBackground(new Color(135, 149, 250));
			}

		
		});
		BtnEditar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		BtnEditar.setBackground(new Color(135, 206, 250));
		BtnEditar.setLayout(null);
		
		JLabel lbLogin = new JLabel("Editar proyecto");
		lbLogin.setForeground(new Color(30, 144, 255));
		lbLogin.setBackground(Color.WHITE);
		lbLogin.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lbLogin.setBounds(10, 11, 107, 28);
		BtnEditar.add(lbLogin);
		
		
		JPanel btnReporte = new JPanel();
		btnReporte.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnReporte.setBackground(new Color(135, 149, 250));
		}
		});
		btnReporte.setLayout(null);
		btnReporte.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnReporte.setBackground(new Color(135, 206, 250));
		btnReporte.setBounds(21, 213, 148, 50);
		pnlAzul.add(btnReporte);
		
		JLabel lblGenerarReporte = new JLabel("Generar reporte");
		lblGenerarReporte.setForeground(new Color(30, 144, 255));
		lblGenerarReporte.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblGenerarReporte.setBackground(Color.WHITE);
		lblGenerarReporte.setBounds(10, 11, 128, 28);
		btnReporte.add(lblGenerarReporte);
		
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
			
		}
		});
		lblRegresar.setForeground(new Color(30, 144, 255));
		lblRegresar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblRegresar.setBackground(Color.WHITE);
		lblRegresar.setBounds(10, 11, 128, 28);
		btnRegresar.add(lblRegresar);
		

		
		JLabel lblNombreProyecto = new JLabel("Nombre proyecto (Cambia)");
		lblNombreProyecto.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreProyecto.setForeground(new Color(30, 144, 255));
		lblNombreProyecto.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNombreProyecto.setBounds(196, 51, 343, 26);
		contentPane.add(lblNombreProyecto);
		
		JLabel lblIdProyecto_1 = new JLabel("IdProyecto (Cambia)");
		lblIdProyecto_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdProyecto_1.setForeground(new Color(30, 144, 255));
		lblIdProyecto_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIdProyecto_1.setBounds(196, 88, 343, 26);
		contentPane.add(lblIdProyecto_1);
		
		
		JPanel pnlParticipantes = new JPanel(new GridLayout (50,0));
		pnlParticipantes.setBackground(new Color(135, 206, 250));
		pnlParticipantes.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(196, 249, 343, 130);
		
		for (int i =0;i<50;i++) {
            JLabel texto = new JLabel("Hola que hace");
            texto.setFont(new Font("Roboto",Font.PLAIN,18));
            texto.setForeground(new Color(0, 110, 197));
            scrollPane.add(texto);
        }
		scrollPane.setViewportView(pnlParticipantes);
		contentPane.add(scrollPane);
		
		JLabel lblParticipantes_1 = new JLabel("Participantes");
		lblParticipantes_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblParticipantes_1.setForeground(new Color(30, 144, 255));
		lblParticipantes_1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblParticipantes_1.setBounds(196, 208, 182, 47);
		contentPane.add(lblParticipantes_1);
	}
}