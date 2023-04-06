import java.util.HashSet;
import java.util.Set;

public class Editora implements RevistaSubject {
	
	private Revista revista;
	
	Set<RevistaObserver> observers = new HashSet<RevistaObserver>();
	
	public void setRevista(String name, int edition) {
		this.revista = new Revista(name, edition);
		this.notifyObservers();
	}
	
	public Revista getRevista() {
		return this.revista;
	}
	
	@Override
	public void registerObserver(RevistaObserver revistaObserver) {
		observers.add(revistaObserver);	
	}

	@Override
	public void removeObserver(RevistaObserver revistaObserver) {
		observers.remove(revistaObserver);
	}
	
	@Override
	public void notifyObservers() {
		for(RevistaObserver observer : this.observers) {
			observer.update(this);
		}
	}
}
