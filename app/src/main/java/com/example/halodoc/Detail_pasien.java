package com.example.halodoc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.Manifest;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Detail_pasien extends AppCompatActivity {

    Button btn_isipasien;
    CardView card_up;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    private DatePickerDialog datePickerDialog;
    private Button dateButton_ttl;
    TextView nama_lay, nam_rs, harga_lay, hari_pasien, jam_pasien, textView_foto;
    ImageView img_foto;
    private  static  final  int PERMISSION_CODE=1000;
    private  static  final  int IMAGE_CAPTURE_CODE=1001;
    Uri img_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pasien);
        getSupportActionBar().setTitle("Detail Pasien");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        card_up=findViewById(R.id.card_upload);
        card_up.setBackgroundResource(R.drawable.bg_card_foto);

        initDatePicker();
        dateButton_ttl=findViewById(R.id.datepicker_ttl_pasien);

        btn_isipasien=findViewById(R.id.btn_isi_pasien);
        btn_isipasien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Detail_pasien.this, Pembayaran.class);
                in.putExtra("NamaLayanan", nama_lay.getText());
                in.putExtra("RumahSakitLayanan",nam_rs.getText() );
                in.putExtra("HariTgl",hari_pasien.getText() );
                in.putExtra("JamJanji",jam_pasien.getText() );
                in.putExtra("BiayaLayanan",harga_lay.getText() );

                startActivity(in);
            }
        });
        nama_lay= findViewById(R.id.layanan_name_pasien);
        nam_rs=findViewById(R.id.nama_rs_pasien);
        harga_lay=findViewById(R.id.harga_lay_pasien);
        hari_pasien=findViewById(R.id.detail_pasien_hari);
        jam_pasien=findViewById(R.id.detail_pasien_jam);
        Intent intent =getIntent();
        String namlay = intent.getExtras().getString("NamaLayanan");
        String namRS= intent.getExtras().getString("RumahSakitLayanan");
        String hargalayanan = intent.getExtras().getString("BiayaLayanan");
        String harifix = intent.getExtras().getString("HariTgl");
        String jam_fix = intent.getExtras().getString("JamJanji");

        nama_lay.setText(namlay);
        nam_rs.setText(namRS);
        harga_lay.setText(hargalayanan);
        hari_pasien.setText(harifix);
        jam_pasien.setText(jam_fix);
        img_foto=findViewById(R.id.img_foto);
        card_up=findViewById(R.id.card_upload);

        card_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                    if(checkSelfPermission(Manifest.permission.CAMERA)==
                            PackageManager.PERMISSION_DENIED ||
                            checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)==
                                    PackageManager.PERMISSION_DENIED ){
                        String [] permission = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission,PERMISSION_CODE);
                    }
                    else{
                        openCamera();

                    }
                }
                else{

                }
            }

        });
    }
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
                dateButton_ttl.setText(date);
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
            return "JANUARI";
        if(month == 2)
            return "FEBUARI";
        if(month == 3)
            return "MARET";
        if(month == 4)
            return "APRIL";
        if(month == 5)
            return "MEI";
        if(month == 6)
            return "JUNI";
        if(month == 7)
            return "JULI";
        if(month == 8)
            return "AGUSTUS";
        if(month == 9)
            return "SEPTEMBER";
        if(month == 10)
            return "OKTOBER";
        if(month == 11)
            return "NOVEMBER";
        if(month == 12)
            return "DESEMBER";

        return "JANUARI";
    }

    public void openDatePicker(View view) {
        datePickerDialog.show();
    }


    private void openCamera() {
        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.TITLE, "new Picture");
        values.put(MediaStore.Images.Media. DESCRIPTION,"From the camera");
        img_uri=getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,img_uri);
        startActivityForResult(cameraIntent, IMAGE_CAPTURE_CODE);

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_CODE: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    openCamera();
                } else {
                    Toast.makeText(this, "permission denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode,  Intent data) {

        if (resultCode == RESULT_OK) {
            img_foto.setImageURI(img_uri);
            super.onActivityResult(requestCode, resultCode, data);

        }
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


}