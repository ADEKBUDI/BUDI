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
	requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		super.onCreate(savedInstanceState);
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
