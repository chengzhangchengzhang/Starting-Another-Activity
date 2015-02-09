package com.example.user.abc;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {
    public final static String EXTRA_MESSAGE = "com.example.user.abc.EXTRA_MESSAGE";

    EditText key;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        key = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
    }
    public void bt1(View view) {
        String aa = key.getText().toString();
        Intent intent = new Intent(this, key1.class);
        String key1  = ("列出:" + aa);
        intent.putExtra(EXTRA_MESSAGE,key1);
        startActivity(intent);
    }
}
