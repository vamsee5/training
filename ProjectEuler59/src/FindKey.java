import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FindKey {

	private List<Integer> list = new ArrayList<Integer>();
	public FindKey() throws IOException{
		File file = new File("/home/zemoso04/Downloads/p059.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String a, b=",";
		int i=0;
		
		while((a=br.readLine())!=null){
			 String[] s = a.split(b);
			 i=s.length;
			//System.out.println(i);
		
			for(int j=0;j<i;j++){
				list.add(Integer.parseInt(s[j]));
				//System.out.println(list.get(j));
				}		
		}
		
		int z=0,sum=0;
		for(int n1=97;n1<=122;n1++){
			for(int n2=97;n2<=122;n2++){
				for(int n3=97;n3<=122;n3++){
					StringBuilder sb =new StringBuilder();
					z=0;sum=0;
					for(int n=0;n<list.size()-2;){
						 
						 //z+=list.get(n)+list.get(n+1)+list.get(n+2);
						 //System.out.println(z);
						int l1=list.get(n)^n1;
						int l2=list.get(n+1)^n2;
						int l3=list.get(n+2)^n3;
						char c1 =(char)l1;
						char c2 =(char)l2;
						char c3=(char)l3;						
						sb.append(""+c1+""+c2+""+c3);						
						n=n+3;
						sum+=l1+l2+l3;
					}
					int remainder = list.size()%3;
					if(remainder==1){
						int r1=list.get(list.size()-1)^n1;
						char cr1=(char)r1;
						sb.append(cr1);
						sum+=r1;
					}else if(remainder==2){
						int r1=list.get(list.size()-2)^n1;
						int r2=list.get(list.size()-1)^n2;
						char cr1=(char)r1;
						char cr2=(char)r2;
						sb.append(cr1+cr2);
						sum+=r1+r2;
					}
					
					if((sb.indexOf(" the ")>-1)){
							
						System.out.println(sb);
						//System.out.println(z);
						System.out.println(sum);
					}
					
				}
			}
		}
		
	}
	
}
