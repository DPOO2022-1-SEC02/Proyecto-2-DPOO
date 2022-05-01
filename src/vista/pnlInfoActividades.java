package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import java.awt.CardLayout;
import java.awt.Color;

public class pnlInfoActividades extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pnlInfoActividades frame = new pnlInfoActividades();
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
	public pnlInfoActividades() {
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
		
		JPanel pnlAzul = new JPanel();
		pnlAzul.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlAzul.setBackground(new Color(224, 255, 255));
		pnlAzul.setForeground(Color.WHITE);
		pnlAzul.setBounds(0, 0, 186, 400);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);
		
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
					pnlInfoActividades.this.dispose();
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
		
		JPanel btnRegresar = new JPanel();
		btnRegresar.setLayout(null);
		btnRegresar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnRegresar.setBackground(new Color(135, 206, 250));
		btnRegresar.setBounds(21, 328, 148, 50);
		pnlAzul.add(btnRegresar);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			btnRegresar.setBackground(new Color(135, 149, 250));
	    	JComponent comp = (JComponent) e.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
	        FrameListadoActividades irAReporte = new FrameListadoActividades ();
	        irAReporte.setVisible(true);
			}
		});
		lblRegresar.setForeground(new Color(30, 144, 255));
		lblRegresar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblRegresar.setBackground(Color.WHITE);
		lblRegresar.setBounds(10, 11, 128, 28);
		btnRegresar.add(lblRegresar);
		
		JPanel btnFinalizar = new JPanel();
		btnFinalizar.setLayout(null);
		btnFinalizar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnFinalizar.setBackground(new Color(135, 206, 250));
		btnFinalizar.setBounds(21, 267, 148, 50);
		pnlAzul.add(btnFinalizar);
		
		JLabel lblFinActividad = new JLabel("Finalizar actividad");
		lblFinActividad.setForeground(new Color(30, 144, 255));
		lblFinActividad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblFinActividad.setBackground(Color.WHITE);
		lblFinActividad.setBounds(10, 11, 128, 28);
		btnFinalizar.add(lblFinActividad);
		
		JPanel btnTerminarTrabajo = new JPanel();
		btnTerminarTrabajo.setLayout(null);
		btnTerminarTrabajo.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnTerminarTrabajo.setBackground(new Color(135, 206, 250));
		btnTerminarTrabajo.setBounds(21, 206, 148, 50);
		pnlAzul.add(btnTerminarTrabajo);
		
		JLabel lblTerminarTrabajo = new JLabel("Terminar trabajo");
		lblTerminarTrabajo.setForeground(new Color(30, 144, 255));
		lblTerminarTrabajo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTerminarTrabajo.setBackground(Color.WHITE);
		lblTerminarTrabajo.setBounds(10, 11, 128, 28);
		btnTerminarTrabajo.add(lblTerminarTrabajo);
		
		JPanel btnIniciarTrabajo = new JPanel();
		btnIniciarTrabajo.setLayout(null);
		btnIniciarTrabajo.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnIniciarTrabajo.setBackground(new Color(135, 206, 250));
		btnIniciarTrabajo.setBounds(21, 145, 148, 50);
		pnlAzul.add(btnIniciarTrabajo);
		
		JLabel lblIniciarTrabajo = new JLabel("Iniciar trabajo");
		lblIniciarTrabajo.setForeground(new Color(30, 144, 255));
		lblIniciarTrabajo.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblIniciarTrabajo.setBackground(Color.WHITE);
		lblIniciarTrabajo.setBounds(10, 11, 128, 28);
		btnIniciarTrabajo.add(lblIniciarTrabajo);
		
		JPanel btnEditarAct = new JPanel();
		btnEditarAct.setLayout(null);
		btnEditarAct.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		btnEditarAct.setBackground(new Color(135, 206, 250));
		btnEditarAct.setBounds(21, 84, 148, 50);
		pnlAzul.add(btnEditarAct);
		
		JLabel lblEditarAct = new JLabel("Editar actividad");
		lblEditarAct.setForeground(new Color(30, 144, 255));
		lblEditarAct.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblEditarAct.setBackground(Color.WHITE);
		lblEditarAct.setBounds(10, 11, 128, 28);
		btnEditarAct.add(lblEditarAct);

		JLabel lblNombreProyecto = new JLabel("Nombre actividad(Cambia)");
		lblNombreProyecto.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombreProyecto.setForeground(new Color(30, 144, 255));
		lblNombreProyecto.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblNombreProyecto.setBounds(196, 77, 343, 26);
		contentPane.add(lblNombreProyecto);
		
		JLabel lblIdActividad = new JLabel("ID Actividad (Cambia)");
		lblIdActividad.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdActividad.setForeground(new Color(30, 144, 255));
		lblIdActividad.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblIdActividad.setBounds(196, 114, 343, 26);
		contentPane.add(lblIdActividad);
		
		JLabel lblEncargado = new JLabel("NombreEncargado(Cambia)");
		lblEncargado.setHorizontalAlignment(SwingConstants.LEFT);
		lblEncargado.setForeground(new Color(30, 144, 255));
		lblEncargado.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		lblEncargado.setBounds(196, 151, 343, 26);
		contentPane.add(lblEncargado);

		JLabel lblDescripcion = new JLabel("Descripcion (Cambia)");
		lblDescripcion.setForeground(new Color(0, 0, 0));
		lblDescripcion.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
		lblDescripcion.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescripcion.setBounds(196, 188, 343, 181);
		contentPane.add(lblDescripcion);
	}

}
