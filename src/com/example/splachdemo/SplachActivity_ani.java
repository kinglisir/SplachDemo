package com.example.splachdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.RelativeLayout;

public class SplachActivity_ani extends Activity {
		private RelativeLayout rl_root;

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.splashactivity);
			rl_root = (RelativeLayout) findViewById(R.id.rl_root);
			startani();
		}

		private void startani() {
			//旋转
			//fromDegrees : 开始的角度
			//toDegrees : 结束的角度
			//pivotXType, pivotXValue, pivotYType, pivotYValue : 旋转的类型,旋转的坐标
			RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
			rotateAnimation.setDuration(1000);
			rotateAnimation.setFillAfter(true);//保持动画结束的状态
			//缩放
			//fromX, x轴开始的尺寸  0没有尺寸   1整个控件
			//toX,  x轴结束的尺寸
			//fromY, y轴开始的尺寸
			//toY  y轴结束的尺寸
			// pivotXType, pivotXValue, pivotYType, pivotYValue : 缩放的类型以及缩放的坐标
			ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
			scaleAnimation.setDuration(1000);
			scaleAnimation.setFillAfter(true);
			//渐变
			//fromAlpha : 开始的透明度
			//toAlpha : 结束的透明度
			AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
			alphaAnimation.setDuration(2000);
			alphaAnimation.setFillAfter(true);
			//组合动画
			//shareInterpolator : 是否使用共享的动画插补器,true:使用   false:不使用,各自使用各自的
			AnimationSet animationSet = new AnimationSet(true);
			animationSet.addAnimation(rotateAnimation);//添加动画
			animationSet.addAnimation(scaleAnimation);
			animationSet.addAnimation(alphaAnimation);
			//执行动画
			rl_root.setAnimation(animationSet);
			animationSet.startNow();
			
			//动画结束,根据是否是第一个安装进入,跳转不同的界面
			animationSet.setAnimationListener(animationListener);
		}
		
		/**
		 * 动画监听
		 */
		private AnimationListener animationListener = new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
				// TODO Auto-generated method stub
				
			}
			
			//动画结束后跳转到主页面
			public void onAnimationEnd(Animation animation) {
				
				startActivity(new Intent(SplachActivity_ani.this,HomeActivity.class));
			}
		};
}
