package creational.factorymethod;

public class TextApplication extends Application {
	public Document createDocument() {
		return new TextDocument();
	}
}
