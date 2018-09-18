package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class CreateHostGuestActivity extends AppCompatActivity implements View.OnClickListener{

    ArrayList<Event> eventList = new ArrayList<>();
    int sortOfEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_hostguest);

        Button btn_host = findViewById(R.id.btn_host);
        Button btn_guest = findViewById(R.id.btn_guest);
        ImageButton imgbtn_logo = findViewById(R.id.imgbtn_logo);
        ImageButton imgbtn_name = findViewById(R.id.imgbtn_name);
        btn_host.setOnClickListener(this);
        btn_guest.setOnClickListener(this);
        imgbtn_logo.setOnClickListener(this);
        imgbtn_name.setOnClickListener(this);
    }

            public void onClick(View view) {

                switch (view.getId()) {
                    case R.id.btn_host:
                        sortOfEvent = 1;
                        Intent startIntent = new Intent(getApplicationContext(), CreateHostEventActivity.class);
                        startActivity(startIntent);
                        break;
                    case R.id.btn_guest:
                        sortOfEvent = 3;
                        Intent startIntent2 = new Intent(getApplicationContext(), CreateGuestEventActivity.class);
                        startActivity(startIntent2);
                        break;
                    case R.id.imgbtn_logo:
                        Intent startIntent3 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(startIntent3);
                        break;
                    case R.id.imgbtn_name:
                        Intent startIntent4 = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(startIntent4);
                        break;
                }
            }
        }








