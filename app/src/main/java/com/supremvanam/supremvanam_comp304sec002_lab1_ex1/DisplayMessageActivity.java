package com.supremvanam.supremvanam_comp304sec002_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        // Receiving the message from the Main activity's textView.
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView displayMessage = findViewById(R.id.id_display_message);
        displayMessage.setText(message);
    }
}