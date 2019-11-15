package com.example.easypark;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class OptionActivity extends AppCompatActivity{
    CheckBox yes, no;
    Button select;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        addListeneronButtonClick();

    }
    public void addListeneronButtonClick() {
        yes = (CheckBox)findViewById(R.id.checkBox1);
        no = (CheckBox)findViewById(R.id.checkBox2);
        select =(Button)findViewById(R.id.button);


        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(yes.isChecked()){
                    Intent yesPage = new Intent(OptionActivity.this,OptionFull.class);
                    startActivity(yesPage);
                }else{
                    Intent noPage = new Intent (OptionActivity.this,AntherOptionActivity.class);
                    startActivity((noPage));


                }

            }


        });
    }
}


