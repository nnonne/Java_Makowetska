public class Student {
	String id;
	String Name;
	String Surname;
	int Year;
	int Month;
	int Day;
	String phone_number;
	String Adress;
	String Faculty;
	String Group;
	int Course;
	
	public Student(String id, String Name, String Surname, int Year, int Month, int Day,
			String phone_number, String Adress, String Faculty, String Group, int Course) {
		this.id = id;
		this.Name = Name;
		this.Surname = Surname;
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		this.phone_number = phone_number;
		this.Adress = Adress;
		this.Faculty = Faculty;
		this.Group = Group;
		this.Course = Course;
	}
	public Student(String Name, String Surname,int Year, int Month, int Day,
			String phone_number, String Adress ) {
		this.id = "00000000";
		this.Name = Name;
		this.Surname = Surname;
		this.Year = Year;
		this.Month = Month;
		this.Day = Day;
		this.phone_number = phone_number;
		this.Adress = Adress;
		this.Faculty = "Undefined";
		this.Group = "Undefined";
		this.Course = 1;
	}
	public Student() {
		
	}
	public String getName() {
		return Name + " " + Surname;
	}
	public String getId() {
		return id;
	}
	public String getDate() {
		return Day + "/" + Month + "/" + Year;
	}
	public String getPhone() {
		return phone_number;
	}
	public String getAdress() {
		return Adress;
	}
	public String getFaculty() {
		return Faculty;
	}
	public String getGroup() {
		return Group;
	}
	public int getCourse() {
		return Course;
	}
	public void setName(String Name, String Surname) {
		this.Name = Name;
		this.Surname = Surname;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setDate(int Day, int Month, int Year) {
		this.Day = Day;
		this.Month = Month;
		this.Year = Year;
	}
	public void setPhone(String phone_number) {
		this.phone_number = phone_number;
	}
	public void setAdress(String Adress) {
		this.Adress = Adress;
	}
	public void setFaculty(String Faculty) {
		this.Faculty = Faculty;
	}
	public void setGroup(String Group) {
		this.Group = Group;
	}
	public void setCourse(int n) {
		this.Course = n;
	}
	public String toString() {
		String ans = "Student " + this.getName() + " with id " + this.getId() + " and phone number " + this.getPhone()+
				 " lives at " + this.getAdress() + " and studies at " + this.getFaculty() + " faculty, group " + this.getGroup() 
				 + " at " + this.getCourse() + " course." ;
		return ans;
	}
	public static Student[] makeArray(int n,String[] names, String[] surnames,String[] ids,
	   int[] years, int[] months, int[] days, String[] phones,String[] addresses, 
	   String[] faculties, String[] groups, int[] courses) {
        Student[] arr = new Student[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = new Student(ids[i],names[i],surnames[i],years[i],months[i],days[i],phones[i],
            	addresses[i], faculties[i],groups[i],courses[i]);
        }
        return arr;
	}
	public static void main(String[] args) {
	   int n = 6;
	   String[] names = {"James", "Mike","Aaron","Lisa", "Jinny","Kate"};
	   String[] surnames = {"Smith","Doe", "Black","Simpson", "Parker","Wilson"};
	   String[] ids = {"1","2","3","4","5","6"};
	   int[] years = {2002,2003,2002,2004,2001,2000};
	   int[] months = {1,2,3,4,5,6};
	   int[] days = {23,12,4,1,30,19};
	   String[] phones = {"phone1","phone2","phone3","phone4","phone5","phone6"};
	   String[] addresses = {"address1","address2","address3","address4","address5","address6"};
	   String[] faculties = {"histerical", "mathematics","physics","mathematics","mathematics","physics"};
	   String[] groups = {"3","1","2","1","3","2"};
	   int[] courses = {3,1,2,1,2,2};
	   Student[] arr = makeArray(n, names, surnames, ids, years, months, days, phones, addresses, 
			   faculties, groups, courses);
	   System.out.println("task a");
	   for (int i=0; i<arr.length; i++){
		   if (arr[i].getFaculty() == "mathematics") {
			   System.out.println(arr[i].toString());
		   }
	   } 
	   
	}
}
