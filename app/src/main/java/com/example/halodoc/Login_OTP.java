package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_OTP extends AppCompatActivity {

    Button generate_btn;
    TextView nocall;
    EditText et_telp;
    TextView policy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);
        nocall=findViewById(R.id.notelp);

        policy = (TextView) findViewById(R.id.policy);
        et_telp=findViewById(R.id.et_telp);
        String text = "Salah nomor ponsel? Ubah nomor telepon";
        SpannableString ss = new SpannableString(text);
        StyleSpan boldSpan = new StyleSpan(Typeface.BOLD);
        ss.setSpan(boldSpan, 19, 38, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        policy.setText(ss);


        Intent intent = getIntent();
        String nomorTelp = intent.getExtras().getString("NomorTelp");
        nocall.setText(nomorTelp);

        generate_btn= (Button) findViewById(R.id.generate_btn);
        generate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Login_OTP.this, LengkapiProfil.class);
                intent.putExtra("NomorTelp", nocall.getText());
                startActivity(intent);
            }
        });
    }
}