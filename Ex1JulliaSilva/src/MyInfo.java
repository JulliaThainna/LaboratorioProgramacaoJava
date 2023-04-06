import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Lastname: ");
		String lastname = sc.nextLine();
		
		System.out.println("Year: ");
		int year = sc.nextInt();
		
		System.out.println("Month: ");
		int month = sc.nextInt();
		
		System.out.println("Day: ");
		int day = sc.nextInt();
			
		HeartRates person = new HeartRates(name, lastname, day, month, year);
		int age = person.age(day, month, year);
		int maxCardFreq = person.maxCardFreq(age);
		float[] frequency = person.normalCardFreq(maxCardFreq);
		
		System.out.println("Name: "+name);
		System.out.println("Lastname: "+lastname);
		System.out.printf("Birth day: %d/%d/%d\n", day, month, year);
		System.out.println("Age: "+age);
		System.out.println("Maximium cardiac frequency: "+maxCardFreq);
		System.out.printf("Normal cardiac frequency: %f ~ %f", frequency[0], frequency[1]);
		
		sc.close();
	}

}
