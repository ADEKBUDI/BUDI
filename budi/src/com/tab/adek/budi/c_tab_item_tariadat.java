package com.tab.adek.budi;
import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class c_tab_item_tariadat extends Fragment {
	
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	
	private int[] listTari ={
			R.string.s_prov_tari_0,
			R.string.s_prov_tari_1,
			R.string.s_prov_tari_2,
			R.string.s_prov_tari_3,
			R.string.s_prov_tari_4,
			R.string.s_prov_tari_5,
			R.string.s_prov_tari_6,
			R.string.s_prov_tari_7,
			R.string.s_prov_tari_8,
			R.string.s_prov_tari_9,
			R.string.s_prov_tari_10,
			R.string.s_prov_tari_11,
			R.string.s_prov_tari_12,
			R.string.s_prov_tari_13,
			R.string.s_prov_tari_14,
			R.string.s_prov_tari_15,
			R.string.s_prov_tari_16,
			R.string.s_prov_tari_17,
			R.string.s_prov_tari_18,
			R.string.s_prov_tari_19,
			R.string.s_prov_tari_20,
			R.string.s_prov_tari_21,
			R.string.s_prov_tari_22,
			R.string.s_prov_tari_23,
			R.string.s_prov_tari_24,
			R.string.s_prov_tari_25,
			R.string.s_prov_tari_26,
			R.string.s_prov_tari_27,
			R.string.s_prov_tari_28,
			R.string.s_prov_tari_29,
			R.string.s_prov_tari_30,
			R.string.s_prov_tari_31,
			R.string.s_prov_tari_32,
			R.string.s_prov_tari_33
	};
	
	private int[] imgTari ={
		R.raw.td_aceh,
		R.raw.td_sumut,
		R.raw.td_sumbar,
		R.raw.no_image,
		R.raw.no_image,
		R.raw.td_jambi,
		R.raw.td_sumsel,
		R.raw.td_babel,
		R.raw.td_bengkulu,
		R.raw.td_lampung,
		R.raw.td_banten,
		R.raw.no_image,
		R.raw.td_jabar,
		R.raw.td_jateng,
		R.raw.td_yogyakarta,
		R.raw.td_jatim,
		R.raw.no_image,
		R.raw.no_image,
		R.raw.no_image,
		R.raw.no_image,
		R.raw.td_sulsel,
		R.raw.td_sulbar,
		R.raw.td_sulteng,
		R.raw.no_image,
		R.raw.td_gorontalo,
		R.raw.td_sulut,
		R.raw.td_bali,
		R.raw.no_image,
		R.raw.td_ntt,
		R.raw.td_maluku,
		R.raw.no_image,
		R.raw.td_papua_bar,
		R.raw.td_papua,
		R.raw.no_image
	};

@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
		//String temp = "";
	View rootView = inflater.inflate(R.layout.tab_item_tariadat, container, false);
	Bundle data = getActivity().getIntent().getExtras();
	String kirim = data.getString("kirim");
	TextView txt = (TextView)rootView.findViewById(R.id.txtTari);
	ImageView img = (ImageView)rootView.findViewById(R.id.imgTari);
	for(int i=0;i<listProv.length;i++){ 
		if(kirim.equals(listProv[i]))
		{
			txt.setText(listTari[i]);
			img.setImageResource(imgTari[i]);
		}
	}

	return rootView;
}
}

