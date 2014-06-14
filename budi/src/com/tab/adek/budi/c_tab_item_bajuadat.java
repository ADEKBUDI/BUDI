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
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
			
	};
	private int[] listtxtbaju = {
			R.string.s_prov_baju_0,
			R.string.s_prov_baju_1,
			R.string.s_prov_baju_2,
			R.string.s_prov_baju_3,
			R.string.s_prov_baju_4,
			R.string.s_prov_baju_5,
			R.string.s_prov_baju_6,
			R.string.s_prov_baju_7,
			R.string.s_prov_baju_8,
			R.string.s_prov_baju_9,
			R.string.s_prov_baju_10,
			R.string.s_prov_baju_11,
			R.string.s_prov_baju_12,
			R.string.s_prov_baju_13,
			R.string.s_prov_baju_14,
			R.string.s_prov_baju_15,
			R.string.s_prov_baju_16,
			R.string.s_prov_baju_17,
			R.string.s_prov_baju_18,
			R.string.s_prov_baju_19,
			R.string.s_prov_baju_20,
			R.string.s_prov_baju_21,
			R.string.s_prov_baju_22,
			R.string.s_prov_baju_23,
			R.string.s_prov_baju_24,
			R.string.s_prov_baju_25,
			R.string.s_prov_baju_26,
			R.string.s_prov_baju_27,
			R.string.s_prov_baju_28,
			R.string.s_prov_baju_29,
			R.string.s_prov_baju_30,
			R.string.s_prov_baju_31,
			R.string.s_prov_baju_32,
			R.string.s_prov_baju_33
	};
	private int[] imgbaju = {
			R.raw.pa_aceh,
			R.raw.pa_sumut,
			R.raw.pa_sumbar1,
			R.raw.pa_riau,
			R.raw.pa_kepri,
			R.raw.pa_jambi,
			R.raw.pa_sumsel,
			R.raw.pa_bangka_belitung,
			R.raw.pa_bengkuluu,
			R.raw.pa_lampung,
			R.raw.no_image,
			R.raw.pa_dki_jakarta,
			R.raw.no_image,
			R.raw.pa_jateng,
			R.raw.pa_yogyakarta,
			R.raw.pa_jatim,
			R.raw.no_image,
			R.raw.no_image,
			R.raw.no_image,
			R.raw.no_image,
			R.raw.no_image,
			R.raw.no_image,
			R.raw.pa_sulteng,
			R.raw.pa_sultengah,
			R.raw.pa_gorontaloo,
			R.raw.no_image,
			R.raw.pa_bali,
			R.raw.pa_ntb,
			R.raw.pa_ntt,
			R.raw.pa_maluku,
			R.raw.no_image,
			R.raw.pa_papuabarat,
			R.raw.pa_papua,
			R.raw.no_image
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
			   { //Hati-hati kurung kurawalnya sensitif
				txt.setText(listtxtbaju[i]);
				img.setImageResource(imgbaju[i]);
				}
		}
		return rootView;
	}
}
