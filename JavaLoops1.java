import java.io.*;
import java.util.*;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(k+" x "+i+" = "+i*k);
    }
}
