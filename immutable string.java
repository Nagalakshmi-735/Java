import java.io.*;
import java.lang.*;
class StringImmutableDemo{
    public static void main(String args[]){
        String s1="venumadhavi";
        s1.concat("chitturi");
        System.out.println("string s1 is "+s1);
        String s2="venumadhavi";
        String s3=s2.concat("chitturi");
        System.out.println("string s3 is "+s3);
    }
}
