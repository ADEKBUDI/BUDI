package com.act.adek.budi;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
public class c_media {
	public static MediaPlayer mediaplayer;
	private static SoundPool soundPool;
	public static boolean isplayingAudio=false;
	public static void setAudioLoop(boolean x){
		mediaplayer.setLooping(x);
	}
	public static void playAudio(Context c,int id){
		mediaplayer = MediaPlayer.create(c, id);
		soundPool = new SoundPool(4,AudioManager.STREAM_MUSIC,100);
		if(!mediaplayer.isPlaying()){
			isplayingAudio=true;
			mediaplayer.start();
		}
	}
	public static void stopAudio(){
		isplayingAudio=false;
		mediaplayer.stop();
	}
	public static void PauseAudio(){
		if(!mediaplayer.isPlaying()){
			mediaplayer.start();
		}else{mediaplayer.pause();}
	}
}
