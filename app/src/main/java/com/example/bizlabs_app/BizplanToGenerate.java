package com.example.bizlabs_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

//import com.daimajia.androidanimations.library.Techniques;
//import com.daimajia.androidanimations.library.YoYo;

import java.util.Timer;
import java.util.TimerTask;

public class BizplanToGenerate extends AppCompatActivity {
//    ImageView img;
    Handler h1;
    ProgressBar pb;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bizplan_to_generate);
        prog();
//        Intent i = new Intent(getApplicationContext(), pdfReader.class);
//        startActivity(i);
//    };
//        img = (ImageView) findViewById(R.id.loadView);

        h1 = new Handler();
        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
//                String messageNotification = "Dokumen Bisnis Plan Anda Berhasil Digenerate.";
//                NotificationCompat.Builder builder = new NotificationCompat.Builder(BizplanToGenerate.this)
//                        .setSmallIcon(R.drawable.ic_message)
//                        .setContentTitle("New Notification")
//                        .setContentText(messageNotification)
//                        .setAutoCancel(true);
                Toast.makeText(BizplanToGenerate.this, "Dokumen Business Plan Anda Berhasil Digenerate.", Toast. LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), pdfReader.class);
                startActivity(i);
            }
        }, 10000);
    };

    public void prog() {
        pb = (ProgressBar) findViewById(R.id.pb);
        final Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                pb.setProgress(counter);

                if (counter==100)
                    t.cancel();
            }
        };

        t.schedule(tt, 0, 10000);
    }

//    public void prog() {
//        YoYo.with(Techniques.RotateIn).duration(10000).repeat(0).playOn(img);
//    };
}