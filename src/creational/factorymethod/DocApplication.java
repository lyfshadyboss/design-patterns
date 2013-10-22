package creational.factorymethod;

public class DocApplication extends Application {
	public Document createDocument() {
		return new DocDocument();
	}
}
