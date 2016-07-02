package com.yes.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class SplashScreen extends Activity {

	LinearLayout mainLayout = null;
    MediaPlayer mediaPlayer = null;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = (LinearLayout) findViewById(R.id.mainLayout);
        mediaPlayer = new  MediaPlayer();
        mediaPlayer = MediaPlayer.create(this, R.raw.midi_sound);
        mediaPlayer.start();
        
        mainLayout.setOnTouchListener(new OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent startGame = new Intent(SplashScreen.this,TicTacToeActivity.class);
				startActivity(startGame);
				finish();
				return false;
			}
		});
    }

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		mediaPlayer.stop();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mediaPlayer.pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		if(!mediaPlayer.isPlaying()){
			mediaPlayer.start();
		}
	}
    
    
}
