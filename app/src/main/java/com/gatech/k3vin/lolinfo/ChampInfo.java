package com.gatech.k3vin.lolinfo;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.io.IOException;

/**
 * Created by k3vin on 4/19/2017.
 */

public class ChampInfo extends ListActivity {
    String mainLink = "http://leagueoflegends.wikia.com/wiki/";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.champ_info);

        populateListView();
        registerClick();
    }

    public void populateListView() {
        try {
            ChampionList champList = new ChampionList();
            String[] list = new String[champList.getSize()];
            for (int i = 0; i < champList.getSize(); i++) {
                list[i] = champList.champList.get(i).getName();
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), R.layout.champ_info, list);
            ListView listView = (ListView)findViewById(R.id.center);
            listView.setAdapter(adapter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void registerClick() {
        ListView listView = (ListView)findViewById(R.id.center);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> paret, View viewClicked, int position, long id) {
                TextView textView = (TextView)viewClicked;
                String message = "You Clicked # " + position + ", which is string: " + textView.getText().toString();
                //Open webpage
                StringBuilder buff = new StringBuilder();
                buff.append("http://leagueoflegends.wikia.com/wiki/");
                buff.append(textView.getText().toString());
                Uri uriUrl = Uri.parse(buff.toString());
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}
