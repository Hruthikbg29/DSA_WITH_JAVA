package mq;

public class reverseaWord {
	public static void main(String[] args) {
		String str = "hello hii how are you";
		String[] x = str.split(" ");
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.print(x[i] + " ");
		}
	}

}
