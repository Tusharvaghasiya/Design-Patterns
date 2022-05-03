package observer;

import java.util.Date;

public class LoggingListner implements EventListener {
	private File logFile;
	private String logMsg;

	public LoggingListner(String logFile, String msg) {
		this.logFile = new File(logFile);
		this.logMsg = msg;
	}

	@Override
	public void update(String fileName) {
		logFile.write(String.format(logMsg, fileName, new Date().toString()));
	}

}
