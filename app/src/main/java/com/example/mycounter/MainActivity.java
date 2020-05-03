package com.example.mycounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter_ = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
    private void displayCounter() {
        TextView textView = (TextView) findViewById(R.id.text_view);
        textView.setText(String.valueOf(counter_));
    }

    public void inc(View view) {
        counter_ ++;
        displayCounter();
    }

    public void dec(View view) {
        counter_ --;
        displayCounter();
    }

    public void zero(View view) {
        counter_ = 0;
        displayCounter();
    }

    public void set(View view) {
        EditText editView = (EditText)findViewById(R.id.edit_text);
        int value = Integer.parseInt(editView.getText().toString());
        try {
            counter_ = value;
        }
        catch (Exception e){
        }

        displayCounter();
    }
}
