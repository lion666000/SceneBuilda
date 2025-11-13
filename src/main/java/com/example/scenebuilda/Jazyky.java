package com.example.scenebuilda;

import java.util.ArrayList;

public class Jazyky {
    Boolean aj;
    Boolean cj;
    Boolean ne;
    Boolean sp;

    ArrayList<Boolean> jazyky = new ArrayList<Boolean>();

    public Jazyky(Boolean aj, Boolean cj, Boolean ne, Boolean sp) {
        this.aj = aj;
        this.cj = cj;
        this.ne = ne;
        this.sp = sp;
        jazyky.add(aj);
        jazyky.add(cj);
        jazyky.add(ne);
        jazyky.add(sp);
    }

    public String toString(){
        String aJ;
        String cJ;
        String nE;
        String sP;

        if (jazyky.get(0)){
            aJ = "aj";
        }
        else{
            aJ = "";
        }

        if (jazyky.get(1)){
            cJ = "cj";
        }
        else{
            cJ = "";
        }

        if (jazyky.get(2)){
            nE = "ne";
        }
        else{
            nE = "";
        }

        if (jazyky.get(3)){
            sP = "sp";
        }
        else{
            sP = "";
        }
        return aJ + " " + cJ + " " + nE + " " + sP;
    }
}
