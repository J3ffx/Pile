package piling;

public class Pile {
	
	private int []tab;
	private int sommet;
	static private int MAX=1000;
	
	public Pile() {
		this.sommet=-1;
		this.tab=new int[MAX];
	}
	
	
	public void affichetab() {
		for(int index:tab)
		System.out.println(index);
	}
	
	public void empiler(int element) {
		this.sommet++;
		this.tab[sommet]=element;			
	}
	
	public int sumall() {
		int sum = 0;
		for(int elt:this.tab) {
			sum+=elt;
		}
		return sum;
	}
	

}
