package umn.ac.id.musicplayer;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText username_login, password_login;
        Button button_login;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        username_login = findViewById(R.id.username_login);
        password_login = findViewById(R.id.password_login);
        button_login = findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username_login.getText().toString().equals("uasmobile") && password_login.getText().toString().equals("uasmobilegenap"))
                {
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
                    builder.setTitle("Selamat Datang");
                    builder.setMessage("Nicholas Evan\n 00000027900");
                    builder.setNegativeButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    });
                    Intent songlist = new Intent(LoginActivity.this, SongActivity.class);
                    AlertDialog alertDialog = builder.create();
                    startActivity(songlist);
                    alertDialog.show();

                }else{
                    Toast.makeText(getApplicationContext(), "Invalid Username or Password",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
