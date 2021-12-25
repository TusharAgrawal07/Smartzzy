package com.example.diucity.AppActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.diucity.AppActivity.datastoring;
import com.example.diucity.AppActivity.login;
import com.example.diucity.Hotels.user_dashboard;
import com.example.diucity.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class signup extends AppCompatActivity {


    TextInputLayout full_name, email_var, pass_var, phone_var;

    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        full_name = findViewById(R.id.user_fill);
        email_var = findViewById(R.id.Email_fill);
        pass_var = findViewById(R.id.pass);
        phone_var = findViewById(R.id.mobile_fill);

    }

    public void click_login(View view) {
        Intent intent = new Intent(getApplicationContext(), login.class);
        startActivity(intent);
        finish();
    }

    public void register_button(View view) {
        String email_ = email_var.getEditText().getText().toString();
        String username_ = full_name.getEditText().getText().toString();
        String phone_ = phone_var.getEditText().getText().toString();
        String password_ = pass_var.getEditText().getText().toString();


        if (!email_.isEmpty()) {
            email_var.setError(null);
            email_var.setErrorEnabled(false);
            if (!username_.isEmpty()) {
                full_name.setError(null);
                full_name.setErrorEnabled(false);
                if (!phone_.isEmpty()) {
                    phone_var.setError(null);
                    phone_var.setErrorEnabled(false);
                    if (!password_.isEmpty()) {
                        pass_var.setError(null);
                        pass_var.setErrorEnabled(false);

                        if (email_.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$")) {


                            firebaseDatabase = FirebaseDatabase.getInstance();
                            reference = firebaseDatabase.getReference("userdata");

                            String email_s = email_var.getEditText().getText().toString();
                            String username_s = full_name.getEditText().getText().toString();
                            String phone_s = phone_var.getEditText().getText().toString();
                            String password_s = pass_var.getEditText().getText().toString();


                            datastoring datastoringg = new datastoring(email_s,username_s,phone_s,password_s);

                            reference .child(username_s).setValue(datastoringg);

                            Toast.makeText(getApplicationContext(), "Register successfully", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(getApplicationContext(), user_dashboard.class);
                            startActivity(intent);
                            finish();


                        }else {
                            email_var.setError("invalid email");
                        }

                    } else {
                        pass_var.setError("please enter the password");
                    }
                } else {
                    phone_var.setError("please enter the phone number");
                }
            } else {
                full_name.setError("please enter the user name");
            }
        } else {
            email_var.setError("please enter the email");
        }
    }
}