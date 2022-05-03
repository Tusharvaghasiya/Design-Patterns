package observer;

public class File {
	private String path;
	private String name;

	File(String path) {
		this.path = path;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void write(String txt) {
		System.out.println(txt);
	}
}
