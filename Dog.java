
public class Dog {
	String name;
	String say;
	 public static void main(String[] args) {
		 Dog dog1 = new Dog();
		 Dog dog2 = new Dog();
		 dog1.name = "Spot";
		 dog2.name = "Scruffy";
		 dog1.say = "Ruff!";
		 dog2.say = "Wurf!";
		 System.out.print(dog1.name + " says " + dog1.say +"\n");
		 System.out.print(dog2.name + " says " + dog2.say +"\n");
		 Dog dog3 = new Dog();
		 dog3 = dog1;
		 if (dog3 == dog1) {
			 System.out.print("dog1 and dog3 are equal\n");
		 }
		 if (dog2 == dog1) {
			 System.out.print("dog1 and dog2 are equal\n");
		 }
		 if (dog3 == dog2) {
			 System.out.print("dog2 and dog3 are equal\n");
		 }
		 if (dog3.equals(dog1)) {
			 System.out.print("dog1 and dog3 are equal\n");
		 }
		 if (dog2.equals(dog1)) {
			 System.out.print("dog1 and dog2 are equal\n");
		 }
		 if (dog3.equals(dog2)) {
			 System.out.print("dog2 and dog3 are equal\n");
		 }
	 }
}
