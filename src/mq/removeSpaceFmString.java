package mq;

public class removeSpaceFmString {//o(n),O(1)
public static void main(String[] args) {
	String str = "a  bc de f gh i";
	String res = "";
	for(char c : str.toCharArray()) {
		if(c != ' ') {
			res += c;
		}
	}
	System.out.println(res);
}
}
