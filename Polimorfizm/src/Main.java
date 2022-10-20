import java.lang.System.Logger;

public class Main {

	public static void main(String[] args) {
		
		/*MailLogger logger= new MailLogger();
		logger.Log("Log mesajı");
		*/
		// Polimirfizim...
	/*	BaseLogger[] loggers= new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new MailLogger(),new ConsoleLogger()};
	for(BaseLogger logger:loggers) { // Base logger anne gorevı goruyor.
		logger.Log("Log mesajı:");
		
	}
		*/
		
		CustomerManager customerManager= new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	}

}
