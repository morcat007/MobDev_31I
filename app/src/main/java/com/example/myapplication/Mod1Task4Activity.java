package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mod1Task4Activity extends AppCompatActivity {

    private EditText editTextName, editTextSurname, editTextBirthDate, editTextEmail, editTextPhone;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edittext);

        editTextName = findViewById(R.id.editTextName);
        editTextSurname = findViewById(R.id.editTextSurname);
        editTextBirthDate = findViewById(R.id.editTextBirthDate);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPhone = findViewById(R.id.editTextPhone);
        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResult = findViewById(R.id.textViewResult);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editTextName.getText().toString();
                String surname = editTextSurname.getText().toString();
                String birthDate = editTextBirthDate.getText().toString();
                String email = editTextEmail.getText().toString();
                String phone = editTextPhone.getText().toString();

                String result = "Nume: " + name + "\n" +
                        "Prenume: " + surname + "\n" +
                        "Data nașterii: " + birthDate + "\n" +
                        "E-mail: " + email + "\n" +
                        "Telefon: " + phone;

                textViewResult.setText(result);
            }
        });
    }
}
