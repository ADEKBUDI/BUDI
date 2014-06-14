package com.tab.adek.budi;


import com.adek.budi.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class c_tab_item_penjelasansuku extends Fragment {
	private String[] listProv = {
			"NAD","Sumatera Utara","Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi"
			,"Sumatera Selatan","Bangka Belitung","Bengkulu","Lampung","Banten"
			,"DKI Jakarta","Jawa Barat","Jawa Tengah","DI Yogyakarta","Jawa Timur"
			,"Kalimantan Barat","Kalimantan Tengah","Kalimantan Selatan","Kalimantan Timur"
			,"Sulawesi Selatan","Sulawesi Barat","Sulawesi Tenggara","Sulawesi Tengah"
			,"Gorontalo","Sulawesi Utara","Bali","Nusa Tenggara Barat","Nusa Tenggara Timur"
			,"Maluku","Maluku Utara","Papua Barat","Papua","Kalimantan Utara"
	};
	private int[] listsuku = {
			R.string.s_prov_suku_0,
			R.string.s_prov_suku_1,
			R.string.s_prov_suku_2,
			R.string.s_prov_suku_3,
			R.string.s_prov_suku_4,
			R.string.s_prov_suku_5,
			R.string.s_prov_suku_6,
			R.string.s_prov_suku_7,
			R.string.s_prov_suku_8,
			R.string.s_prov_suku_9,
			R.string.s_prov_suku_10,
			R.string.s_prov_suku_11,
			R.string.s_prov_suku_12,
			R.string.s_prov_suku_13,
			R.string.s_prov_suku_14,
			R.string.s_prov_suku_15,
			R.string.s_prov_suku_16,
			R.string.s_prov_suku_17,
			R.string.s_prov_suku_18,
			R.string.s_prov_suku_19,
			R.string.s_prov_suku_20,
			R.string.s_prov_suku_21,
			R.string.s_prov_suku_22,
			R.string.s_prov_suku_23,
			R.string.s_prov_suku_24,
			R.string.s_prov_suku_25,
			R.string.s_prov_suku_26,
			R.string.s_prov_suku_27,
			R.string.s_prov_suku_28,
			R.string.s_prov_suku_29,
			R.string.s_prov_suku_30,
			R.string.s_prov_suku_31,
			R.string.s_prov_suku_32,
			R.string.s_prov_suku_33
	};
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		String temp = "";
		View rootView = inflater.inflate(R.layout.tab_item_penjelasansuku, container, false);
		Bundle data = getActivity().getIntent().getExtras();
		String kirim = data.getString("kirim");
		TextView txt = (TextView)rootView.findViewById(R.id.txtSuku);
		TextView txtp = (TextView)rootView.findViewById(R.id.txtP);
		temp +=txtp.getText()+ " "+kirim;
		txtp.setText(temp);
		for(int i=0;i<listProv.length;i++){ 
			if(kirim.equals(listProv[i])) 
				txt.setText(listsuku[i]);
		}
		return rootView;
	}
}
