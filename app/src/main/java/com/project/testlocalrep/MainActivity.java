package com.project.testlocalrep;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String value = "Barnche 1";
    String Value2 = " Branch 2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("Name",value);
        Log.e("Branch Second ", Value2);
    }//end of Create
}
