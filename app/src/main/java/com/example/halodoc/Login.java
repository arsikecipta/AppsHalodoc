package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView policy;
    Button generate_btn;
    EditText et_telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        policy = (TextView) findViewById(R.id.policy);
        et_telp=findViewById(R.id.et_telp);
        String text = "Dengan mendaftar, \n saya akan menerima syarat dan ketentuan pengguna yang berlaku di halodoc";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 39, 68,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        policy.setText(ss);

        generate_btn= (Button) findViewById(R.id.generate_btn);
        generate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_telp.getText().toString().length() == 0) {
                    Toast.makeText(Login.this, "Mohon untuk mengisi nomor telepon Anda", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(Login.this, Login_OTP.class);
                    String call = et_telp.getText().toString();
                    intent.putExtra("NomorTelp", call);
                    startActivity(intent);
                }
            }
        });
    }
    }