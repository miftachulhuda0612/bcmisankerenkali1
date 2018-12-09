package com.insyaallahsukses.misan.belanjaancustomer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class SplashScreen extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        try{
//            VideoView videoHolder = new VideoView(this);
//            setContentView(videoHolder);
            Uri video = Uri.parse("android.resource://" + getPackageName() + "/"
                    + R.raw.textintro);
//            videoHolder.setVideoURI(video);
            videoView.setVideoURI(video);

            videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            });

//            videoHolder.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
//
//                public void onCompletion(MediaPlayer mp) {
////                    jump();
//                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
//                    startActivity(i);
//                    finish();
//                }
//
//            });
//            videoHolder.start();
            videoView.start();
        } catch(Exception ex) {
//            jump();
            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);
            finish();
        }



//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent i = new Intent(SplashScreen.this, MainActivity.class);
//                startActivity(i);
//                finish();
//            }
//        }, SPLASH_TIME_OUT);
    }
}
