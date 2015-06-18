import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StoreMetrics {

	private List<StoreDataPoint> list = new ArrayList<StoreDataPoint>();
	public StoreMetrics() throws IOException {
		File file = new File("/home/zemoso04/Downloads/store_data.csv");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String a, b = ",";
		int i = 0;
		br.readLine();
		while ((a = br.readLine()) != null) {

			StoreDataPoint sdp = new StoreDataPoint();
			String[] s = a.split(b);
			list.add(sdp);
			list.get(i).in(s);
			i++;
		}
		
		
	}
	
	public String highestSales(String mnth,String ctgry){
		int hs=0;
		int i=0;
		String n=null;
		//System.out.println(ctgry);
		while(i<list.size()){
			//System.out.println(list.get(i).getMonth());
			//System.out.println(list.get(i).getCategory());
			
			if((list.get(i).getMonth().equals(mnth))&&(list.get(i).getCategory().equals(ctgry))){
				if(list.get(i).getSales()>hs){
					hs=list.get(i).getSales();
					n=list.get(i).getName();
				}
				
			}
			
			i++;
		}
		return n;
	}
	public String highestSales(String mnth){
		
		int r=0,h=0,m=0,w=0,i=0;
		
		while(i<list.size()){
			
			if(list.get(i).getMonth().equals(mnth)){
				
				if(list.get(i).getName().equals("Reliance")){
					
					r=r+list.get(i).getSales();
				}else if(list.get(i).getName().equals("Heritage")){
					h=h+list.get(i).getSales();
				}else if(list.get(i).getName().equals("More")){
					m=m+list.get(i).getSales();
				}else {
					w=+list.get(i).getSales();
				}
			}
			i++;
		}
		
		if(r>h&&r>m&&r>w){return "Reliance";}
		else if(h>r&&h>m&&h>w){return "Heritage";}
		else if(m>r&&m>h&&m>w){return "More";}
		else if (w>r&&w>h&&w>m){return "Walmart";}
		else{return null;}
	}
	public int avgMonthlySales(String ctgry){
		int i=0,sales=0;
		while(i<list.size()){
			if(list.get(i).getCategory().equals(ctgry)){
				sales=sales+list.get(i).getSales();
			}
			i++;
		}
		return sales/12;
	}
	
}
