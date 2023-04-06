public class Main {

	public static void main(String[] args) {
		
		DataQueue queue = new Adapter();
				
		queue.putItem("Jullia");
		queue.putItem("Rafa");
		//queue.getItem();
		
		System.out.println(queue.isEmpty());
		
		DataUser dataUser = new DataUser();
		dataUser.useData(queue);
	}
}