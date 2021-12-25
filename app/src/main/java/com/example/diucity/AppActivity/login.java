package com.example.diucity.AppActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.diucity.Hotels.user_dashboard;
import com.example.diucity.R;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {

    Button loginbtn, signUpbtn;

    FirebaseAuth mAuth;
    TextInputLayout user_var, password_var;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.login);

        signUpbtn = findViewById(R.id.signupBtn);
        loginbtn = findViewById(R.id.login_button);
        user_var = findViewById(R.id.username_fill);
        password_var= findViewById(R.id.password_fill);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username_ = user_var.getEditText().getText().toString();
                String password_ =  password_var.getEditText().getText().toString();

                if (!username_.isEmpty()){
                    user_var.setError(null);
                    user_var.setErrorEnabled(false);
                    if (!password_.isEmpty()){
                        password_var.setError(null);
                        password_var.setErrorEnabled(false);

                         final String username_data = user_var.getEditText().getText().toString();
                         final String password_data = password_var.getEditText().getText().toString();

                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        DatabaseReference databaseReference = firebaseDatabase.getReference("userdata");

                        Query check_username = databaseReference.orderByChild("username").equalTo(username_data);

                        check_username.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {
                                if (snapshot.exists()){
                                    user_var.setError(null);
                                    user_var.setErrorEnabled(false);

                                    String passwordCheck = snapshot.child(username_data).child("password").getValue(String.class);

                                    if (passwordCheck.equals(password_data)){
                                        password_var.setError(null);
                                        password_var.setErrorEnabled(false);
                                        Toast.makeText(getApplicationContext(), "login Successfully", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(), user_dashboard.class);
                                        startActivity(intent);
                                        finish();
                                    }else{
                                        password_var.setError("wrong password");
                                    }
                                }else{
                                    user_var.setError("username does not exist");
                                }
                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });

                    }else {
                        password_var.setError("please enter the password");
                    }

                }else {
                    user_var.setError("please enter the username");
                }
            }
        });

        signUpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), signup.class);
                startActivity(intent);

            }
        });


    }
}