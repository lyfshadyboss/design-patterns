package creational.factorymethod;

public class DocDocument extends Document {
	public DocDocument() {
		System.out.println("I am class DocDocument");
	}

	public void open() {
		System.out.println("I open a DocDocument");
	}

	public void save() {
		System.out.println("I save the DocDocument");
	}

	public void close() {
		System.out.println("I close the DocDocument");
	}
}
