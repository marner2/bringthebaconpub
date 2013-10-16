package com.bringthebacon.app;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ContributionCreateActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contribution_create);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.contribution_create, menu);
		return true;
	}

}
