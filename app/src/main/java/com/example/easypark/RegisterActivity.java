package com.example.easypark;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText mTextStudentID;
    EditText mEmailAddress;
    EditText mTextPassword;
    EditText mTextCnfPassword;
    Button mButtonRegister;
    TextView mTextViewLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        db = new DatabaseHelper(this);

        mTextStudentID = (EditText)findViewById(R.id.edittext_studentid);
        mTextPassword = (EditText)findViewById(R.id.password);
        mTextCnfPassword= (EditText)findViewById(R.id.cnf_password);
        mEmailAddress = (EditText)findViewById(R.id.email);
        mButtonRegister = (Button)findViewById(R.id.register);
        mTextViewLogin = (TextView) findViewById(R.id.login);

        mTextViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // launch main activity
                Intent LoginIntent = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(LoginIntent);
            }
        });

        //Register page
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validate()) {
                    Toast.makeText(RegisterActivity.this, "Successful registration", Toast.LENGTH_SHORT).show();
                    Intent registerIntent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(registerIntent);
                }
            }
        });
    }

    private Boolean validate(){
        Boolean result = false;
        String id = mTextStudentID.getText().toString();
        String password = mTextPassword.getText().toString();
        String password2 = mTextCnfPassword.getText().toString();
        String email = mEmailAddress.getText().toString();

        if(id.isEmpty() || password.isEmpty() || password2.isEmpty() || email.isEmpty()){
            Toast.makeText(RegisterActivity.this, "Please provide input for all fields", Toast.LENGTH_SHORT).show();
        } else{
            result = true;
        }

        return result;
    }
}



