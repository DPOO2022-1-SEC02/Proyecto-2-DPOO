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


public class FrameListadoProyectos extends JFrame {

	private JPanel contentPane;
	private JLabel lblLoginMessage = new JLabel("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameListadoProyectos frame = new FrameListadoProyectos();
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
	public FrameListadoProyectos() {
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
				if (JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres salir?", "Confirmación", JOptionPane.YES_NO_OPTION)==0) {
					FrameListadoProyectos.this.dispose();
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
		

		JButton newProject = new JButton("+ Nuevo Proyecto");
		newProject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		newProject.setBackground(new Color(102, 204, 255));
		newProject.setForeground(new Color(0, 0, 153));
		newProject.setFont(new Font("Roboto Black", Font.BOLD, 12));
		newProject.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newProject.setBounds(368, 50, 176, 37);
		contentPane.add(newProject);
		
		JLabel lblNewLabel = new JLabel("Proyectos Disponibles");
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 20));
		lblNewLabel.setBounds(57, 63, 247, 22);
		contentPane.add(lblNewLabel);
		
		

		JPanel listadoProyectos = new JPanel(new GridLayout(50,0));
		listadoProyectos.setBackground(new Color(153, 255, 255));

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(57, 116, 485, 221);
		
		
		
		
		for (int i =0;i<50;i++) {
			JLabel texto = new JLabel("Hola que hace");
			texto.setFont(new Font("Roboto",Font.PLAIN,18));
			texto.setForeground(new Color(0, 110, 197));
			listadoProyectos.add(texto);
		}
		scrollPane.setViewportView(listadoProyectos);
		contentPane.add(scrollPane);
		
		JButton saveInfo = new JButton("Guardar información");
		saveInfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		saveInfo.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		saveInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		saveInfo.setBounds(366, 347, 176, 43);
		contentPane.add(saveInfo);
		
		

		
		setLocationRelativeTo(null);
	}
}
