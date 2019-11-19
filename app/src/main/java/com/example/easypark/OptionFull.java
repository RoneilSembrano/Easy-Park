package com.example.easypark;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class OptionFull extends AppCompatActivity  {
    Button select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_optionfull);
        addListeneronButtonClick();

    }

    public void addListeneronButtonClick() {
        select = (Button) findViewById(R.id.button);
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(OptionFull.this, "Permit Selected", Toast.LENGTH_SHORT).show();
                Intent MainPage = new Intent(OptionFull.this, MainActivity.class);
                startActivity(MainPage);
            }
        });

//new thing
    }
}
