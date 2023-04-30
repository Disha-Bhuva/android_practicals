package com.example.prac_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class show_notification extends AppCompatActivity {
Button sendNotice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_notification);
        sendNotice = (Button) findViewById(R.id.send_notice);
        if(Build.VERSION.SDK_INT >=Build.VERSION_CODES.O){

            NotificationChannel channel= new NotificationChannel("My Notification","My Notification",NotificationManager.IMPORTANCE_DEFAULT);
            NotificationManager manager =getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }
        sendNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message="This is Notification...";
                NotificationCompat.Builder builder = new NotificationCompat.Builder(show_notification.this,"My Notification");
                builder.setContentTitle("NotificationTitle");
                builder.setContentText(message);
                builder.setSmallIcon(R.drawable.ic_launcher);
                builder.setAutoCancel(true);
                NotificationManagerCompat managerCompat=NotificationManagerCompat.from(show_notification.this);
                managerCompat.notify(1,builder.build());

            }
        });
    }
}