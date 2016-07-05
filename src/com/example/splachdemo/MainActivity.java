package com.example.splachdemo;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		findViewById(R.id.bt_hadler).setOnClickListener(this);
		findViewById(R.id.bt_animion).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bt_hadler:
			startActivity(new Intent(this, SplachActivity_handler.class));
			break;

		case R.id.bt_animion:
			startActivity(new Intent(this, SplachActivity_ani.class));
			break;
		}
	}

}
