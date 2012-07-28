package com.matenaers.ansetdroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AnSetDroidActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	
	Button aboutBut;
	Button wiSetBut;
	Button riSetBut;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        aboutBut = (Button) findViewById(R.id.aboutBut);
        aboutBut.setOnClickListener((android.view.View.OnClickListener) this);
        
        wiSetBut = (Button) findViewById(R.id.wiSetBut);
        wiSetBut .setOnClickListener((android.view.View.OnClickListener) this);
        
        riSetBut = (Button) findViewById(R.id.riSetBut);
        riSetBut .setOnClickListener((android.view.View.OnClickListener) this);
        
        
    }
    
    public void onClick (View v) {
    	
    	if (v.getId() == R.id.aboutBut ) {
    		Intent intent = new Intent(this, AboutActivity.class);
    		startActivity(intent);
    	}
    	if (v.getId() == R.id.wiSetBut ) {
    		Intent intent = new Intent(this, WirelessMainActivity.class);
    		startActivity(intent);
    	}
    	if (v.getId() == R.id.riSetBut ) {
    		Intent intent = new Intent(this, RingerMainActivity.class);
    		startActivity(intent);
    	}
        	
    	
    	/*
    	 switch (v.getId()) {
    		
    		case R.id.aboutBut : {
        		Intent intent = new Intent(this, AboutActivity.class);
        		startActivity(intent);
        	}
    		
    		case R.id.wiSetBut : {
    			Intent intent = new Intent(this, WirelessMainActivity.class);
        		startActivity(intent);
    		}
    		case R.id.riSetBut : {
    			Intent intent = new Intent(this, RingerMainActivity.class);
        		startActivity(intent);
    		}
    	}
    	*/
    }
}