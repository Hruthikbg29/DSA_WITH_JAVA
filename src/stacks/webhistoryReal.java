package stacks;

import java.util.Stack;

class webHistory {
	private Stack<String> bckwrdSt, frwrdSt;
	private String currpage;

	public webHistory() {
		bckwrdSt = new Stack<>();
		frwrdSt = new Stack<>();
		currpage = "home page";
	}

	public void visit(String page) {
		bckwrdSt.push(currpage);
		currpage = page;
		frwrdSt.clear();
	}

	public void Prevpage() {
		if (!bckwrdSt.isEmpty()) {
			frwrdSt.push(currpage);
			currpage = bckwrdSt.pop();
		}
	}

	public void nextpage() {
		if (!frwrdSt.isEmpty()) {
			bckwrdSt.push(currpage);
			currpage = frwrdSt.pop();
		}
	}

	public String getcurrpage() {
		return currpage;
	}

	public void History() {
		while (!bckwrdSt.isEmpty()) {
			System.out.println(bckwrdSt.pop());
		}
	}
}

public class webhistoryReal {
	public static void main(String[] args) {
		webHistory web = new webHistory();

		web.visit("Google home");
		web.visit("Flipkart");
		web.visit("Flipkart home");
		web.visit("mobiles");
		web.visit("Iphones");
		System.out.println("curr Page is :"+web.getcurrpage());

		web.Prevpage();
		web.Prevpage();
		web.Prevpage();

		web.nextpage();

		web.History();

		System.out.println(web.getcurrpage());
	}
}
