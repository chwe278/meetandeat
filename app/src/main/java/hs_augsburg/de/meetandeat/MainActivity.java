package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // ListView listView_hostEvent;
    private ListView lvCook;
    private EventListAdapter eAdapter;
    private List<Cook> mCookList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCook = findViewById(R.id.lv_cook);

        mCookList = new ArrayList<>();

        mCookList.add(new Cook("86150", "Augsburg", "Nice swabian food and some beer", "#beer", "10.10.2018", "Maxstr.", "Swabian Evening", "4", "Kässpätzle", "Emmentaler", "500g"));
        mCookList.add(new Cook("86637", "Wertingen", "Guades Vesper", "#brotzeit", "15.10.2018", "Kanalstr..", "Gemütliche Brotzeit", "2", "Brotzeit", "Brot", "1 Laib"));

        eAdapter = new EventListAdapter(getApplicationContext(), mCookList);
        lvCook.setAdapter(eAdapter);

        Button btn_new = findViewById(R.id.btn_new);
        ImageButton imgbtn_logo = findViewById(R.id.imgbtn_logo);
        ImageButton imgbtn_name = findViewById(R.id.imgbtn_name);
        btn_new.setOnClickListener(this);
        imgbtn_logo.setOnClickListener(this);
        imgbtn_name.setOnClickListener(this);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.imgbtn_logo:
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent);
                break;
            case R.id.imgbtn_name:
                Intent startIntent2 = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(startIntent2);
                break;
            case R.id.btn_new:
                Intent startIntent3 = new Intent(getApplicationContext(), CreateHostGuestActivity.class);
                startActivity(startIntent3);
                break;

        }
    }
}