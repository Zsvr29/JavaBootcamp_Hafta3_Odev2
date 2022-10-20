
public class CustomerManager {
	private BaseLogger logger;  // field
	public CustomerManager(BaseLogger logger) {
		this.logger= logger;
		
	}
	public void add() {
		System.out.println("Müşteri eklendi.");
		this.logger.log("Log mesajı");
		
	}

}
