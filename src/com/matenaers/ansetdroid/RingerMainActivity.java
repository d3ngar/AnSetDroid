package com.matenaers.ansetdroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class RingerMainActivity extends Activity {
	
	private ToggleButton volToggleBut;
	private ToggleButton notifyToggleBut;
	private ToggleButton vibrToggleBut;
	
	public RingerMainActivity() {
		
	}
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.ringermain);
        
        volToggleBut = (ToggleButton) findViewById(R.id.volToggleBut);
        notifyToggleBut = (ToggleButton) findViewById(R.id.notifyToggleBut);
        vibrToggleBut = (ToggleButton) findViewById(R.id.vibrToggleBut);
        
        volToggleBut.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.out.println("Volume Toggle Pressed");
			}
			
        });
        
        notifyToggleBut.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.out.println("Notify Toggle Pressed");
			}
			
        });
		
		vibrToggleBut.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.out.println("Vibrate Toggle Pressed");
			}
			
        });
        
	}
    
}
