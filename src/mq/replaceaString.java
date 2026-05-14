package mq;

public class replaceaString {
public static void main(String[] args) {
	
	String str = "Race";
	str =str.toLowerCase();
	System.out.println(str.replace('r', 'f'));
	
	String s = "Son rises in the Morning!....";
	s =s.toLowerCase();
	System.out.println(s.replace("son", "Sun"));
	
	String s1 = "hiii   hello   how r u";
	System.out.println(s1.replaceAll("\\s+", " ")); //\\s+ for mutliple space use single space btw words
	
	
	String s2 = "h23ii he23loo h43ow r34 54u";
	System.out.println(s2);
	System.out.println(s2.replaceAll("[0-9]", "")); //for num [a-z]
	
	String s3 = "hii23 hello how r u";
	System.out.println(s3.replaceAll("[a-z]", ""));
	
	String s4 = "h!@#ii He!@#$%looo hO!@#$w r%$# u*&^"; 
	System.out.println(s4.replaceAll("[^!@#$%^&*]", ""));//retiansfor special case
	System.out.println(s4.replaceAll("[^a-z A-Z]", ""));//removes for special case
	
	String s5 = "hiii hello how r u";
	System.out.println(s5.replaceAll("[^a-z]",""));//remove space
	
	System.out.println(s5.replaceAll("[aeiou]", "")); //consonents
	System.out.println(s5.replaceAll("[^aeiou]" ,""));//vowels
	
	
	System.out.println(s5.replaceAll("_", "").length());//s5 length
	
	System.out.println(s5.replaceAll("[^aeiou]", "").length());//vowels length
	System.out.println(s5.replaceAll("[aeiou]", "").length());//consonents length
	
}
}
