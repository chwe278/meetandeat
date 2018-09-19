package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

   // ListView listView_hostEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // listView_hostEvent = findViewById(R.id.listView_hostEvents);


        Button btn_new = findViewById(R.id.btn_new);
        ImageButton imgbtn_logo = findViewById(R.id.imgbtn_logo);
        ImageButton imgbtn_name = findViewById(R.id.imgbtn_name);
        btn_new.setOnClickListener(this);
        imgbtn_logo.setOnClickListener(this);
        imgbtn_name.setOnClickListener(this);
    }

        public void onClick(View view){

            switch (view.getId()) {
                case R.id.imgbtn_logo:
                    Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startIntent);
                    break;
                case R.id.imgbtn_name:
                    Intent startIntent2 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startIntent2);
                    break;
            }
        }
    }