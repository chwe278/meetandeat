package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

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
        btn_host.setOnClickListener(this);
        btn_guest.setOnClickListener(this);
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
                }
            }


        }








