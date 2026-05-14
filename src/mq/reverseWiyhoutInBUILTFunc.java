package mq;

public class reverseWiyhoutInBUILTFunc {
	public static void main(String[] args) {
		String str = "hi hello how are you";
		String res ="";
		String res1 ="";
		String res2 ="";
		String s [] = str.split(" ");
		
		for(int i=0;i<s.length;i++) {
			char fc = (char)(s[i].charAt(0)-32);
			res = s[i].substring(1);
			System.out.print(fc+res+" ");
		}
		System.out.println();
		
		for(int i=0;i<s.length;i++) {
			char fcc = (char)(s[i].charAt(0)-32);
			char lcc = (char)(s[i].charAt(s[i].length()-1)-32);
			res1=s[i].substring(1,s[i].length()-1);
			System.out.print(fcc+res1+lcc+" ");
			
		}
		System.out.println();
		for(int i=0;i<s.length;i++) {
			char fcc = (char)(s[i].charAt(0)-32);
			char lcc = (char)(s[i].charAt(s[i].length()-1)-32);
			res2=s[i].substring(1,s[i].length()-1);
			System.out.print(lcc+res2+fcc+" ");
			
		}
	}
}
