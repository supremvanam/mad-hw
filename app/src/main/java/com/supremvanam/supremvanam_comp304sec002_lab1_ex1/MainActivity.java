package com.supremvanam.supremvanam_comp304sec002_lab1_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.supremvanam.supremvanam_comp304sec002_lab1_ex1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText editText = findViewById(R.id.id_edit_text);
        String message = editText.getText().toString().trim();

        // If the user doesn't enter anything in the text field, then the app will let the user know through a toast message.
        if (message.equals("")) {
            Toast.makeText(MainActivity.this, getString(R.string.str_textFieldIsEmpty), Toast.LENGTH_LONG).show();
            return;
        }

        Intent intent = new Intent(MainActivity.this, DisplayMessageActivity.class);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}