package com.yes.tictactoe;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
 
public class TicTacToeActivity extends Activity {
private Game game1;
 
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
game1 = new Game(this);
setContentView(game1);
}

@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();
	finish();
}

@Override
protected void onStop() {
	// TODO Auto-generated method stub
	super.onStop();
}

@Override  
public boolean onCreateOptionsMenu(Menu menu) {  
    // Inflate the menu; this adds items to the action bar if it is present.  
    getMenuInflater().inflate(R.menu.main, menu);//Menu Resource, Menu
    MenuItem quit_game = menu.findItem(R.id.item1);
    MenuItem new_game = menu.findItem(R.id.item2);
    
    ShapeDrawable circle = new ShapeDrawable(new OvalShape());
    circle.getPaint().setColor(Color.CYAN);
    circle.setIntrinsicHeight(120);
    circle.setIntrinsicWidth(120);
    circle.setBounds(120, 120, 120, 120);
    
    quit_game.setIcon(circle);
    new_game.setIcon(circle);
    return true;  
}  

@Override  
public boolean onOptionsItemSelected(MenuItem item) {  
    switch (item.getItemId()) {  
        case R.id.item1:
        	System.out.println("clicked on Quit option");
        	this.finish();
        return true;     
        case R.id.item2: 
        	System.out.println("clicked on New Game");
        	Intent newGame = new Intent(TicTacToeActivity.this,TicTacToeActivity.class);
        	startActivity(newGame);
        	this.finish();
        	return true;     
          default:  
            return super.onOptionsItemSelected(item);  
    }  
}  
}
