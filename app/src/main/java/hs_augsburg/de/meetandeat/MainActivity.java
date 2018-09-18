package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView_hostEvent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView_hostEvent = findViewById(R.id.)

        Button btn_new  = findViewById(R.id.btn_new);

       btn_new.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent newIntent = new Intent(getApplicationContext(), CreateHostGuestActivity.class);
               startActivity(newIntent);
           }
       });
    }
}
