package com.yes.tictactoe;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.media.MediaPlayer;
 
public class Cross extends Cell {
	
	Context context = null;
 
public Cross(int x, int y,Context context) {
super(x, y);
context = this.context;
}
 
public void draw(Canvas g, Resources res, int x, int y, int w, int h) {
Bitmap im = BitmapFactory.decodeResource(res, R.drawable.cross);
g.drawBitmap(im, null, new Rect(x*w, y*h, (x*w)+w, (y*h)+h), new Paint());
}
 
@Override
public boolean equals(Object obj) {
if (obj instanceof Cross) {
return true;
} else {
return false;
}
}
 
@Override
public String toString() {
return "X";
}
}