package piling;

public class Pile {

	private int[] tab;
	private int sommet;
	static private int MAX = 1000;

	public Pile() {
		this.sommet = -1;
		this.tab = new int[MAX];
	}

	public void afficher() {
		int index=0;
		while ( index <= sommet) {
			System.out.println(tab[index]);
			index++;}
	}

	public void empiler(int element) {
		this.sommet++;
		this.tab[sommet] = element;
	}
	public void emp1_10() {
		for(int i=1;i<=10;i++)
			empiler(i);
	}

	public void depiler() {
		this.sommet--;
	}

	public int sumall() {
		int sum = 0;
		for (int elt : this.tab) {
			sum += elt;
		}
		return sum;
	}

	public void plus() {
		int sum;
		sum = this.tab[sommet];
		depiler();
		sum += this.tab[sommet];
		depiler();
		empiler(sum);
	}

	public void mult() {
		int sum;
		sum = this.tab[sommet];
		depiler();
		sum *= this.tab[sommet];
		depiler();
		empiler(sum);
	}
	public void dup() {
		empiler(tab[sommet]);
	}
	

}
