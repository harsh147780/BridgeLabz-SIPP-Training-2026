package Java.core_java_practice.gcr_codebase.string.Level2;

import java.util.*;
public class WordsAndLength{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().trim().split("\\s+");
        System.out.println("Word\tLength");
        for(String x:w) System.out.println(x+"\t"+x.length());
    }
}