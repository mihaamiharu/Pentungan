package com.pentungan.kentungan;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.pentungan.kentungan.Model.Pesan;
import com.pentungan.kentungan.Rest.RetrofitClient;
import com.pentungan.kentungan.Rest.RetrofitInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Registrasi extends AppCompatActivity {

    Button btnDaftar;
    EditText inpUsername,inpPassword,inpConfirm,inpAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);



    }


    public void Daftar(View view) {
        inpUsername = findViewById(R.id.inpUsername);
        Toast.makeText(this,"Selamat " + inpUsername.getText().toString() + "Berhasil Didaftarkan",
                Toast.LENGTH_SHORT).show();

    }
}
