package com.revision3.strings;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static void main(String[] args) {
        int target = 4;
        ;
        System.out.println(dice("",target));
    }

    private static List<String> dice(String p, int up) {
        // base condition
        if(up == 0){
            List<String> ans = new ArrayList<>();
           ans.add(p);
           return ans;
        }
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= up ; i++) {
            list.addAll(dice(p+i,up-i));
        }

        return list;
    }
}
