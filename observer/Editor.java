package observer;

public class Editor {
	private EventManager events;
	private File file;

	public void openFile(String path) {
		file = new File(path);
		System.out.println("Opening file at path: " + file.getPath());
		events.notify(EventType.OPEN, path);
	}

	public void saveFile(String path) {
		file = new File(path);
		System.out.println("changed file at path: " + file.getPath());
		events.notify(EventType.SAVE, path);
	}

	public Editor() {
		this.events = new EventManager();
	}

	public EventManager getEventManager() {
		return events;
	}
}
