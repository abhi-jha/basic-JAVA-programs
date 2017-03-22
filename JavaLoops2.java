import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int  k = 1;
            int initial = 0;
            initial += a + k*b;
            for(int var = 0;var<n;var++){
                System.out.print(initial+" ");
                k = k*2;
                initial+=  k*b;
            }
             System.out.println();   
        }
        in.close();
    }
}
