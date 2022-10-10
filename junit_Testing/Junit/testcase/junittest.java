package testcase;

public class junittest {
	public int add(int a,int b) {
		if(a>=1&&a<=10&&b>=1&&b<=5)
		return a*b;
		else return 150000;
	}
	public int max(int a,int b){
		if(a>=b)
			return a;
		else return b;
	}
	public String ConCat(String a,String b) {
		return a+b;
	}
	
	public boolean isPrintable(String s) {
		int a = s.length();
		
		if(a>=1&&a<=10)
			return true;
		else 
			return false;
		
	}
	

}
