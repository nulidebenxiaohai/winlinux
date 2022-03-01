package Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatPat {
    public static void main(String[] args){
        String a = "[1,12,,,,,,,39]";
        String reg = "[^0-9]";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(a);
        String str = m.replaceAll(" ").trim();
        String[] s = str.split("\\s+");
        for(String sss : s){
            System.out.println(sss);
        }
        System.out.println(str);
        String[] s1 = a.split("[^0-9]+");
        for(String sss : s1){
            System.out.print(sss+" ");
        }
        System.out.println();
        List<String> res = new ArrayList<>();
        String[] ss = a.replaceAll("[^0-9]"," ").trim().split("\\s+");
        for(String ssss : ss){
            res.add(ssss);
        }
        System.out.println(res);
    }
}
