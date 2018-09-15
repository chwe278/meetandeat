package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CreateHEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_hevent);

        Button btn_Publish  = findViewById(R.id.btn_Publish);
        btn_Publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create Event in array or in sql
                Intent startIntent = new Intent(getApplicationContext(),EventOverview.class);
                startActivity(startIntent);

            }
        });
    }
}
