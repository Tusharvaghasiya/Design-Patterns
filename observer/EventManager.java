package observer;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EventManager {

	private Map<EventType, List<EventListener>> listners = new HashMap<>();

	public void subscribe(EventType eventType, EventListener eventListner) {
		if (!listners.containsKey(eventType))
			listners.put(eventType, new LinkedList<>());
		listners.get(eventType).add(eventListner);
	}

	public void unSubscribe(EventType eventType, EventListener eventListner) {
		if (!listners.containsKey(eventType))
			return;
		listners.get(eventType).remove(eventListner);
	}

	public void notify(EventType eventType, String fileName) {
		for (EventListener eventListner : listners.get(eventType)) {
			eventListner.update(fileName);
		}
	}

}
