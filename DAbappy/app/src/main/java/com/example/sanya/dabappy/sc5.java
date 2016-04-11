package com.example.sanya.dabappy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class sc5 extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.sanya.dabappy.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc5);
    }
    /** Called when the user clicks the Green button */
    public void sendMessageG(View view) {
        Intent intent = new Intent(this, sc6.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
