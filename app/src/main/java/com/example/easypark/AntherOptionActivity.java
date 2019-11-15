package com.example.easypark;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;


public class AntherOptionActivity extends AppCompatActivity {
    CheckBox yes, no;
    Button select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anther_option);
        addListeneronButtonClick();

    }
    public void addListeneronButtonClick() {
        yes = findViewById(R.id.checkBox1);
        no = findViewById(R.id.checkBox2);
        select = findViewById(R.id.button);


        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yes.isChecked()){
                    Intent yesPage = new Intent(AntherOptionActivity.this, DayOptionActivity.class);
                    startActivity(yesPage);
                }else{
                    Intent noPage = new Intent (AntherOptionActivity.this, OptionActivity.class);
                    startActivity((noPage));

                }

            }


        });


    }
}
