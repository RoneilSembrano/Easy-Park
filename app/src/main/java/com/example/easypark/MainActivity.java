package com.example.easypark;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {
    EditText mTextStudentID;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;
    DatabaseHelper db;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // db = new DatabaseHelper(this);

        mTextStudentID = (EditText)findViewById(R.id.edittext_studentid);
        mTextPassword = (EditText)findViewById(R.id.edittext_password);
        mButtonLogin = (Button) findViewById(R.id.button_login);
        mTextViewRegister = (TextView) findViewById(R.id.textview_register);

        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                    Intent registerIntent = new Intent(MainActivity.this,RegisterActivity.class);
                    startActivity(registerIntent);
                   // Intent HomePage = new Intent(MainActivity.this,HomeActivity.class);
                    //startActivity(HomePage);
    }
});
        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    Toast.makeText(MainActivity.this,"Log in is successful", Toast.LENGTH_SHORT).show();
                    Intent HomePage = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(HomePage);
                }

               // Boolean res = db.checkUser(user, pwd);
                //if (res == true)
                // hardcode
                //if(!(mTextStudentID.equals("1234") && mTextPassword.equals("password")))

                //{
                //    Intent HomePage = new Intent(MainActivity.this,HomeActivity.class);
                //    startActivity(HomePage);
               // }
                //else
                //{
                    //Toast.makeText(MainActivity.this,"Login Error",Toast.LENGTH_SHORT).show();
                //}
            }
        });
    }
    private Boolean validate() {
        Boolean result = false;
        String id = mTextStudentID.getText().toString().trim();
        String password = mTextPassword.getText().toString().trim();

        if(!(id.equals("014053559") && password.equals("password")))
            Toast.makeText(MainActivity.this,"Invalid password", Toast.LENGTH_SHORT).show();
        else
            result = true;
        return result;

    }



}




