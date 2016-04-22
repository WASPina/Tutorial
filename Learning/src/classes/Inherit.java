package classes;

public class Inherit {
	public static void main(String[] args) {
				ClassA ob1 = new ClassA();
				ClassB ob2 = new ClassB();

				ob1.showV();
				ob2.showV();
				
				ClassA ob3 = new ClassB();
				ob3.publicValue = 3;
				ob3.showV();
	
	}
}

class ClassA {
	public int publicValue=1;

	public void showV() {
		System.out.println("This is CLASS A");
	}
	public void showFather(){
		System.out.println("Im your father!");
	}
}

class ClassB extends ClassA {
	public int publicValue;
	
	public void setPublicValue(int a){
		this.publicValue = a;
	}
	public void showV() {
		super.showFather();
		System.out.println("This is CLASS B");
		this.publicValue = 2;
		System.out.println(super.publicValue + ";" + publicValue);
	}
}
