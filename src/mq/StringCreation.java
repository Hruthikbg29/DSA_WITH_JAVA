package mq;
class SingleDimensionString{
	String arr [];
	public SingleDimensionString(int size) {
		arr = new String[size];
	}
	
	public void insertion(int index, String value) {
		try {
			if(arr[index] == null) {
				arr[index] = value;
				System.out.println("The Value is : " +value+ " : is Entered");
			}else {
				System.out.println("The block is already filled");
			}
		}catch(Exception e) {
			System.out.println("Invalid index or value");
		}
	}
	
	public void traverese() {
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void Searching(String  searchValue) {
		try {
			for(int i=0;i<arr.length;i++)
			
				if(arr[i].equals(searchValue)) {
				System.out.println("The Value is is Entered : "+i);
				return;
			}
				System.out.println("The block is already filled");
		}catch(Exception e) {
			System.out.println("Invalid index or value");
		}
		
	}
	
	public void Deletion(String value) {
		try {
			for(int i=0;i<arr.length;i++) {
			
				if(arr[i].equals(value)) {
					arr[i] = null;
				System.out.println("The Value is is Entered");
				return;
			}
			}
				System.out.println("The block is already filled");
		}catch(Exception e) {
			System.out.println("Invalid index or value");
		}
	}
}

public class StringCreation {
public static void main(String [] args) {
	SingleDimensionString sda1 = new SingleDimensionString(5);
	sda1.insertion(0, "Krishna");
	sda1.insertion(1, "Madhava");
	sda1.insertion(2, "Vasudeva");
	sda1.insertion(3, "Kanna");
	sda1.insertion(4, "Keshava");
	sda1.insertion(5 ,"Damodara");
	sda1.insertion(2, "Lella");
	
	sda1.traverese();
	sda1.Searching("Vasudeva");
	sda1.Deletion("Vasudeva");
	sda1.traverese();
	
	
}
}

