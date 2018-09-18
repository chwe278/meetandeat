package hs_augsburg.de.meetandeat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateHostEventActivity extends AppCompatActivity {


    EditText postcode, city, description, tags, date, address, title, ppl_amount, dish, missIngredient, missMass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_hostevent);


        Button btn_Publish  = findViewById(R.id.btn_Publish);
        btn_Publish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(startIntent);

               //* Cook ce = new Cook(postcode, city, description, tags, date, address,
                  //      title, ppl_amount, dish, missIngredient, missMass);



            }
        });
    }
}
