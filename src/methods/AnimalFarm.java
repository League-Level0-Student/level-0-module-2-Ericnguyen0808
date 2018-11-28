package methods;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0


import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		for(int i=0; i>-1999;i++) {
		String answer = JOptionPane.showInputDialog("Which animal do you want to hear?");
		
	if(answer.equals("cow")){
			playNoise(mooFile);
	}
	if(answer.equalsIgnoreCase("Duck")){
		playNoise(quackFile);
	}
	if(answer.equalsIgnoreCase("Dog")){
		playNoise(woofFile);
	}
	if(answer.equalsIgnoreCase("Llama")) {
		playNoise(llamaFnile);
	}
	if(answer.equalsIgnoreCase("Cat")) {
		playNoise(meowFile);
	}
		}
	}
	
	void playMoo() {
		playNoise(mooFile);
	}
	void playQuack() {
		playNoise(quackFile);
	}
	void playWoof() {
		playNoise(woofFile);
	}
	void playLlama() {
		playNoise(llamaFile);
	}
	void playMeow() {
		playNoise(meowFile);
	}
	
	
	
	
	
	
	
	
	String quackFile = "quack.wav";
	String mooFile = "moo.wav";
	String woofFile = "woof.wav";
	String meowFile = "meow.wav";
	String llamaFile = "llama.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}
	}
