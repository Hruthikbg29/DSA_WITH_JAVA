package stacks; // using stack

import java.util.Stack;//O(n), o(n)

public class Validparenthesis {

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();

				if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	public static void main(String[] args) {
		String inpt1 = "()";
		String inpt2 = "(){}[]";
		String inpt3 = "(]";
		String inpt4 = "([)]";
		String inpt5 = "{[]}";
		System.out.println(inpt1 + " -> " + isValid(inpt1));
		System.out.println(inpt2 + " -> " + isValid(inpt2));
		System.out.println(inpt3 + " -> " + isValid(inpt3));
		System.out.println(inpt4 + " -> " + isValid(inpt4));
		System.out.println(inpt5 + " -> " + isValid(inpt5));

	}
}
