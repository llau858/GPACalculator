package com.lau.GPACalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


public class GPAActivity extends ActionBarActivity {
    private final String TAG = "GpaActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Return to previous screen");
        setContentView(R.layout.activity_gpa);

        addData();
    }

    // Add the standard GPA data to the ListView
    public void addData() {

        String[] data = {
                "(94 - 100)~  A  =  4.00",
                "(90 - 93) ~  A- =  3.67",
                "(87 - 89) ~  B+ =  3.33",
                "(84 - 86) ~  B  =  3.00",
                "(80 - 83) ~  B- =  2.67",
                "(77 - 79) ~  C+ =  2.33",
                "(74 - 76) ~  C  =  2.00",
                "(70 - 73) ~  C- =  1.67",
                "(67 - 69) ~  D+ =  1.33",
                "(64 - 66) ~  D  =  1.00",
                "(60 - 63) ~  D- =  0.67",
                "( 0 - 59) ~  F  =  0.00",

        };
        ListView mainListView = (ListView) findViewById(R.id.listView_gpa);
        ArrayList<String> gpaData = new ArrayList<String>(Arrays.asList(data));
        ArrayAdapter<String> mGPAList = new ArrayAdapter<String>(
                this, // The current context (this activity)
                R.layout.list_item_layout, // The name of the layout ID.
                R.id.list_item_layout_gpa, // The ID of the text view to populate.
                gpaData);
        mainListView.setAdapter(mGPAList);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu.  this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gpa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handling of  action bar item clicks here.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.home) {
            finish();
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy()");
    }

}
