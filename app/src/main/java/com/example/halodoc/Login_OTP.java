package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login_OTP extends AppCompatActivity {

    Button generate_btn;
    TextView nocall;
    EditText et_telp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_otp);
        nocall=findViewById(R.id.notelp);
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