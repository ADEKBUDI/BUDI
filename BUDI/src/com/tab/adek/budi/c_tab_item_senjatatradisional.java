package com.tab.adek.budi;


import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class c_tab_item_senjatatradisional extends Fragment {
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	
	private int[] Listsenjata ={
			R.string.s_prov_senjata_0,
			R.string.s_prov_senjata_1,
			R.string.s_prov_senjata_2,
			R.string.s_prov_senjata_3,
			R.string.s_prov_senjata_4,
			R.string.s_prov_senjata_5,
			R.string.s_prov_senjata_6,
			R.string.s_prov_senjata_7,
			R.string.s_prov_senjata_8,
			R.string.s_prov_senjata_9,
			R.string.s_prov_senjata_10,
			R.string.s_prov_senjata_11,
			R.string.s_prov_senjata_12,
			R.string.s_prov_senjata_13,
			R.string.s_prov_senjata_14,
			R.string.s_prov_senjata_15,
			R.string.s_prov_senjata_16,
			R.string.s_prov_senjata_17,
			R.string.s_prov_senjata_18,
			R.string.s_prov_senjata_19,
			R.string.s_prov_senjata_20,
			R.string.s_prov_senjata_21,
			R.string.s_prov_senjata_22,
			R.string.s_prov_senjata_23,
			R.string.s_prov_senjata_24,
			R.string.s_prov_senjata_25,
			R.string.s_prov_senjata_26,
			R.string.s_prov_senjata_27,
			R.string.s_prov_senjata_28,
			R.string.s_prov_senjata_29,
			R.string.s_prov_senjata_30,
			R.string.s_prov_senjata_31,
			R.string.s_prov_senjata_32,
			R.string.s_prov_senjata_33
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.tab_item_senjatatradisional, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtSenjata);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) 
				txt.setText(Listsenjata[i]);
		}
	
	
		return rootView;
	}
}
