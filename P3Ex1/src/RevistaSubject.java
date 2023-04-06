
public interface RevistaSubject {
	
	public void registerObserver(RevistaObserver revistaObserver);
	public void removeObserver(RevistaObserver revistaObserver);
	public void notifyObservers();
}
