package creational.factorymethod;

public class TextDocument extends Document {
	public TextDocument() {
		System.out.println("I am class TextDocument");
	}

	public void open() {
		System.out.println("I open a TextDocument");
	}

	public void save() {
		System.out.println("I save the TextDocument");
	}

	public void close() {
		System.out.println("I close the TextDocument");
	}
}
