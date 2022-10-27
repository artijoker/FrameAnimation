package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        ImageView img = findViewById(R.id.animationView);
        img.setBackgroundResource(R.drawable.frame_animation_right);
        findViewById(R.id.button_left).setOnTouchListener((v, event) -> {
            img.setBackgroundResource(R.drawable.frame_animation_left);
            AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
            if (event.getAction() == MotionEvent.ACTION_DOWN){
                frameAnimation.start();
                v.performClick();
                return true;
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                frameAnimation.stop();
                v.performClick();
                return true;
            }
            return false;
        });
        findViewById(R.id.button_right).setOnTouchListener((v, event) -> {
            img.setBackgroundResource(R.drawable.frame_animation_right);
            AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
            if (event.getAction() == MotionEvent.ACTION_DOWN){
                frameAnimation.start();
                v.performClick();
                return true;
            }
            if (event.getAction() == MotionEvent.ACTION_UP){
                frameAnimation.stop();
                v.performClick();
                return true;
            }
            return false;
        });
    }
}