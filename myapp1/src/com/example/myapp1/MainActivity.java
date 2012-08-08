package com.example.myapp1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;


public class MainActivity extends Activity {
	// add more comments
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // add comment
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    
}
