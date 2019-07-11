package com.pentungan.kentungan;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
    Button push_polisi,push_kebakaran,push_ambulance,push_sar;
    TextView txRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        push_polisi = findViewById(R.id.push_polisi);
        push_kebakaran = findViewById(R.id.push_kebakaran);
        push_ambulance = findViewById(R.id.push_ambulance);
        push_sar = findViewById(R.id.push_sar);
        txRegister = findViewById(R.id.txRegister);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }



    public void push_kebakaran(View view) {
        String telepon = "000000";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+telepon));
        startActivity(callIntent);
    }

    public void push_polisi(View view) {
        String telepon = "111111";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+telepon));
        startActivity(callIntent);
    }

    public void push_sar(View view) {
        String telepon = "222222";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+telepon));
        startActivity(callIntent);
    }

    public void push_ambulance(View view) {
        String telepon = "33333";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+telepon));
        startActivity(callIntent);
    }
}
