package piling;

public class main {

	public static void main(String[] args) {
		Pile p=new Pile();
		p.empiler(1);
		p.empiler(2);
		p.plus();
		p.empiler(3);
		p.mult();
		p.afficher();
	}

}
