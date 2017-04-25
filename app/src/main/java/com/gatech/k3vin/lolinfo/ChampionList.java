package com.gatech.k3vin.lolinfo;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by k3vin on 4/20/2017.
 */

public class ChampionList {
    ArrayList<Champion> champList = new ArrayList<Champion>();
    public ChampionList() throws IOException {
        makeList();
    }

    public void makeList() throws IOException{
        Scanner sc = new Scanner(new File("ChampNames.txt"));
        ArrayList<String> lines = new ArrayList<String>();
        while(sc.hasNextLine()) {
            lines.add(sc.nextLine());
        }
        for(int i = 0; i < lines.size(); i++) {
            champList.add(new Champion(lines.get(i)));
        }
    }
}
