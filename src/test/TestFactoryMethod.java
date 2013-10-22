package test;

import creational.factorymethod.Application;
import creational.factorymethod.DocApplication;
import creational.factorymethod.TextApplication;

public class TestFactoryMethod {

	public static void main(String[] args) {
		Application app = new DocApplication();
		app.newDocument();

		app = new TextApplication();
		app.newDocument();
	}

}
