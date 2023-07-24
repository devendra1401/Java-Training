
public class SingleLevelTest1 {

	public static void main(String[] args) {
		/*Person personObj = new Person('F',"Seema",24);
		Person personObj2 = new Person(24);
		Person personObj3 = new Person('F');
		Person personObj4 = new Person("Seema");*/
		
		System.out.println("------------");
		
		/*Student studentObj = new Student();
		System.out.println("-------------");
		
		Employee empObj = new Employee();*/
		/*personObj.showPerson();
		personObj2.showPerson();
		personObj3.showPerson();
		personObj4.showPerson();*/
		
		//Student studentObj = new Student('M',"Jack",24,123,"Bharat Vidyapeeth","MechEng",899);
		//studentObj.showStudent();
		
		Employee empObj = new Employee('F',"Jane",22,   323,"MIT","IT Eng",999, 1212,"Google Inc","Brain Analyst",9999);
		empObj.showEmployee();
		
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
		System.out.println("-------- PERSON ---------");
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
	
	Student(char gender,String name, int age, int rollNumber,String collegeName, String stream, float totalMarks){
		//super();
		super(gender,name,age);
		System.out.println("Student() ctor...");
		
		if(Validator.checkNumber(rollNumber, 1, 500)){
			this.rollNumber = rollNumber;
		}
		else {
			RuntimeException runtimeRollNumberEx = new RuntimeException("Invalid Roll Number : "+rollNumber);
			throw runtimeRollNumberEx;
		}
		
		
		if(Validator.checkStringWithSpace(collegeName)) {
			this.collegeName = collegeName;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid collegeName : "+collegeName);
			throw runtimeNameEx;
		}
		
		if(Validator.checkStringWithSpace(stream)) {
			this.stream = stream;
		}
		else {
			RuntimeException runtimeNameEx = new RuntimeException("Invalid stream : "+stream);
			throw runtimeNameEx;
		}
		
		if(Validator.checkNumber(totalMarks,1,1000)) {
			this.totalMarks = totalMarks;
		}
		else {
			RuntimeException runtimeMarksEx = new RuntimeException("Invalid Marks : "+totalMarks);
			throw runtimeMarksEx;
		}
	}
	void showStudent() {
		super.showPerson(); 
		System.out.println("-------- STUDENT ---------");
		System.out.println("Roll No: "+rollNumber);
		System.out.println("College Name: "+collegeName);
		System.out.println("Stream: "+stream);
		System.out.println("Total Marks: "+totalMarks);
	}
	
}

class Employee extends Student{
	private int empNo;
	private String companyName;
    private String designation;
    private float salary;
	
	Employee(char gender,String name, int age, int rollNumber, String collegeName, String stream, float totalMarks, 
			int empNo, String companyName, String designation, float salary){
		super(gender, name, age, rollNumber, collegeName, stream, totalMarks);
		System.out.println("Employee() ctor...");
		
		if(Validator.checkNumber(empNo, 100, 2000)){
			this.empNo = empNo;
		}
		else {
			RuntimeException runtimeEmpNoEx = new RuntimeException("Invalid empNo : "+empNo);
			throw runtimeEmpNoEx;
		}
		
		
		if(Validator.checkStringWithSpace(companyName)) {
			this.companyName = companyName;
		}
		else {
			RuntimeException runtimeCompanyNameEx = new RuntimeException("Invalid company : "+companyName);
			throw runtimeCompanyNameEx;
		}
		
		if(Validator.checkStringWithSpace(designation)) {
			this.designation = designation;
		}
		else {
			RuntimeException runtimeDesignationEx = new RuntimeException("Invalid designation : "+designation);
			throw runtimeDesignationEx;
		}
		
		if(Validator.checkNumber(salary,5000,20000)) {
			this.salary = salary;
		}
		else {
			RuntimeException runtimeSalaryEx = new RuntimeException("Invalid salary : "+salary);
			throw runtimeSalaryEx;
		}
		
	}
	void showEmployee() {
		super.showStudent(); //super. to invoke super class member/data/function
		System.out.println("---- EMPLOYEE ----");
		System.out.println("EMPNO  : "+empNo);
		System.out.println("COMPANY: "+companyName);
		System.out.println("DESG   : "+designation);
		System.out.println("SALARY : "+salary);
	}
}

