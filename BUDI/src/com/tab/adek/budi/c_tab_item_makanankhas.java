package com.tab.adek.budi;
import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class c_tab_item_makanankhas extends Fragment {
	
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	
	private int[] Listmakanan ={
			R.string.s_prov_makanan_0,
			R.string.s_prov_makanan_1,
			R.string.s_prov_makanan_2,
			R.string.s_prov_makanan_3,
			R.string.s_prov_makanan_4,
			R.string.s_prov_makanan_5,
			R.string.s_prov_makanan_6,
			R.string.s_prov_makanan_7,
			R.string.s_prov_makanan_8,
			R.string.s_prov_makanan_9,
			R.string.s_prov_makanan_10,
			R.string.s_prov_makanan_11,
			R.string.s_prov_makanan_12,
			R.string.s_prov_makanan_13,
			R.string.s_prov_makanan_14,
			R.string.s_prov_makanan_15,
			R.string.s_prov_makanan_16,
			R.string.s_prov_makanan_17,
			R.string.s_prov_makanan_18,
			R.string.s_prov_makanan_19,
			R.string.s_prov_makanan_20,
			R.string.s_prov_makanan_21,
			R.string.s_prov_makanan_22,
			R.string.s_prov_makanan_23,
			R.string.s_prov_makanan_24,
			R.string.s_prov_makanan_25,
			R.string.s_prov_makanan_26,
			R.string.s_prov_makanan_27,
			R.string.s_prov_makanan_28,
			R.string.s_prov_makanan_29,
			R.string.s_prov_makanan_30,
			R.string.s_prov_makanan_31,
			R.string.s_prov_makanan_32,
			R.string.s_prov_makanan_33
	};
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
			//String temp = "";
		View rootView = inflater.inflate(R.layout.tab_item_makanankhas, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtMakanan);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) 
				txt.setText(Listmakanan[i]);
		}
	
		return rootView;
	}
}
