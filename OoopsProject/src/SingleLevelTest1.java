
public class SingleLevelTest1 {

	public static void main(String[] args) {
		Person personObj = new Person('F',"Seema",24);
		Person personObj2 = new Person(24);
		Person personObj3 = new Person('F');
		Person personObj4 = new Person("Seema");
		
		System.out.println("------------");
		
		/*Student studentObj = new Student();
		System.out.println("-------------");
		
		Employee empObj = new Employee();*/
		personObj.showPerson();
		personObj2.showPerson();
		personObj3.showPerson();
		personObj4.showPerson();
	}
}

class Person{
	private char gender;
	private String name;
	private int age;
	
	Person(){
		//super();    //by default available only for default constructor or explicit constructor
		System.out.println("Person() ctor...");
	}
	
	Person(int age){
		this('F',"NONAME",age);
	}
	
	Person(char gender){
		this(gender,"NONAME",23);
	}
	
	Person(String name){
		this('F',name,23);
	}
	
	Person(char gender, String name, int age){
		System.out.println("START=> Person(chat,String,int) ctor ");
		if(gender=='M' || gender=='F') {
			this.gender = gender;
		}
		else {
			//System.out.println("Invalid Gender");
			throw new RuntimeException("Invalid Gender");
			//RuntimeException runtimeEx = new RuntimeException
		}
		
		if(name.matches("^[a-zA-Z]*$")) {
			this.name = name;
		}
		else {
			throw new RuntimeException("Invalid Name");
		}
		
		if(age>=1 && age<=120) {
			this.age = age;
		}
		else {
			throw new RuntimeException("Invalid Age");
		}
		
		
		System.out.println("FINISH=> Person(chat,String,int) ctor ");
	}
	
	void showPerson() {
		System.out.println("-------- PERSONAL ---------");
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}

class Student extends Person{
	private int rollNumber;
	private String collegeName;
	private String stream;
	private float totalMarks;
	
	Student(){
		//super();
		System.out.println("Student() ctor...");
	}
}

class Employee extends Student{
	private int empNo;
	private String companyName;
    private String designation;
    private int salary;
	
	Employee(){
		//super();
		System.out.println("Employee() ctor...");
	}
}

