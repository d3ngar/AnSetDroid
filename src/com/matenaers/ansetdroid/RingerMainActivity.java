package com.matenaers.ansetdroid;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

public class RingerMainActivity extends Activity {
	
	private ToggleButton volToggleBut;
	private ToggleButton notifyToggleBut;
	private ToggleButton vibrToggleBut;
	private AudioManager audioManager;
	
	public RingerMainActivity() {
		
	}
	
	private void setToggleButtons() {
		if (audioManager.getRingerMode() == AudioManager.RINGER_MODE_VIBRATE) {
        	vibrToggleBut.setChecked(true);
        }
		else vibrToggleBut.setChecked(false);
		
        if (audioManager.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
        	volToggleBut.setChecked(false);
        }
        else volToggleBut.setChecked(true);
	}
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
        setContentView(R.layout.ringermain);

        volToggleBut = (ToggleButton) findViewById(R.id.volToggleBut);
        notifyToggleBut = (ToggleButton) findViewById(R.id.notifyToggleBut);
        vibrToggleBut = (ToggleButton) findViewById(R.id.vibrToggleBut);
        
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        
        setToggleButtons();
       
        volToggleBut.setOnClickListener(new OnClickListener(){
        	
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.out.println("Volume Toggle Pressed");
				
				if (audioManager.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
					audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
				}
				else audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
				setToggleButtons();
				
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
				if (audioManager.getRingerMode() == AudioManager.RINGER_MODE_VIBRATE) {
					audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
				}
				else audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
				setToggleButtons();
				
			}
			
        });
        
	}
    
}
