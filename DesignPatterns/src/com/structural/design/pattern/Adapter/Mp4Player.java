package com.structural.design.pattern.Adapter;

public class Mp4Player implements AdvanceMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("playing mp4 file.name "+fileName);
	}

}
