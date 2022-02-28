package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatPat {
    public static void main(String[] args){
        String a = "[1,12,39]";
        String reg = "[^0-9]";
        Pattern p = Pattern.compile(reg);
        //Matcher m = p.matcher(a);
        //String str = m.replaceAll(" ").trim();
        //System.out.println(str);
        String[] s = p.split(a);
        for(String ss : s){
            System.out.print(ss+" ");
        }
        //System.out.println(s.length);
    }
}
