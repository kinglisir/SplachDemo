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
			//��ת
			//fromDegrees : ��ʼ�ĽǶ�
			//toDegrees : �����ĽǶ�
			//pivotXType, pivotXValue, pivotYType, pivotYValue : ��ת������,��ת������
			RotateAnimation rotateAnimation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
			rotateAnimation.setDuration(1000);
			rotateAnimation.setFillAfter(true);//���ֶ���������״̬
			//����
			//fromX, x�Ὺʼ�ĳߴ�  0û�гߴ�   1�����ؼ�
			//toX,  x������ĳߴ�
			//fromY, y�Ὺʼ�ĳߴ�
			//toY  y������ĳߴ�
			// pivotXType, pivotXValue, pivotYType, pivotYValue : ���ŵ������Լ����ŵ�����
			ScaleAnimation scaleAnimation = new ScaleAnimation(0, 1, 0, 1, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
			scaleAnimation.setDuration(1000);
			scaleAnimation.setFillAfter(true);
			//����
			//fromAlpha : ��ʼ��͸����
			//toAlpha : ������͸����
			AlphaAnimation alphaAnimation = new AlphaAnimation(0, 1);
			alphaAnimation.setDuration(2000);
			alphaAnimation.setFillAfter(true);
			//��϶���
			//shareInterpolator : �Ƿ�ʹ�ù���Ķ����岹��,true:ʹ��   false:��ʹ��,����ʹ�ø��Ե�
			AnimationSet animationSet = new AnimationSet(true);
			animationSet.addAnimation(rotateAnimation);//��Ӷ���
			animationSet.addAnimation(scaleAnimation);
			animationSet.addAnimation(alphaAnimation);
			//ִ�ж���
			rl_root.setAnimation(animationSet);
			animationSet.startNow();
			
			//��������,�����Ƿ��ǵ�һ����װ����,��ת��ͬ�Ľ���
			animationSet.setAnimationListener(animationListener);
		}
		
		/**
		 * ��������
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
			
			//������������ת����ҳ��
			public void onAnimationEnd(Animation animation) {
				
				startActivity(new Intent(SplachActivity_ani.this,HomeActivity.class));
			}
		};
}
