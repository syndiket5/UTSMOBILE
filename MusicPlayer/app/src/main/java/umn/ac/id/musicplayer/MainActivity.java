package umn.ac.id.musicplayer;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button homebtn_profil, homebtn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homebtn_profil = findViewById(R.id.homebtn_profil);
        homebtn_login = findViewById(R.id.homebtn_login);


        homebtn_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profilbtn = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(profilbtn);
            }
        });

        homebtn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginbtn = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(loginbtn);
            }
        });

    }
}