package com.martin.pipiomerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RewardsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards_menu);
        Button btnAddMembers = (Button)findViewById(R.id.btn_add_members);
        btnAddMembers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardsMenu.this, AddMembers.class);
                startActivity(intent);
            }
        });
        Button btnAddPoints = (Button)findViewById(R.id.btn_add_points);
        btnAddPoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RewardsMenu.this, AddMembers.class);
                startActivity(intent);
            }
        });
    }
}
