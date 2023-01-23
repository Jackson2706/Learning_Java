package com.example.imageview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    RelativeLayout display;
    ImageButton btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main_activity);

        imageView = (ImageView) findViewById(R.id.imageView);
        display = (RelativeLayout) findViewById(R.id.display);
        btn = (ImageButton) findViewById(R.id.btn);

        imageView.setImageResource(R.drawable.download_1);
        display.setBackgroundResource(R.drawable.background);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Đã ấn",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
