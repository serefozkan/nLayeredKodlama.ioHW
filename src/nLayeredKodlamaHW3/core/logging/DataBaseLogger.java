package nLayeredKodlamaHW3.core.logging;

public class DataBaseLogger implements Logger {
	public void log(String data) {
		System.out.println("Database ile " + data + " loglandý");
		
	}
}
