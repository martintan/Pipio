package com.martin.pipiomerchant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddMembers_Code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members__code);
        EditText etCode = (EditText)findViewById(R.id.et_code);
        Button btnJoin = (Button)findViewById(R.id.btn_join);
        Button btnReset = (Button)findViewById(R.id.btn_reset);
    }
}
