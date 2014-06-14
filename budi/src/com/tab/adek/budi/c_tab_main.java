package com.tab.adek.budi;

import com.tab.adek.budi.*;
import com.act.adek.budi.c_media;
import com.adek.budi.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import android.widget.TextView;

@SuppressWarnings("unused")
public class c_tab_main extends FragmentActivity implements
		ActionBar.TabListener {
	private ViewPager viewPager;
	private c_tab_adapter mAdapter;
	private ActionBar actionBar;
	// Tab titles
	private String[] tabs = { "Tari Daerah","Pakaian Adat" ,"Rumah Adat","Makanan Khas","Senjata Tradisional","Suku Daerah","Lagu Daerah"};

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		overridePendingTransition(R.anim.toright,0);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_main);
		// Initilization
		viewPager = (ViewPager) findViewById(R.id.pager);
		actionBar = getActionBar();
		mAdapter = new c_tab_adapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);
		actionBar.setHomeButtonEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);		

		// Adding Tabs
		for (String tab_name : tabs) {
			actionBar.addTab(actionBar.newTab().setText(tab_name)
					.setTabListener(this));
		}

		/**
		 * on swiping the viewpager make respective tab selected
		 * */
		viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				// on changing the page
				// make respected tab selected
				actionBar.setSelectedNavigationItem(position);
			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
			}
		});
	}
	

	@Override
	public void onBackPressed() {
		if(c_media.status){
			c_media.stop();
		}else{
			c_media.mp = null;
		}
	    finish();//go back to the previous Activity
        overridePendingTransition(R.anim.toleft,0);   
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
	}

	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		// on tab selected
		// show respected fragment view
		viewPager.setCurrentItem(tab.getPosition());
	}

	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
	}

}