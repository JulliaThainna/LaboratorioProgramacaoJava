import java.util.ArrayList;

public class FIFO {
	
	ArrayList<String> names = new ArrayList<String>();
	
	public void add(String name) {
		names.add(name);
	}
	
	public String remove() {
		return names.remove(0);
	}
	
	public int size() {
		return names.size();
	}
	
	public void print() {
		
	}
	
}
