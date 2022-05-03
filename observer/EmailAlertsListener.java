package observer;

public class EmailAlertsListener implements EventListener {
	private String email;
	private String msg;

	EmailAlertsListener(String email, String msg) {
		this.email = email;
		this.msg = msg;
	}

	@Override
	public void update(String fileName) {
		System.out.println("email send to: " + email + ": " + msg);
	}

}
