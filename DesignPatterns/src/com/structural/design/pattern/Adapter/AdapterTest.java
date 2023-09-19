package com.structural.design.pattern.Adapter;

public class AdapterTest {
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Despacito");
		audioPlayer.play("mp4", "perfect");
		audioPlayer.play("kjdxim", "mind games");
		
		
	}

}
