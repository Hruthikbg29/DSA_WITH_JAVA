package mq;//Repeated Search + Remove (Naive String Approach) 

public class deleteOcuuranceString { //o(n*n) o(1)
public static String removeOccurance(String s , String part) {
	while(s.contains(part)) {//Loop continues as long as part exists in s , contains() internally scans the string
		int idx = s.indexOf(part);//Finds starting index of first occurrence of part
		
		s = s.substring(0, idx)+s.substring(idx + part.length());//s.substring(0, idx) → part before "abc"
	}//s.substring(idx + part.length()) → part after "abc" ,Combine both → "abc" removed
	return s;
}
public static void main(String[] args) {
	String s  = "daabcbaabcbc";
	String part = "abc";
	System.out.println("Result : " +removeOccurance(s, part));
}
}