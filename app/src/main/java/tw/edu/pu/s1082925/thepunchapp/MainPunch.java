package tw.edu.pu.s1082925.thepunchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainPunch extends AppCompatActivity {

    Button btnPunch;
    ImageButton ibSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_punch);


        btnPunch = findViewById(R.id.btnPunch);
        ibSettings = findViewById(R.id.ibSettings);


        ibSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), PunchHistory.class);
                startActivity(i);
            }
        });

        btnPunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ModifyHours.class);
                startActivity(i);
            }
        });
    }
}