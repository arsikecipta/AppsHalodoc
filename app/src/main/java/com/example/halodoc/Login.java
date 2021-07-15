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
import android.widget.TextView;

public class Login extends AppCompatActivity {

    TextView policy;
    Button generate_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        policy = (TextView) findViewById(R.id.policy);
        String text = "Dengan mendaftar, \n saya akan menerima syarat dan ketentuan pengguna yang berlaku di halodoc";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 32, 50,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        policy.setText(ss);

        generate_btn= (Button) findViewById(R.id.generate_btn);
        generate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Login.this, Login_OTP.class);
                startActivity(intent);
            }
        });
    }
}