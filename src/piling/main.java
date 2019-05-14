package piling;

import java.io.IOException;

import interpret.Interpret;

public class Main {

	public static void main(String[] args) throws IOException {
		Interpret i = new Interpret();
		i.execute("a.txt");
	}

}
