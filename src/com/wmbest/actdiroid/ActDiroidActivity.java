package com.wmbest.actdiroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.util.Log;
import android.content.Intent;

public class ActDiroidActivity extends Activity
{
	EditText domain;
	EditText username;
	EditText password;

	private	static final String LOG_NAME = "ActDiroid";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

		domain = (EditText) findViewById(R.id.domain_field);
		domain.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			public void onFocusChange(View view, boolean focus) {
				if(focus) {
					domain.setText("");
				}
			}

		});

		username = (EditText) findViewById(R.id.username_field);
		username.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			public void onFocusChange(View view, boolean focus) {
				if(focus) {
					username.setText("");
				}
			}

		});

		password = (EditText) findViewById(R.id.password_field);
		password.setOnFocusChangeListener(new View.OnFocusChangeListener() {
			public void onFocusChange(View view, boolean focus) {
				if(focus) {
					password.setText("");
				}
			}

		});

		Button button = (Button) findViewById(R.id.login_button);
		button.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View view) {
				Intent intent = new Intent(ActDiroidActivity.this, ADSearchActivity.class);
				ActDiroidActivity.this.startActivity(intent);
			}
		});
    }
}
