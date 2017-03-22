import java.io.*;
import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr  = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scan.nextInt();
        int count = 0;
        for(int i=0;i<n;i++){
            int s  = 0;
            /*if(arr[i]<0)
                count++;*/
            for(int j=i;j<n;j++){
                s+=arr[j];
                if(s<0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
