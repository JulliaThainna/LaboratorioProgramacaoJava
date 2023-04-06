import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
	private String name;
	private String lastname;
	private int day;
	private int month;
	private int year;
	
	public HeartRates(String name, String lastname, int day, int month, int year) {
		if(name.matches("[ a-zA-Z]+") == false) {
			return;
		}
		if(!lastname.matches("[ a-zA-Z]+")) {
			return;
		}
		if(day <= 0 || day > 31) {
			return;
		}
		if(year < 1900 || year > 2020) {
			return;
		}
		this.name = name; 
		this.lastname = lastname;
		this.day = day; 
		this.month = month; 
		this.year = year; 
	}
	
	public int age(int day, int month, int year) { //idade
	    return Period.between(LocalDate.of(year, month, day), LocalDate.now()).getYears();
	}
	
	public int maxCardFreq(int age) { //frequencia cardiaca maxima
		return(220 - age);
	}
	
	public float[] normalCardFreq(int maxCardFreq) { //frequencia cardiaca alvo
		float[] frequency = {(maxCardFreq/100)*50, (maxCardFreq/100)*85};
		return frequency;
	}
	
	//Setters
	public void setName(String name) { //verificar se tem numeros ou caracteres estranhos (regex)
		if(name.matches("[ a-zA-Z]+") == false) {
			return;
		}
		this.name = name; 
	}
	public void setLastname(String lastname) {
		if(!lastname.matches("[ a-zA-Z]+")) {
			return;
		}
		this.lastname = lastname;
	}
	public void setDay(int day) { // > 0 e <= 31
		if(day <= 0 || day > 31) {
			return;
		}
		this.day = day; 
	}
	public void setMonth(int month) { // > 0 e <= 12
		if(month <= 0 || month > 12) {
			return;
		}
		this.month = month; 
	}
	public void setYear(int year) { // > 1900 e <= 2020 
		if(year < 1900 || year > 2020) {
			return;
		}
		this.year = year; 
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public String getLastname() {
		return lastname;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	
	
}
