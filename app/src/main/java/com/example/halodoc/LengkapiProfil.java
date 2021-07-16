package com.example.halodoc;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class LengkapiProfil extends AppCompatActivity {

    private DatePickerDialog datePickerDialog;
    private Button dateButton, btn_regis;
    EditText et_telpon, et_name;
    EditText et_email, et_bb, et_tb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lengkapi_profil);
        getSupportActionBar().setTitle("Lengkapi Profil");
        et_name=(EditText)findViewById(R.id.et_nama_lengkap);
        et_email=(EditText) findViewById(R.id.et_email);
        et_telpon = (EditText) findViewById(R.id.et_phone_number);
        et_bb=(EditText)findViewById(R.id.et_bb);
        et_tb=(EditText)findViewById(R.id.et_tb);

        et_name.addTextChangedListener(regisTextWatcher);


        initDatePicker();
        dateButton=findViewById(R.id.datepicker_ttl);
        et_telpon = (EditText) findViewById(R.id.et_phone_number);
        Intent in = getIntent();
        String tv1= in.getExtras().getString("NomorTelp");
        et_telpon.setText(tv1);

        btn_regis= findViewById(R.id.button_regis);
        btn_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_name.getText().toString().length() == 0) {
                    Toast.makeText(LengkapiProfil.this, "Mohon untuk melengkapi profil terlebih dahulu", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(LengkapiProfil.this, CobaMain.class);
                    String nama_lengkap = et_name.getText().toString();
                    intent.putExtra("NamaLengkap", nama_lengkap);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private TextWatcher regisTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int count, int after) {
//            String name_input = et_name.getText().toString().trim();
//            String email_input = et_email.getText().toString().trim();
//            String bb_input = et_bb.getText().toString().trim();
//            String tb_input = et_tb.getText().toString().trim();
//            btn_regis.setEnabled(!name_input.isEmpty()  & !email_input.isEmpty() &
//                    !bb_input.isEmpty() & !tb_input.isEmpty());


        }

        @Override
        public void afterTextChanged(Editable s) {
            if(s.toString().trim().length()>0){
                btn_regis.setBackgroundColor(getResources().getColor(R.color.background_all));
                btn_regis.setTextColor(getResources().getColor(R.color.colorWhite));
            }else{
                btn_regis.setBackgroundColor(getResources().getColor(R.color.deskripsi));

            }

        }
    };
    private String getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        month=month+1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day,month,year);
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener= new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month=month+1;
                String date=makeDateString(day,month,year);
                dateButton.setText(date);
            }
        };
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        int style= AlertDialog.THEME_HOLO_LIGHT;
        datePickerDialog = new DatePickerDialog(this, style,dateSetListener, year, month,day);
    }

    private String makeDateString(int day, int month, int year) {
        return getMonthFormat(month) + " " + day + " " + year;
    }

    private String getMonthFormat(int month) {
        if(month == 1)
            return "JAN";
        if(month == 2)
            return "FEB";
        if(month == 3)
            return "MAR";
        if(month == 4)
            return "APR";
        if(month == 5)
            return "MAY";
        if(month == 6)
            return "JUN";
        if(month == 7)
            return "JUL";
        if(month == 8)
            return "AUG";
        if(month == 9)
            return "SEP";
        if(month == 10)
            return "OKT";
        if(month == 11)
            return "NOV";
        if(month == 12)
            return "DES";

        return "JAN";
    }

    public void openDatePicker(View view) {
        datePickerDialog.show();
    }
}