
public class platypus {
	private String name;
platypus(String name){
	this.name = name;
}
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet platypus
		platypus ronald = new platypus("ronald");
		//2. Call the sayHi method
		ronald.sayHi();
		//3. Create a constructor in the platypus class so that you can give your platypus a name.
		
	}
}


