import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.GridLayout;

import java.io.FileNotFoundException;

import javazoom.jl.decoder.*;
import javazoom.jl.player.*;

public class SoundPlayerTest extends JFrame{

	SoundPlayer s1;

	public SoundPlayerTest(){
		super("Song Player");
		setSize(400, 400);
		setResizable(false);

		JPanel panel = new JPanel(new GridLayout(1,2));
		panel.setPreferredSize(new Dimension(400, 400));

		//s1 = new SoundPlayer(<filename>, true);

		JButton play = new JButton("Play");
		panel.add(play);
		play.addActionListener(event->{
			s1.play();
		});

		JButton pause = new JButton("Pause");
		pause.addActionListener(event->{
			s1.pause();
		});
		
		panel.add(pause);

		add(panel);
		setVisible(true);
		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args){
		new SoundPlayerTest();
	}

}