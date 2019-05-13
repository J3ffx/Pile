package piling;

import java.io.IOException;

import interpret.Interpret;

public class main {

	public static void main(String[] args) throws IOException {
		Interpret i=new Interpret();
		i.execute("a.txt");
	}

}
