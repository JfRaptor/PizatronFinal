package co.edu.unbosque.view;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
	
	public void play() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
		File music = new File("music_106.wav");
		AudioInputStream audio = AudioSystem.getAudioInputStream(music);
		Clip clip = AudioSystem.getClip();
		clip.open(audio);
	
		clip.start();
		
		
	}

}
