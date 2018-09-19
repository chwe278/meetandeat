package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class CreateHostEventActivity extends AppCompatActivity implements View.OnClickListener {


    EditText postcode, city, description, tags, date, address, title, ppl_amount, dish, missIngredient, missMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_hostevent);

        postcode = findViewById(R.id.text_EventPostcode);
        city = findViewById(R.id.text_EventCity);
        description = findViewById(R.id.text_EventDescription);
        tags = findViewById(R.id.text_EventTags);
        date = findViewById(R.id.text_EventDate);
        address = findViewById(R.id.text_EventAddress);
        title = findViewById(R.id.text_EventTitle);
        ppl_amount = findViewById(R.id.number_People);
        dish = findViewById(R.id.text_EventDish);
        missIngredient = findViewById(R.id.text_EventIngredient);
        missMass = findViewById(R.id.text_EventMass);


        Button btn_Publish = findViewById(R.id.btn_publish);
        ImageButton imgbtn_logo = findViewById(R.id.imgbtn_logo);
        ImageButton imgbtn_name = findViewById(R.id.imgbtn_name);
        btn_Publish.setOnClickListener(this);
        imgbtn_logo.setOnClickListener(this);
        imgbtn_name.setOnClickListener(this);
    }

        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_publish:
                    StartEvent se = new StartEvent();

                    String s_postcode = postcode.getText().toString();
                    String s_city = city.getText().toString();
                    String s_description = description.getText().toString();
                    String s_tags = tags.getText().toString();
                    String s_date = date.getText().toString();
                    String s_address = address.getText().toString();
                    String s_title = title.getText().toString();
                    String s_ppl_amount = ppl_amount.getText().toString();
                    String s_dish = dish.getText().toString();
                    String s_missIngredient = missIngredient.getText().toString();
                    String s_missMass = missMass.getText().toString();

                    Cook ce = new Cook(s_postcode, s_city, s_description, s_tags, s_date, s_address, s_title, s_ppl_amount, s_dish, s_missIngredient, s_missMass);
                    se.getEventList().add(ce);

                    Intent startIntent1 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startIntent1);
                    break;
                case R.id.imgbtn_logo:
                    Intent startIntent2 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startIntent2);
                    break;
                case R.id.imgbtn_name:
                    Intent startIntent3 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startIntent3);
                    break;
            }
        }
}
