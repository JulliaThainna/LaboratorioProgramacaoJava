import java.util.ArrayList;

public class DataQueue {
	
	public ArrayList<String> names = new ArrayList<String>();
	
	public void putItem(String name) {
		names.add(name);
	}
	
	public String getItem() {
		return names.remove(0);
	}
	
	public boolean isEmpty() {
		if(names.size() != 0) {
			return false;
		}
		return true;
	}
}
