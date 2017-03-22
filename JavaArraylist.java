import java.io.*;
import java.util.*;

class JavaArraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>(); 
		ArrayList<Object> fin = new ArrayList<Object>();
        int n = scan.nextInt();
		for(int i=0;i<n;i++)
			listOfLists.add(new ArrayList<Integer>());
        for(int i=0;i<n;i++){
            int p = scan.nextInt();
            for(int j=0;j<p;j++)
                listOfLists.get(i).add(new Integer(scan.nextInt()));
        }
		int query  = scan.nextInt();
		for(int i=0;i<query;i++){
			int x, y;
			x  = scan.nextInt()-1;
			y  = scan.nextInt()-1;
			try{
			List<Integer> temp = listOfLists.get(x);
			fin.add(temp.get(y));
			}
			catch(Exception e){
				fin.add("ERROR!");
				continue;
			}
		}
		for(int i=0;i<query;i++)
			System.out.println(fin.get(i));
    }
}
