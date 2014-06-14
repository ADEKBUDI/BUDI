package com.tab.adek.budi;


import java.io.IOException;

import com.act.adek.budi.c_media;
import com.adek.budi.R;

import android.R.string;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class c_tab_item_lagudaerah extends Fragment {
	private ProgressBar pB;
	private ImageButton btnPlay;
private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	private int[] ListJudul ={
			R.string.s_prov_t_lagu_0,
			R.string.s_prov_t_lagu_1,
			R.string.s_prov_t_lagu_2,
			R.string.s_prov_t_lagu_3,
			R.string.s_prov_t_lagu_4,
			R.string.s_prov_t_lagu_5,
			R.string.s_prov_t_lagu_6,
			R.string.s_prov_t_lagu_7,
			R.string.s_prov_t_lagu_8,
			R.string.s_prov_t_lagu_9,
			R.string.s_prov_t_lagu_10,
			R.string.s_prov_t_lagu_11,
			R.string.s_prov_t_lagu_12,
			R.string.s_prov_t_lagu_13,
			R.string.s_prov_t_lagu_14,
			R.string.s_prov_t_lagu_15,
			R.string.s_prov_t_lagu_16,
			R.string.s_prov_t_lagu_17,
			R.string.s_prov_t_lagu_18,
			R.string.s_prov_t_lagu_19,
			R.string.s_prov_t_lagu_20,
			R.string.s_prov_t_lagu_21,
			R.string.s_prov_t_lagu_22,
			R.string.s_prov_t_lagu_23,
			R.string.s_prov_t_lagu_24,
			R.string.s_prov_t_lagu_25,
			R.string.s_prov_t_lagu_26,
			R.string.s_prov_t_lagu_27,
			R.string.s_prov_t_lagu_28,
			R.string.s_prov_t_lagu_29,
			R.string.s_prov_t_lagu_30,
			R.string.s_prov_t_lagu_31,
			R.string.s_prov_t_lagu_32,
			R.string.s_prov_t_lagu_33
	};
	private int[] ListLirik={
			R.string.s_prov_lagu_0,
			R.string.s_prov_lagu_1,
			R.string.s_prov_lagu_2,
			R.string.s_prov_lagu_3,
			R.string.s_prov_lagu_4,
			R.string.s_prov_lagu_5,
			R.string.s_prov_lagu_6,
			R.string.s_prov_lagu_7,
			R.string.s_prov_lagu_8,
			R.string.s_prov_lagu_9,
			R.string.s_prov_lagu_10,
			R.string.s_prov_lagu_11,
			R.string.s_prov_lagu_12,
			R.string.s_prov_lagu_13,
			R.string.s_prov_lagu_14,
			R.string.s_prov_lagu_15,
			R.string.s_prov_lagu_16,
			R.string.s_prov_lagu_17,
			R.string.s_prov_lagu_18,
			R.string.s_prov_lagu_19,
			R.string.s_prov_lagu_20,
			R.string.s_prov_lagu_21,
			R.string.s_prov_lagu_22,
			R.string.s_prov_lagu_23,
			R.string.s_prov_lagu_24,
			R.string.s_prov_lagu_25,
			R.string.s_prov_lagu_26,
			R.string.s_prov_lagu_27,
			R.string.s_prov_lagu_28,
			R.string.s_prov_lagu_29,
			R.string.s_prov_lagu_30,
			R.string.s_prov_lagu_31,
			R.string.s_prov_lagu_32,
			R.string.s_prov_lagu_33
			
	};
	private int[] ListLagu = {
			R.raw.lagu_aceh,
			R.raw.lagu_sumut,
			R.raw.lagu_sumbar,
			R.raw.lagu_riau,
			R.raw.lagu_sumut,
			R.raw.lagu_jambi,
			R.raw.lagu_sumsel,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_jakarta,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut,
			R.raw.lagu_sumut
	};
	int Music;
	// Ecek-Ecek

	private Handler mHandler = new Handler();
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.tab_item_lagudaerah, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		final String kirim = data.getString("kirim");
		pB = (ProgressBar)rootView.findViewById(R.id.songProgressBar);
		final TextView jlagu = (TextView)rootView.findViewById(R.id.songTitle);
		btnPlay = (ImageButton)rootView.findViewById(R.id.btnPlay);
		TextView llagu = (TextView)rootView.findViewById(R.id.txtLirik);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) {
				llagu.setText(ListLirik[i]);
				c_media.isiLagu(getActivity(),ListLagu[i]);
				jlagu.setText(ListJudul[i]);
				jlagu.setText(jlagu.getText().toString() + " ~ "+ c_media.milliSecondsToTimer(c_media.totalDuration));
				break;
			}

		}
		
	if(c_media.status){
		btnPlay.setImageResource(R.drawable.btn_pause);
	}
	else{
		
		btnPlay.setImageResource(R.drawable.btn_play);
		
	}
	btnPlay.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
		
				testing(btnPlay);
				
			}
		});
	

		return rootView;
	}
	
	public void testing(ImageButton btnPlay){
		try{
		if(!c_media.status){
			c_media.playAudio();
			btnPlay.setImageResource(R.drawable.btn_pause);
		
		}else{
			if(c_media.isplayingAudio()){
			btnPlay.setImageResource(R.drawable.btn_play);
			c_media.PauseAudio();
			}else{
				c_media.play();
				btnPlay.setImageResource(R.drawable.btn_pause);
			}
			}
		
		updateProgressBar();	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}
	public void updateProgressBar() {
        mHandler.postDelayed(mUpdateTimeTask, 10);        
    }
	private Runnable mUpdateTimeTask = new Runnable() {
		   public void run() {
			   long totalDuration = c_media.totalDuration;
			   long currentDuration = c_media.titik();
			  
			   
			   // Updating progress bar
			   int progress = (int)(c_media.getProgressPercentage(currentDuration, totalDuration));
			   //Log.d("Progress", ""+progress);
			  pB.setProgress(progress);
			  if(pB.getProgress()>=c_media.totalDuration){
					btnPlay.setImageResource(R.drawable.btn_play);
				}
			   // Running this thread after 100 milliseconds
		       mHandler.postDelayed(this, 100);
		   }
		};
		
	
}
