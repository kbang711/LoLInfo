package com.gatech.k3vin.lolinfo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by k3vin on 4/19/2017.
 */

public class Statistics extends ActionBarActivity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.statistics);
    }

    public void searchPlayer(View view) {
        EditText ign = (EditText)findViewById(R.id.editText1);
        StringBuilder buff = new StringBuilder();
        buff.append("https://na.op.gg/summoner/userName=");
        buff.append(ign.getText().toString());
        Uri uriUrl = Uri.parse(buff.toString());
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
