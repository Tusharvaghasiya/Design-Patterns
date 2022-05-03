package observer;

public class Application {

	public static void main(String[] args) {
		Editor editor = new Editor();
		LoggingListner logger = new LoggingListner("/path/to/log.txt", "log >> file %s opened at %s:");
		editor.getEventManager().subscribe(EventType.OPEN, logger);

		LoggingListner logger2 = new LoggingListner("/path/to/log.txt", "log >> file %s saved at %s:");
		editor.getEventManager().subscribe(EventType.SAVE, logger2);

		editor.getEventManager().unSubscribe(EventType.OPEN, logger);
		editor.getEventManager().unSubscribe(EventType.SAVE, logger2);

		editor.openFile("/path/to/performValidations.sql");
		editor.openFile("/path/to/cleanup.sh");

		editor.saveFile("/path/to/cust_to_dim.sql");

	}

}
