package com.example.blg2025hafta10001;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab;
    TextView textView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView);


    }

    public void Play(View view) {
       Button v= (Button) view;
       int id= v.getId();
       String resId= getResources().getResourceEntryName(id);
       int mp3Id= getResources().getIdentifier(resId, "raw", getPackageName());
       MediaPlayer mediaPlayer= MediaPlayer.create(this, mp3Id);
       mediaPlayer.start();
       textView.setText(resId);





    }
}