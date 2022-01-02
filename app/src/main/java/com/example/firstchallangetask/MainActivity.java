package com.example.firstchallangetask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private View v;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View v) {

        EditText editTextName = findViewById(R.id.editTextName);
        EditText editTextSurname = findViewById(R.id.editTextSurname);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        TextView txtName = findViewById(R.id.txtName);
        TextView txtSurname = findViewById(R.id.txtSurname);
        TextView txtEmail = findViewById(R.id.txtEmail);

        txtName.setText("Name: " + editTextName.getText().toString());
        txtSurname.setText("Surname: " + editTextSurname.getText().toString());
        txtEmail.setText("Email: " + editTextEmail.getText().toString());

    }
}