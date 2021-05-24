import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br=new   BufferedReader(new InputStreamReader(System.in));
        String str1[]=new String[3];
        String str2[]=new String[3];
        
        str1=br.readLine().split(" ");
        str2=br.readLine().split(" ");
        
        int m1,m2,d1,d2,y1,y2;
        d1=Integer.parseInt(str1[0]);
        m1=Integer.parseInt(str1[1]);
        y1=Integer.parseInt(str1[2]);
        
        d2=Integer.parseInt(str2[0]);
        m2=Integer.parseInt(str2[1]);
        y2=Integer.parseInt(str2[2]);
        
        int n=0;
        if(y1>y2){
            n=10000;
        }else if(y1==y2){
            if(m1>m2){n=500*(m1-m2);}
            else if(m1==m2){
                if(d1>d2){ n=15*(d1-d2);}
            }
        }
        System.out.println(n);
    }
}
