package com.example.splachdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;

public class SplachActivity_handler extends Activity implements Callback{
	
			private Handler handler = new Handler(this);
			protected void onCreate(Bundle savedInstanceState) {
				// TODO Auto-generated method stub
				super.onCreate(savedInstanceState);
				setContentView(R.layout.splashactivity);
				handler.sendEmptyMessageDelayed(0, 1500);
			}

			@Override
			public boolean handleMessage(Message msg) {
				// TODO Auto-generated method stub
				if(msg.what==0){
					startActivity(new Intent(this,HomeActivity.class));
				}
				return false;
			}
}
