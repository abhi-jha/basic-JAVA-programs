import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        char[] arr = s.toCharArray();
		String str ="";
		ArrayList<String> a  =new ArrayList<String>();
        int count  = 0;
		for(int  i =0;i<arr.length;i++){
			if((arr[i]>='a' && arr[i]<='z')||(arr[i]>='A' && arr[i]<='Z'))
				str+=arr[i];
			if(i==arr.length-1||arr[i]==' '||arr[i]=='\''||arr[i]=='?'||arr[i]=='!'||arr[i]==','||arr[i]=='.'||arr[i]=='_'||arr[i]=='@'){
				if(str.equals(""))
					continue;
				a.add(str);
                count++;
				str="";
				continue;
			}
		}
        System.out.println(count);
		for(int i =0;i<a.size();i++)
			System.out.println(a.get(i));
        scan.close();
    }
}
