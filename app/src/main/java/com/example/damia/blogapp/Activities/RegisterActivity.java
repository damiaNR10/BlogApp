package com.example.damia.blogapp.Activities;

import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.damia.blogapp.Manifest;
import com.example.damia.blogapp.R;

public class RegisterActivity extends AppCompatActivity {

    ImageView imgUserPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        imgUserPhoto = findViewById(R.id.regUserPhoto);

        imgUserPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Build.VERSION.SDK_INT >= 22){
                    checkAndRequestForPermission();
                }else{
                    openGallery();
                }
            }
        });
    }

    private void openGallery() {

    }

    private void checkAndRequestForPermission() {

        //if(ContextCompat.checkSelfPermission(RegisterActivity.this, Manifest.permission.READ_EXTERNAL_STORAGE != PackageManager.PERMISSION_GRANTED)){

        //}

    }
}
