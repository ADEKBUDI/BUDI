package com.tab.adek.budi;


import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class c_tab_item_bajuadat extends Fragment {
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Lampung",
			"Bengkulu","Jambi","Sumatera Selatan","Gorontalo","Bali","Bangka Belitung","Banten",
			"DKI Jakarta","Jawa Barat","Jawa Tengah","Jawa Timur","Kepulauan Riau",
			"DI Yogyakarta"
	};
	private int[] listtxtbaju = {
			R.string.s_prov_baju_0,
			R.string.s_prov_baju_1
	};
	private int[] imgbaju = {
			R.drawable.pa_aceh,
			R.drawable.ic_launcher
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.tab_item_bajuadat, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtBaju);
		ImageView img = (ImageView)rootView.findViewById(R.id.imgBaju);
		int a = 0;
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i]))
			   { //pakek softtex :v sensitif
				txt.setText(listtxtbaju[i]);
				img.setImageResource(imgbaju[i]);
				}
		}
		return rootView;
	}
}
