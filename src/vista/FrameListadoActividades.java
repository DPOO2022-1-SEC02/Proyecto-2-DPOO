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


public class FrameListadoActividades extends JFrame {


	private JPanel contentPane;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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
	}

	/**
	 * Create the frame.
	 */
	public FrameListadoActividades() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
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
		
		JButton createReportBtn = new JButton("<html>Reporte<br> de Actividades</html>");
		createReportBtn.setForeground(new Color(0, 0, 153));
		createReportBtn.setFont(new Font("Roboto Black", Font.BOLD, 12));
		createReportBtn.setBackground(new Color(102, 204, 255));
		createReportBtn.setBounds(20, 206, 141, 37);
		pnlAzul.add(createReportBtn);
		
		JButton backBtn = new JButton("Regresar");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backBtn.setForeground(new Color(0, 0, 153));
		backBtn.setFont(new Font("Roboto Black", Font.BOLD, 12));
		backBtn.setBackground(new Color(102, 204, 255));
		backBtn.setBounds(20, 268, 107, 37);
		pnlAzul.add(backBtn);
		
		JButton addParticipant = new JButton("Agregar participante");
		addParticipant.setForeground(new Color(0, 0, 153));
		addParticipant.setFont(new Font("Roboto Black", Font.BOLD, 12));
		addParticipant.setBackground(new Color(102, 204, 255));
		addParticipant.setBounds(10, 139, 151, 37);
		pnlAzul.add(addParticipant);
		
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
		pnlArriva.add(lblExit);
		
		lblLoginMessage.setForeground(new Color(139, 0, 0));
		lblLoginMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblLoginMessage.setFont(new Font("Comic Sans MS", Font.PLAIN, 13));
		lblLoginMessage.setBounds(263, 91, 279, 37);
		contentPane.add(lblLoginMessage);
		

		JButton newActivity = new JButton("+ Nueva Actividad");
		newActivity.setBackground(new Color(102, 204, 255));
		newActivity.setForeground(new Color(0, 0, 153));
		newActivity.setFont(new Font("Roboto Black", Font.BOLD, 12));
		newActivity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newActivity.setBounds(368, 50, 176, 37);
		contentPane.add(newActivity);
		
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
		
		

		
		setLocationRelativeTo(null);
	}
}
