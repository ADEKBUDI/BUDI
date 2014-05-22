package com.tab.adek.budi;


import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class c_tab_item_rumahadat extends Fragment {
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	
	private int[] Listrumah ={
			R.string.s_prov_rumah_0,
			R.string.s_prov_rumah_1,
			R.string.s_prov_rumah_2,
			R.string.s_prov_rumah_3,
			R.string.s_prov_rumah_4,
			R.string.s_prov_rumah_5,
			R.string.s_prov_rumah_6,
			R.string.s_prov_rumah_7,
			R.string.s_prov_rumah_8,
			R.string.s_prov_rumah_9,
			R.string.s_prov_rumah_10,
			R.string.s_prov_rumah_11,
			R.string.s_prov_rumah_12,
			R.string.s_prov_rumah_13,
			R.string.s_prov_rumah_14,
			R.string.s_prov_rumah_15,
			R.string.s_prov_rumah_16,
			R.string.s_prov_rumah_17,
			R.string.s_prov_rumah_18,
			R.string.s_prov_rumah_19,
			R.string.s_prov_rumah_20,
			R.string.s_prov_rumah_21,
			R.string.s_prov_rumah_22,
			R.string.s_prov_rumah_23,
			R.string.s_prov_rumah_24,
			R.string.s_prov_rumah_25,
			R.string.s_prov_rumah_26,
			R.string.s_prov_rumah_27,
			R.string.s_prov_rumah_28,
			R.string.s_prov_rumah_29,
			R.string.s_prov_rumah_30,
			R.string.s_prov_rumah_31,
			R.string.s_prov_rumah_32,
			R.string.s_prov_rumah_33
	};
	private int[] ImgRumah={
			R.raw.pa_aceh,
			R.raw.pa_sumut
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.tab_item_rumahadat, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtRumah);
		ImageView img = (ImageView)rootView.findViewById(R.id.imgRumah);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) 
				{
				txt.setText(Listrumah[i]);
				img.setImageResource(ImgRumah[i]);
				}
		}
	

	
		return rootView;
	}
}
