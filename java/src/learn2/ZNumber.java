package learn2;



public class ZNumber {
	private ZDigit[] digits;

	
	public ZNumber(char a,char b,char c,char d ){
		digits = new ZDigit[4];
		ZDigit d1 = new ZDigit(a);
        digits[0] = d1;        
        ZDigit digit2 = new ZDigit(b);
        digits[1] = digit2;
        ZDigit digit3 = new ZDigit(c);
        digits[2] = digit3;
        ZDigit digit4 = new ZDigit(d);
        digits[3] = digit4;
	}
	public ZNumber(String s){
		char[] c = s.toCharArray();
		digits = new ZDigit[c.length];
        for (int i = 0; i < c.length; i++) {
            ZDigit digit = new ZDigit(c[i]);
            digits[i] = digit;
        }
	}
    public ZNumber(char c[]){
    	digits = new ZDigit[c.length];
        for (int i = 0; i < c.length; i++) {
            ZDigit digit = new ZDigit(c[i]);
            digits[i] = digit;
        }
    }
	
	public String toString(){
		String zn="";
		for(int i=0;i<digits.length;i++)
			{			
			zn=zn+digits[i];
			}
		return zn;
	}
	public int length()
	{
		return digits.length;
	}
	public  int toDecimal(){
		String s[]=new String[digits.length];		
		for(int i=0;i<digits.length;i++){
			s[i]=""+digits[i];
		}
		int n=digits.length;
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			char aC = s[i].charAt(0);
			if(aC=='0')
			{
			a[i]=0;}
			else{
				a[i]=aC-64;
			}	
		}
		 int m=0;
		for(int i=0;i<n;i++){		
		
			m=(int) (m+((Math.pow(27,(n-i-1)))*a[i]));
		}
		return m;
	}
	public ZDigit[] getdigits(){
		return digits;
		
	}

	
}
