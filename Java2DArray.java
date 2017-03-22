import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Java2DArray{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int s = arr[0][0]+arr[0][1]+arr[0][2]+arr[2][0]+arr[2][2]+arr[1][1]+arr[2][1];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                if(i+3<=6 && j+3<=6){
                    int max;
                    max = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+2][j]+arr[i+2][j+2]+arr[i+1][j+1]+arr[i+2][j+1];
					           if(max>s)
                        s = max;
                }
            }
        }
        System.out.println(s);
    }
}
