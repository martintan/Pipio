package com.martin.pipiomerchant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class AddMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_members);
        final EditText etName = (EditText)findViewById(R.id.et_name);
        final EditText etMobile = (EditText)findViewById(R.id.et_mobile_number);
        final EditText etBirthDate = (EditText)findViewById(R.id.et_birthdate);
        final EditText etPassword = (EditText)findViewById(R.id.et_password);
        Button btnEnter = (Button)findViewById(R.id.btn_enter);
        btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringRequest stringRequest = new StringRequest(Request.Method.POST, RewardsURLs.GetUrl(RewardsURLs.ADD_MEMBERS), new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<>();
                        params.put("name", etName.getText().toString());
                        params.put("mobile", etMobile.getText().toString());
                        params.put("birth_date", etBirthDate.getText().toString());
                        params.put("password", etPassword.getText().toString());
                        return params;
                    }
                };
                RequestSingleton.getInstance(getApplicationContext()).addToRequestQueue(stringRequest);
            }
        });
    }
}
