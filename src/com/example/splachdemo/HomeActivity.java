package com.example.splachdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		TextView view = new TextView(this);
		view.setText("Ö÷Ò³Ãæ");
		setContentView(view);
		
	}
}
