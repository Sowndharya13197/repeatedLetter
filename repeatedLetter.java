import java.io.*;
import java.util.*;
public class repeatedLetter {
    public static void main(String args[])
    {
        String str;
        Scanner s=new Scanner(System.in);
        str=s.next();
        int max = 0,co=0;
        int pp[]=new int[str.length()];
        char p[]=str.toCharArray();
        char k = 0;
        int count[]=new int[26];
        for(int i=1;i<str.length();i++)
        {co=0;
            for(int j=0;j<i;j++)
            {
                if(p[i]==p[j])
                {co++;
                 }
                if(co>max)
                {
                max=co;
                   k=p[j];
                }
              }} System.out.println(k);
        
         }
    
}
