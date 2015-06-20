package projecteuler54;

public class Cards {

	private int[] v1 =new int[5];
	private int[] s1 =new int[5];
	private int[] v2 =new int[5];
	private int[] s2 =new int[5];
	
	public int[] getv1() {
		return v1;
	}

	public int[] gets1() {
		return s1;
	}

	public int[] getv2() {
		return v2;
	}

	public int[] gets2() {
		return s2;
	}

	public void tr(String s){
		String c=" ";
		String[] b=s.split(c);
		for(int i=0;i<5;i++){
			char c0=b[i].charAt(0);
			char c1=b[i].charAt(1);
			switch(c0){
			case '2':this.v1[i]=2;break;
			case '3':this.v1[i]=3;break;
			case '4':this.v1[i]=4;break;
			case '5':this.v1[i]=5;break;
			case '6':this.v1[i]=6;break;
			case '7':this.v1[i]=7;break;
			case '8':this.v1[i]=8;break;
			case '9':this.v1[i]=9;break;
			case 'T':this.v1[i]=10;break;
			case 'J':this.v1[i]=11;break;
			case 'Q':this.v1[i]=12;break;
			case 'K':this.v1[i]=13;break;
			case 'A':this.v1[i]=14;break;
			}
			switch(c1){
			case 'S':this.s1[i]=1;break;
			case 'C':this.s1[i]=2;break;
			case 'H':this.s1[i]=3;break;
			case 'D':this.s1[i]=4;break;
			}
		}
		for (int j=5;j<10;j++){
			
			char c0=b[j].charAt(0);
			char c1=b[j].charAt(1);
			switch(c0){
			case '2':this.v2[j-5]=2;break;
			case '3':this.v2[j-5]=3;break;
			case '4':this.v2[j-5]=4;break;
			case '5':this.v2[j-5]=5;break;
			case '6':this.v2[j-5]=6;break;
			case '7':this.v2[j-5]=7;break;
			case '8':this.v2[j-5]=8;break;
			case '9':this.v2[j-5]=9;break;
			case 'T':this.v2[j-5]=10;break;
			case 'J':this.v2[j-5]=11;break;
			case 'Q':this.v2[j-5]=12;break;
			case 'K':this.v2[j-5]=13;break;
			case 'A':this.v2[j-5]=14;break;
			}
			switch(c1){
			case 'S':this.s2[j-5]=1;break;
			case 'C':this.s2[j-5]=2;break;
			case 'H':this.s2[j-5]=3;break;
			case 'D':this.s2[j-5]=4;break;
			}
		}
		this.v1=sort(v1);
		this.v2=sort(v2);
		      
	}
	//sorting algo
	public int[] sort(int[] v1){
		int temp;
        for (int i = 1; i < 5; i++) {
            for(int j = i ; j > 0 ; j--){
                if(v1[j] < v1[j-1]){
                    temp = v1[j];
                    v1[j] = v1[j-1];
                    v1[j-1] = temp;
                }
            }
        }
        return v1;
	}
}
