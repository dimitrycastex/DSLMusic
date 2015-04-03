package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

import abc.notation.Tune;
import abc.parser.TuneParser;
import abc.ui.swing.JScoreComponent;
import java.awt.Color;

public class PentagramaGrafico extends JDialog
{

	private final JPanel	contentPanel	= new JPanel();
	private JPanel panel;

	public PentagramaGrafico(String notas)
	{
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle("Pentagrama");
		setBounds(100, 100, 450, 209);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JScrollPane scrollPane = new JScrollPane();
			contentPanel.add(scrollPane);
			{
				panel = new JPanel();
				panel.setBackground(Color.WHITE);
				//codigo para poner pentagrama
		        Tune tune = new TuneParser().parse(notas);
		        JScoreComponent scoreUI =new JScoreComponent();
		        scoreUI.setTune(tune);
				//
		        panel.add(scoreUI);
				scrollPane.setViewportView(panel);
			}
		}
	}

}
