package com.gatech.k3vin.lolinfo;

import java.io.Serializable;

/**
 * Created by k3vin on 4/20/2017.
 */

public class Champion implements Serializable {
    private String name;
    private String p;
    private String q;
    private String w;
    private String e;
    private String r;

    public Champion(String name, String p, String q, String w, String e, String r) {
        this.name = name;
        this.p = p;
        this.q = q;
        this.w = w;
        this.e = e;
        this.r = r;
    }

    public Champion(String name) {
        this.name = name;
        this.p = null;
        this.q = null;
        this.w = null;
        this.e = null;
        this.r = null;
    }

    public String getName() {
        return this.name;
    }

    public String getP() {
        return this.p;
    }

    public String getQ() {
        return this.q;
    }

    public String getW() {
        return this.w;
    }

    public String getE() {
        return this.e;
    }

    public String getR() {
        return this.r;
    }
}
