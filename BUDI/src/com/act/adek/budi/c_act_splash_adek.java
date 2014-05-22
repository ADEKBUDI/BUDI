package com.act.adek.budi;

import com.adek.budi.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class c_act_splash_adek extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		final int musiclist[] = {R.raw.sound2};
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		super.onCreate(savedInstanceState);
		c_media.playAudio(c_act_splash_adek.this, musiclist[0]);
		setContentView(R.layout.act_splash_adek);
		Thread logoTimer = new Thread(){
			public void run(){
				try{
					sleep(2000);
					Intent i = new Intent("com.act.adek.budi.C_ACT_SPLASH_BUDI");
					startActivity(i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					finish();
				}
				
			}
		};
		logoTimer.start();
	}
	
}
