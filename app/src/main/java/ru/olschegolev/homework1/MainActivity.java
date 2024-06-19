package ru.olschegolev.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button toastButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        toastButton = findViewById(R.id.toast);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondPage.class);
                startActivity(intent);
            }
        });
        Log.d("massage", "noCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("massage", "noStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("massage", "noPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("massage", "noRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("massage", "noStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("massage", "noResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("massage", "noDestroy");
    }
}