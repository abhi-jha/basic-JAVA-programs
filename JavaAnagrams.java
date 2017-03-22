import java.io.*;
import java.util.*;

public class JavaAnagrams {    
        static boolean isAnagram(String a, String b) {
        char[] arra = a.toCharArray();
        char[] arrb = b.toCharArray();
        int[] arr = new int[300];
        for(int  i =0;i<arra.length;i++){
            if(a.charAt(i) == 'a'|| a.charAt(i) == 'A')
                arr['a']++;
            else if(a.charAt(i) == 'b'|| a.charAt(i) == 'B')
                arr['b']++;
            else if(a.charAt(i) == 'c'|| a.charAt(i) == 'C')
                arr['c']++;
            else if(a.charAt(i) == 'd'|| a.charAt(i) == 'D')
                arr['d']++;
                
            else if(a.charAt(i) == 'e'|| a.charAt(i) == 'E')
                arr['e']++;
                else if(a.charAt(i) == 'f'|| a.charAt(i) == 'F')
                arr['f']++;
                else if(a.charAt(i) == 'g'|| a.charAt(i) == 'G')
                arr['g']++;
                else if(a.charAt(i) == 'h'|| a.charAt(i) == 'H')
                arr['h']++;
                else if(a.charAt(i) == 'i'|| a.charAt(i) == 'I')
                arr['i']++;
                else if(a.charAt(i) == 'j'|| a.charAt(i) == 'J')
                arr['j']++;
                else if(a.charAt(i) == 'k'|| a.charAt(i) == 'K')
                arr['k']++;
                else if(a.charAt(i) == 'l'|| a.charAt(i) == 'L')
                arr['l']++;
                else if(a.charAt(i) == 'm'|| a.charAt(i) == 'M')
                arr['m']++;
                else if(a.charAt(i) == 'n'|| a.charAt(i) == 'N')
                arr['n']++;
                else if(a.charAt(i) == 'o'|| a.charAt(i) == 'O')
                arr['o']++;
                else if(a.charAt(i) == 'p'|| a.charAt(i) == 'P')
                arr['p']++;
                else if(a.charAt(i) == 'q'|| a.charAt(i) == 'Q')
                arr['q']++;
                else if(a.charAt(i) == 'r'|| a.charAt(i) == 'R')
                arr['r']++;
                else if(a.charAt(i) == 's'|| a.charAt(i) == 'S')
                arr['s']++;
                else if(a.charAt(i) == 't'|| a.charAt(i) == 'T')
                arr['t']++;
                else if(a.charAt(i) == 'u'|| a.charAt(i) == 'U')
                arr['u']++;
                else if(a.charAt(i) == 'v'|| a.charAt(i) == 'V')
                arr['v']++;
                else if(a.charAt(i) == 'w'|| a.charAt(i) == 'W')
                arr['w']++;
                else if(a.charAt(i) == 'x'|| a.charAt(i) == 'X')
                arr['x']++;
                else if(a.charAt(i) == 'y'|| a.charAt(i) == 'Y')
                arr['y']++;
                else if(a.charAt(i) == 'z' || a.charAt(i) == 'Z')
                arr['z']++;
        }
        int[] arr1  = new int[300];
        for(int  i =0;i<arrb.length;i++){
            if(b.charAt(i) == 'a'|| b.charAt(i) == 'A')
                arr1['a']++;
            else if(b.charAt(i) == 'b'|| b.charAt(i) == 'B')
                arr1['b']++;
            else if(b.charAt(i) == 'c'|| b.charAt(i) == 'C')
                arr1['c']++;
            else if(b.charAt(i) == 'd'|| b.charAt(i) == 'D')
                arr1['d']++;
                
            else if(b.charAt(i) == 'e'|| b.charAt(i) == 'E')
                arr1['e']++;
                else if(b.charAt(i) == 'f'|| b.charAt(i) == 'F')
                arr1['f']++;
                else if(b.charAt(i) == 'g'|| b.charAt(i) == 'G')
                arr1['g']++;
                else if(b.charAt(i) == 'h'|| b.charAt(i) == 'H')
                arr1['h']++;
                else if(b.charAt(i) == 'i'|| b.charAt(i) == 'I')
                arr1['i']++;
                else if(b.charAt(i) == 'j'|| b.charAt(i) == 'J')
                arr1['j']++;
                else if(b.charAt(i) == 'k'|| b.charAt(i) == 'K')
                arr1['k']++;
                else if(b.charAt(i) == 'l'|| b.charAt(i) == 'L')
                arr1['l']++;
                else if(b.charAt(i) == 'm'|| b.charAt(i) == 'M')
                arr1['m']++;
                else if(b.charAt(i) == 'n'|| b.charAt(i) == 'N')
                arr1['n']++;
                else if(b.charAt(i) == 'o'|| b.charAt(i) == 'O')
                arr1['o']++;
                else if(b.charAt(i) == 'p'|| b.charAt(i) == 'P')
                arr1['p']++;
                else if(b.charAt(i) == 'q'|| b.charAt(i) == 'Q')
                arr1['q']++;
                else if(b.charAt(i) == 'r'|| b.charAt(i) == 'R')
                arr1['r']++;
                else if(b.charAt(i) == 's'|| b.charAt(i) == 'S')
                arr1['s']++;
                else if(b.charAt(i) == 't'|| b.charAt(i) == 'T')
                arr1['t']++;
                else if(b.charAt(i) == 'u'|| b.charAt(i) == 'U')
                arr1['u']++;
                else if(b.charAt(i) == 'v'|| b.charAt(i) == 'V')
                arr1['v']++;
                else if(b.charAt(i) == 'w'|| b.charAt(i) == 'W')
                arr1['w']++;
                else if(b.charAt(i) == 'x'|| b.charAt(i) == 'X')
                arr1['x']++;
                else if(b.charAt(i) == 'y'|| b.charAt(i) == 'Y')
                arr1['y']++;
                else if(b.charAt(i) == 'z'|| b.charAt(i) == 'Z')
                arr1['z']++;
        }
        for(char x  = 'a';x<='z';x++)
            if(arr[x]!=arr1[x])
                return false;
        return true;
    }
     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
