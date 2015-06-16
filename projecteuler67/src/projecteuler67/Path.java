package projecteuler67;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Path {
	
	public   static long[][] triangle() throws Exception{
		String s = "/home/zemoso04/Downloads/triangle.txt";
		long [][] inarray= new long[100][];
		BufferedReader bis = new BufferedReader(new FileReader (s));
		int i=0;
		String r;
		while(( r=bis.readLine())!=null){
			inarray[i] = new long[i+1];
			int a=0;
			//String r = bis.readLine();
			Scanner sa = new Scanner(r);
			
			while(sa.hasNext()){
				int b = sa.nextInt();
				inarray[i][a]=b;
				a++;
			}
			i++;
		}
		
		return inarray;
	}
	public static void main(String[] args) throws Exception {
		long[][] a= new long[100][];
		a=triangle();
		long [] sum = new long[100];
		sum = a[99];
		int i=98;
		while(i!=0){
			int j=0;
		while(j<i){
			//System.out.println(""+i+j);
			
			 if(sum[j]>sum[j+1]){
				a[i][j]=a[i][j]+sum[j];
			}else{
				a[i][j]=a[i][j]+sum[j+1];
			
		}
			
			 j++;
			 
		
		}
		
		sum =a[i];
		
		i--;
	}
		sum[0]=sum[0]+a[0][0];
		
		System.out.println(sum[0]);
		
	}

}
