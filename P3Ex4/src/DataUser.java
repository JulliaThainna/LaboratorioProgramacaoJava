public class DataUser {
	
	public void useData(DataQueue dataQueue) {
		//for(String name : dataQueue.names) {
		//	System.out.println("Nome: " + name);
		//}
		while(dataQueue.isEmpty() == false) {
			String name = dataQueue.getItem();
			System.out.println(name);
		}
	}
}
