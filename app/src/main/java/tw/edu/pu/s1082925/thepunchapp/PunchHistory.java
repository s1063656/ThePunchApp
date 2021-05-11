package tw.edu.pu.s1082925.thepunchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PunchHistory extends AppCompatActivity {

    ImageButton toBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punch_history);

        toBack = findViewById(R.id.ibGoBack);


        toBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainPunch.class);
                startActivity(i);
            }
        });
    }
}