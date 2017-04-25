package com.gatech.k3vin.lolinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

/**
 * Created by k3vin on 4/19/2017.
 */

public class MainActivity extends ActionBarActivity{
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void goToChampInfo(View view) {
        startActivity(new Intent(MainActivity.this, ChampInfo.class));
    }

    public void goToStatistics(View view) {
        startActivity(new Intent(MainActivity.this, Statistics.class));
    }

    public void goToESports(View view) {
        Uri uriUrl = Uri.parse("http://www.lolesports.com/en_US/");
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
