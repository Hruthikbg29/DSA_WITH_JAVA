package queue;

import java.util.LinkedList;

class document{
	private String name;
	private int page;
	
	public document(String name , int page) {
		super();
		this.name = name;
		this.page = page;
	}
	public String getname() {
		return name;
	}
	
	public int getpage() {
		return page;
	}
}

class printer{
	private LinkedList<document> queue = new LinkedList<document>();
	
	public void addDocuments(document d1) {
		queue.add(d1);
		System.out.println("The Document"+d1.getname()+" :is added for printing");
	}
	public void print() throws InterruptedException{
		while(!queue.isEmpty()) {
			document doc = queue.poll();
			System.out.println(doc.getname()+" :is Printing");
		Thread.sleep(doc.getpage()*2000);
		System.out.println(doc.getname()+" :printing is completed");
	}
	System.out.println("All Document printing is completed");

}
}
public class documentPrinting {
	public static void main(String[] args)throws InterruptedException {
		
	
	printer p1 = new printer();
	p1.addDocuments(new document("doc2",5));
	p1.addDocuments(new document("doc2",8));
	p1.addDocuments(new document("doc2",3));
	p1.print();
	}
}
