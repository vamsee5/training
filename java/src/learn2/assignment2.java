package learn2;



public class assignment2 {

	public static void main(String[] args) {
		ZDigit zd1 = new ZDigit('A');
		ZDigit zd2 = new ZDigit('0');
		ZNumber zn1 = new ZNumber('A','B','C','D');
		ZNumber zn2 = new ZNumber("ABCD");
		ZNumber zn3 = new ZNumber("ABCDEF");
		ZNumber zn4 = new ZNumber(new char[]{'A','B'});
		System.out.println(zn1);
		System.out.println(zn2);
		System.out.println(zn3);
		System.out.println(zn4);
		System.out.println(zn1.toDecimal());
    	System.out.println(zn2.toDecimal());
		System.out.println(zn3.toDecimal());
		System.out.println(zn4.toDecimal());
		//getdigits()
		int l =zn1.length();
		ZDigit[] zn5= new ZDigit[l];
		zn5=zn1.getdigits();
		for(int i=0;i<l;i++){
			System.out.println(zn5[i]);
		}
			}
	
}
