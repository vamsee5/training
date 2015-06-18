import java.io.IOException;




public class Store {

	public static void main(String[] args) throws IOException {
	
		StoreMetrics sm = new StoreMetrics();
		System.out.println(sm.highestSales("Jan", "Noodles"));
		System.out.println(sm.highestSales("Jan"));
		System.out.println(sm.avgMonthlySales("Noodles"));
		
	}
}
