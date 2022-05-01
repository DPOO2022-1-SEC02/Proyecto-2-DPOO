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
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class FrameAgregarActividad extends JFrame {


	private JPanel contentPane;
	private JTextField nameActividad;
	private JTextField idActividad;
	private JTextField encargado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameAgregarActividad frame = new FrameAgregarActividad();
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
	public FrameAgregarActividad() {
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
		
		JButton reporteActividad = new JButton("<html>Reporte<br> de Actividades</html>");
		reporteActividad.setForeground(new Color(0, 0, 153));
		reporteActividad.setFont(new Font("Roboto Black", Font.BOLD, 12));
		reporteActividad.setBackground(new Color(102, 204, 255));
		reporteActividad.setBounds(30, 204, 141, 37);
		pnlAzul.add(reporteActividad);
		
		JButton volverBtn = new JButton("Regresar");
		volverBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		volverBtn.setForeground(new Color(0, 0, 153));
		volverBtn.setFont(new Font("Roboto Black", Font.BOLD, 12));
		volverBtn.setBackground(new Color(102, 204, 255));
		volverBtn.setBounds(46, 269, 107, 37);
		pnlAzul.add(volverBtn);
		
		JButton addSomeoneBtn = new JButton("Agregar participante");
		addSomeoneBtn.setForeground(new Color(0, 0, 153));
		addSomeoneBtn.setFont(new Font("Roboto Black", Font.BOLD, 12));
		addSomeoneBtn.setBackground(new Color(102, 204, 255));
		addSomeoneBtn.setBounds(20, 139, 151, 37);
		pnlAzul.add(addSomeoneBtn);
		
		JLabel lblTitle = new JLabel("Project manager");
		lblTitle.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(227, 11, 134, 20);
		pnlArriva.add(lblTitle);
		
		JLabel lblExit = new JLabel("X");
		lblExit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?", "Confirmación", JOptionPane.YES_NO_OPTION)==0) {
					FrameAgregarActividad.this.dispose();
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
		
		JLabel lblNewLabel = new JLabel("Agregar una actividad");
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 20));
		lblNewLabel.setBounds(275, 71, 221, 31);
		contentPane.add(lblNewLabel);
		
		nameActividad = new JTextField();
		nameActividad.setText("Nombre Actividad");
		nameActividad.setBounds(239, 128, 313, 40);
		contentPane.add(nameActividad);
		nameActividad.setColumns(10);
		
		idActividad = new JTextField();
		idActividad.setText("ID Actividad");
		idActividad.setToolTipText("");
		idActividad.setColumns(10);
		idActividad.setBounds(239, 192, 313, 40);
		contentPane.add(idActividad);
		
		encargado = new JTextField();
		encargado.setText("Encargado");
		encargado.setColumns(10);
		encargado.setBounds(239, 255, 313, 40);
		contentPane.add(encargado);
	
		
		idActividad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(idActividad.getText().equals("ID Actividad")) {
					idActividad.setText("");
				}
				else {
					idActividad.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(idActividad.getText().equals("")) {
					idActividad.setText("ID Actividad");
				}
				
			}
		});
		
		
		encargado.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(encargado.getText().equals("Encargado")) {
					encargado.setText("");
				}
				else {
					encargado.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(encargado.getText().equals("")) {
					encargado.setText("Encargado");
				}
				
			}
		});
		
		nameActividad.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(nameActividad.getText().equals("Nombre Actividad")) {
					nameActividad.setText("");
				}
				else {
					nameActividad.selectAll();
				}
			}
			
			@Override
			public void focusLost(FocusEvent e) {
				if(nameActividad.getText().equals("")) {
					nameActividad.setText("Nombre Actividad");
				}
				
			}
		});
		
		
		
		

		
		setLocationRelativeTo(null);
	}
}
