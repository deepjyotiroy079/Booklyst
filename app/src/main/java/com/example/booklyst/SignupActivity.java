package com.example.booklyst;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;


public class SignupActivity extends AppCompatActivity {
    private EditText et_fullname, et_email, et_password, et_phone;
    private Button signupButton;
    private ProgressBar progressBar;
    private static final Uri default_profile_url = Uri.parse("https://engineering.mit.edu/wp-content/uploads/blank-profile-picture.png");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et_fullname = (EditText) findViewById(R.id.et_fullname);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);
        et_phone = (EditText) findViewById(R.id.et_phone);
        progressBar = (ProgressBar) findViewById(R.id.progressbar);
        signupButton = (Button) findViewById(R.id.signupBtn);

    }
}
