package br.ulbra.jokenpo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivityIni extends AppCompatActivity {

    private Handler handler = new Handler();
    private Runnable runnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_ini);

        runnable = new Runnable() {
            @Override
            public void run() {
             Intent intent = new Intent(SplashActivityIni.this,MainActivity.class);
             startActivity(intent);
             finish();
            }
        };
        handler.postDelayed(runnable, 4000);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}