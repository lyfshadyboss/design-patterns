package creational.factorymethod;

public abstract class Application {

	public abstract Document createDocument();

	public void newDocument() {
		Document doc = createDocument();

		doc.open();
		doc.save();
		doc.close();
	}
}
