package com.example.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DayOptionActivity extends AppCompatActivity {
    CheckBox monday, tuesday, wednesday, thursday, friday;
    Button select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day);
        addListeneronButtonClick();

    }
    public void addListeneronButtonClick() {
        monday =   findViewById(R.id.checkBox1);
        tuesday =    findViewById(R.id.checkBox2);
        wednesday =    findViewById(R.id.checkBox2);
        thursday =    findViewById(R.id.checkBox2);
        friday =    findViewById(R.id.checkBox2);
        select =findViewById(R.id.button);


        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(monday.isChecked() && wednesday.isChecked()){

                    Intent yesPage = new Intent(DayOptionActivity.this,MonWedActivity.class);
                    startActivity(yesPage);
                }else if(tuesday.isChecked() && thursday.isChecked()){
                    Intent anotherOption = new Intent (DayOptionActivity.this,TueThuActivity.class);
                    startActivity(anotherOption);


                } else {
                    Intent anotherOption = new Intent (DayOptionActivity.this,MonWedActivity.class);
                    startActivity(anotherOption);
                }

            }


        });


    }
}
