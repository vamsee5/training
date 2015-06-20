package projecteuler54;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Poker {

	List <Cards> list = new ArrayList<Cards>();
	public Poker() throws IOException{
		File file= new File("/home/zemoso04/Downloads/p054.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String a;
		int i=0;
		while((a=br.readLine())!=null){
			Cards cd = new Cards();
			list.add(cd);
			list.get(i).tr(a);
			i++;
		}
		int j,player1=0;int player2=0;
		
		for(j=0;j<list.size();j++){
			int[] p1=list.get(j).getv1();
			int[] p2=list.get(j).getv2();
			int n1=Find(list.get(j).getv1(),list.get(j).gets1());
			int n2=Find(list.get(j).getv2(),list.get(j).gets2());
			
			if(n1>n2){
				
				
				player1+=1;
				
			}else if(n1==n2){
				
				if(n1==9){
					if(p1[4]>p2[4]){
					player1+=1;
					}
				}else if(n1==8){
					if(p1[4]>p2[4]){
						player1+=1;
					}
				}else if(n1==7){
					if(p1[4]>p2[4]){
						player1+=1;
					}
				}else if(n1==6){
					if(p1[4]>p2[4]){
						player1+=1;
					}else if(p1[4]==p2[4]){
						if(p1[3]>p2[3]){
							player1+=1;
						}else if(p1[3]==p2[3]){
							if(p1[2]>p2[2]){
								player1+=1;
							}else if(p1[2]==p2[2]){
								if(p1[1]>p2[1]){
								 player1+=1;
								}else if(p1[1]==p2[1]){
									if(p1[0]>p2[0]){
										player1+=1;
									}
								}
							}
						}
					}
				
				}else if(n1==5){
					if(p1[4]>p2[4]){
						player1+=1;
					}
				}else if(n1==4){
					if(p1[4]>p2[4]){
						player1+=1;
					}
				}else if(n1==3){
					if(p1[4]>p2[4]){
						player1+=1;
					}else if(p1[4]==p2[4]){
						if(p1[2]>p2[2]){
							player1+=1;
						}else if(p1[2]==p2[2]){
						if(p1[0]>p2[0]){
							player1+=1;
						}
					}
					}
				}else if(n1==2){
					if(p1[4]>p2[4]){
						player1++;
					}else if(p1[4]==p2[4]){
						if(p1[2]>p2[2]){
							player1++;
						}else if(p1[2]==p2[2]){
							if(p1[1]>p2[1]){
								
								player1++;
							}else if(p1[1]==p2[1]){
								if(p1[0]>p2[0]){
									player1++;
								}
							}
						}
					}
				}else if(n1==1){
					
					if(p1[4]>p2[4]){
						
						
						player1+=1;
					}else if(p1[4]==p2[4]){
						if(p1[3]>p2[3]){
							
							player1+=1;
						}else if(p1[3]==p2[3]){
							if(p1[2]>p2[2]){
								
								player1+=1;
							}else if(p1[2]==p2[2]){
								if(p1[1]>p2[1]){
									
									player1+=1;
								}else if(p1[1]==p2[1]){
									if(p1[0]>p2[0]){
										
									player1+=1;
									
								}
							}
						}
					}
				}
			}
			
			
			}
			
			
		
		
	}
		System.out.println(player1);
	}
	public int Find(int[] a,int[] b){
		int[] num=number(a);
		int temp;
		if(b[0]==b[1]&&b[2]==b[1]&&b[3]==b[1]&&b[4]==b[1]){//flush
			if(a[4]==14&&a[3]==13&&a[2]==12&&a[1]==11&&a[0]==10){//royalflush
				return 10;
			}else if(a[4]==14&&a[3]==5&&a[2]==4&&a[1]==3&&a[0]==2){//straightflushA
				a[4]=5;
				return 9;
			}else if((a[4]-a[3]==1)&&(a[3]-a[2]==1)&&(a[2]-a[1]==1)&&(a[1]-a[0]==1)) {
				return 9;//straightflush
			}else{return 6;}
		}else if(a[4]==14&&a[3]==5&&a[2]==4&&a[1]==3&&a[0]==2){
			a[4]=5;//straightA
			return 5;
		}else if((a[4]-a[3]==1)&&(a[3]-a[2]==1)&&(a[2]-a[1]==1)&&(a[1]-a[0]==1)){
			return 5;//straight
		}else if (num[5]==256){
			if(num[4]==1){
				a[4]=a[3];
			}
			return 8;//fourkind
		}else if(num[5]==108){
			if(num[4]==2){
				if(num[3]==3){
					a[4]=a[3];
				}else {
					a[4]=a[2];
				}
			}
			return 7;//fullhouse
		}else if(num[5]==27){
			if(num[4]==1){
				if(num[3]==3){
					a[4]=a[3];
				}else {
					a[4]=a[2];
				}
			}
			return 4;//3kind
		}else if(num[5]==16){
			if(num[4]==1){
				temp=a[4];
				a[4]=a[3];
				a[3]=a[2];
				a[2]=a[1];
				a[1]=a[0];
				a[0]=temp;
			}else if(num[2]==1){
				temp=a[2];
				a[2]=a[1];
				a[1]=a[0];
				a[0]=temp;
			}
			return 3;//2pair
		}else if(num[5]==4){
			if(num[0]==2&&num[1]==2){
				temp=a[0];
				a[0]=a[2];
				a[1]=a[3];
				a[2]=a[4];
				a[3]=temp;
				a[4]=temp;
			}else if(num[1]==2&&num[2]==2){
				temp=a[1];
				
				a[1]=a[3];
				a[2]=a[4];
				a[3]=temp;
				a[4]=temp;
			}else if(num[2]==2&&num[3]==2){
				temp=a[2];
				
				a[2]=a[4];
				a[3]=temp;
				a[4]=temp;
			}
			return 2;//1pair
		}else {
			
			return 1;//highcard
		}
	}
	public int[] number(int[] a){	
		int i,j,t;
		int[] arr={0,0,0,0,0,1};		 
		for(i=0;i<5;i++){
			for(j=0;j<5;j++){
				if(a[i]==a[j]){
					arr[i]++;
				}
			}
	}
		for(t=0;t<5;t++){
		arr[5]=arr[5]*arr[t];
		}
		return arr;
	}
}
