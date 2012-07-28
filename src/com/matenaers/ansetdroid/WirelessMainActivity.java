package com.matenaers.ansetdroid;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ToggleButton;

public class WirelessMainActivity extends Activity implements OnClickListener {
	
	private ToggleButton wifiToggleBut;
	private ToggleButton tetherToggleBut;
	private ToggleButton gsmToggleBut;
	private ToggleButton roamToggleBut;
	private boolean wifistatus;
	private  WifiManager wifi;
	
	public WirelessMainActivity() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wirelessmain);
        
        //Getting the status for the menu items
        wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);
        wifistatus = wifi.isWifiEnabled();
        System.out.println("Wifi is enabled : " + wifistatus);
        
        wifiToggleBut = (ToggleButton) findViewById(R.id.wifiToggleBut);
        if (wifistatus) wifiToggleBut.setChecked(true);
        else wifiToggleBut.setChecked(false);        
        
        wifiToggleBut.setOnClickListener((android.view.View.OnClickListener) this);
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (!wifistatus) {
			wifi.setWifiEnabled(true);
			 wifistatus = wifi.isWifiEnabled();
			System.out.println("Wifi is enabled : " + wifistatus);
		}
		else {
			wifi.setWifiEnabled(false);
		}
		
	}

}
