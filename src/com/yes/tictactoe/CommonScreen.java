package com.yes.tictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CommonScreen extends Activity{

	TextView textView = null;
	Button newGameBtn = null, quitBtn = null;
	Intent intent = null;
	ImageView image = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.common);
		
		Bundle bundle = getIntent().getExtras();
		String result = bundle.getString("RESULT");
		textView = (TextView) findViewById(R.id.text);
		newGameBtn = (Button) findViewById(R.id.new_game);
		quitBtn = (Button) findViewById(R.id.quit);
		image = (ImageView) findViewById(R.id.img);
		
		System.out.println("result >>>>>> "+result);
		if(result != null && (result.equals("ZERO") || result.equals("CROSS"))){
			image.setBackgroundResource(R.drawable.winn);
			textView.setText(result);
		}else{
			image.setBackgroundResource(R.drawable.game_over);
		}
		
		newGameBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			intent = new Intent(CommonScreen.this, TicTacToeActivity.class);
			startActivity(intent);
			finish();
			}
		});
		
		quitBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
}
