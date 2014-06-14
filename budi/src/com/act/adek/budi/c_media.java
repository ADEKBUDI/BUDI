package com.act.adek.budi;
import com.adek.budi.R;

import android.R.string;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.widget.ImageButton;
public class c_media {
	public static MediaPlayer mp;
	private static SoundPool soundPool;
	public static boolean pause = false;
	public static boolean status = false;

	public static long totalDuration;
	public static long currentDuration;
	public static void isiLagu(Context a,int b){
		mp = MediaPlayer.create(a, b);
		 totalDuration = mp.getDuration();
	}
	public static void playAudio(){
		status = true;
		soundPool = new SoundPool(4,AudioManager.STREAM_MUSIC,100);
		if(!mp.isPlaying()){
			mp.start();
		}
	}
	
	public static void PauseAudio(){
			mp.pause();
			pause = true;
	}

	public static boolean isplayingAudio() {
		// TODO Auto-generated method stub
		return mp.isPlaying();
	}
	public static void play(){
		mp.start();
	}
	public static void stop(){
		status = false;
			mp.stop();
	}
	public static int titik(){
		return mp.getCurrentPosition();
		
	}
	public static boolean chk(){
		if(mp.getDuration()==mp.getCurrentPosition()){
			return true;
		}else
		{
			return false;
		}
	}
	public static String milliSecondsToTimer(long milliseconds){
		String finalTimerString = "";
		String secondsString = "";
		
		// Convert total duration into time
		   int hours = (int)( milliseconds / (1000*60*60));
		   int minutes = (int)(milliseconds % (1000*60*60)) / (1000*60);
		   int seconds = (int) ((milliseconds % (1000*60*60)) % (1000*60) / 1000);
		   // Add hours if there
		   if(hours > 0){
			   finalTimerString = hours + ":";
		   }
		   
		   // Prepending 0 to seconds if it is one digit
		   if(seconds < 10){ 
			   secondsString = "0" + seconds;
		   }else{
			   secondsString = "" + seconds;}
		   
		   finalTimerString = finalTimerString + minutes + ":" + secondsString;
		
		// return timer string
		return finalTimerString;
	}
	public static int getProgressPercentage(long currentDuration, long totalDuration){
		Double percentage = (double) 0;
		
		long currentSeconds = (int) (currentDuration / 1000);
		long totalSeconds = (int) (totalDuration / 1000);
		
		// calculating percentage
		percentage =(((double)currentSeconds)/totalSeconds)*100;
		
		// return percentage
		return percentage.intValue();
	}
}
