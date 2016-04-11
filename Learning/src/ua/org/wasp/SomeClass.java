package ua.org.wasp.builder;

public class SomeClass {
	private String name;
	private String surname;
	private String age;
	private String phone;
	private String address;
	private String mother;
	private String father;
	
	public SomeClass (final SomeClassBuilder builder) {
		this.name = builder.getName();
		this.address = builder.getAddress();
		this.age = builder.getAge();
		this.mother = builder.getMother();
		this.father = builder.getFather();
		this.surname = builder.getSurname();
		this.phone = builder.getPhone();
	}
	
	
	public static void main(String[] args) {
		
		SomeClass instanse = new SomeClassBuilder()
												.name("Serg")
												.surname("Ostapchuk")
												.age("27")
												.phone("+380634961111")
												.address("Bucha")
												.mother("Nata")
												.father("Tolya")
												.build();
		
		System.out.println(instanse.name + instanse.phone);

	}

}

final class SomeClassBuilder {
	private String name;
	private String surname;
	private String age;
	private String phone;
	private String address;
	private String mother;
	private String father;
	
	public SomeClassBuilder name (final String name){
		this.name = name;
		return this;
	}
	public SomeClassBuilder surname (final String surname){
		this.surname = surname;
		return this;
	}
	public SomeClassBuilder age (final String age){
		this.age = age;
		return this;
	}
	public SomeClassBuilder phone (final String phone){
		this.phone = phone;
		return this;
	}
	public SomeClassBuilder address (final String address){
		this.address = address;
		return this;
	}
	public SomeClassBuilder mother (final String mother){
		this.mother = mother;
		return this;
	}
	public SomeClassBuilder father (final String father){
		this.father = father;
		return this;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String getMother() {
		return mother;
	}
	public String getFather() {
		return father;
	}
	
	public SomeClass build(){
		return new SomeClass(this);
	}
	
}
