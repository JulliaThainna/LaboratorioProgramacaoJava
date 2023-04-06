public class Adapter extends DataQueue{
	
	private FIFO fifo;
	
	public Adapter() {
		fifo = new FIFO();
	}
	
	public void putItem(String name) {
		this.fifo.add(name);
	}
	
	public String getItem() {
		return this.fifo.remove();
	}
	
	public boolean isEmpty () {
		if(this.fifo.size() != 0) {
			return false;
		}
		return true;
	}
	
}


//DataUser -> FIFO (antes DataQueue)