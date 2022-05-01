package vista;

import modelo.PrManager;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class FrameListadoActividades extends JFrame {


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {  
			public void run() {
				try {
					FrameListadoActividades frame = new FrameListadoActividades();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public FrameListadoActividades(int idProy,PrManager manager) {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		
		
		JPanel pnlAzul = new JPanel();
		pnlAzul.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(100, 149, 237)));
		pnlAzul.setBackground(new Color(224, 255, 255));
		pnlAzul.setForeground(Color.WHITE);
		pnlAzul.setBounds(0, 0, 186, 400);
		contentPane.add(pnlAzul);
		pnlAzul.setLayout(null);
		
		JPanel pnlBtnNewUser = new JPanel();
		pnlBtnNewUser.setLayout(null);
		pnlBtnNewUser.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnNewUser.setBackground(new Color(135, 206, 250));
		pnlBtnNewUser.setBounds(10, 114, 166, 40);
		pnlAzul.add(pnlBtnNewUser);
		pnlBtnNewUser.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			pnlBtnNewUser.setBackground(new Color(135, 149, 250));
	    	JComponent comp = (JComponent) e.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
	        FrameAddUser irAReporte = new FrameAddUser (idProy,manager);
	        irAReporte.setVisible(true);
			}

		});
		
		JLabel lblNewUser = new JLabel("Agregar participante");
		lblNewUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewUser.setForeground(new Color(30, 144, 255));
		lblNewUser.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewUser.setBackground(Color.WHITE);
		lblNewUser.setBounds(0, 0, 166, 40);
		pnlBtnNewUser.add(lblNewUser);
		
		JPanel pnlBtnReporteAct = new JPanel();
		pnlBtnReporteAct.setLayout(null);
		pnlBtnReporteAct.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnReporteAct.setBackground(new Color(135, 206, 250));
		pnlBtnReporteAct.setBounds(10, 216, 166, 40);
		pnlAzul.add(pnlBtnReporteAct);
		pnlBtnReporteAct.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			pnlBtnReporteAct.setBackground(new Color(135, 149, 250));
	    	JComponent comp = (JComponent) e.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
	        FrameReporteActividades irAReporte = new FrameReporteActividades (manager);
	        irAReporte.setVisible(true);
			}
		});
		
		JLabel lblReporteAct = new JLabel("Reporte de actividades");
		lblReporteAct.setHorizontalAlignment(SwingConstants.CENTER);
		lblReporteAct.setForeground(new Color(30, 144, 255));
		lblReporteAct.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblReporteAct.setBackground(Color.WHITE);
		lblReporteAct.setBounds(0, 0, 166, 40);
		pnlBtnReporteAct.add(lblReporteAct);
		
		JPanel pnlBtnRegresar = new JPanel();
		pnlBtnRegresar.setLayout(null);
		pnlBtnRegresar.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnRegresar.setBackground(new Color(135, 206, 250));
		pnlBtnRegresar.setBounds(10, 328, 166, 40);
		pnlBtnRegresar.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			pnlBtnRegresar.setBackground(new Color(135, 149, 250));
	    	JComponent comp = (JComponent) e.getSource();
	        Window win = SwingUtilities.getWindowAncestor(comp);
	        win.dispose();
	        FrameProyectInfo irAReporte = new FrameProyectInfo (manager,idProy);
	        irAReporte.setVisible(true);
			}
		});
		pnlAzul.add(pnlBtnRegresar);
		
		JLabel lblRegresar = new JLabel("Regresar");
		lblRegresar.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegresar.setForeground(new Color(30, 144, 255));
		lblRegresar.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblRegresar.setBackground(Color.WHITE);
		lblRegresar.setBounds(0, 0, 166, 40);
		pnlBtnRegresar.add(lblRegresar);
		
		JLabel lblTitle = new JLabel("Project manager");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(227, 11, 134, 20);
		pnlArriba.add(lblTitle);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "�Estas seguro que quieres salir?", "Confirmaci�n", JOptionPane.YES_NO_OPTION)==0) {
					FrameListadoActividades.this.dispose();
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
		
		JLabel lblNewLabel = new JLabel("Actividades");
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 15));
		lblNewLabel.setBounds(224, 65, 134, 22);
		contentPane.add(lblNewLabel);
		
		

		JPanel listadoActividades = new JPanel(new GridLayout(50,0));
		listadoActividades.setBackground(new Color(153, 255, 255));

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 116, 317, 252);
		
		
		
		
		for (int i =0;i<50;i++) {
			JLabel texto = new JLabel("Hola que hace");
			texto.setFont(new Font("Roboto",Font.PLAIN,18));
			texto.setForeground(new Color(0, 110, 197));
			listadoActividades.add(texto);
		}
		scrollPane.setViewportView(listadoActividades);
		contentPane.add(scrollPane);
		
		JPanel pnlBtnAdd = new JPanel();
		pnlBtnAdd.setBounds(395, 51, 147, 40);
		contentPane.add(pnlBtnAdd);
		pnlBtnAdd.setLayout(null);
		pnlBtnAdd.setBorder(new LineBorder(new Color(100, 149, 237), 2));
		pnlBtnAdd.setBackground(new Color(135, 206, 250));
		
		JLabel lblNuevaActividad = new JLabel("+ Nueva actividad");
		lblNuevaActividad.setHorizontalAlignment(SwingConstants.CENTER);
		lblNuevaActividad.setForeground(new Color(30, 144, 255));
		lblNuevaActividad.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNuevaActividad.setBackground(Color.WHITE);
		lblNuevaActividad.setBounds(0, 0, 147, 40);
		pnlBtnAdd.add(lblNuevaActividad);
		
		

		
		setLocationRelativeTo(null);
	}
}
