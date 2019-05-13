package piling;

public class pile {
	
	private int []tab;
	private int sommet;
	static private int MAX=1000;
	
	public pile() {
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
	public int sumall(int[]tab) {
		
		return (Integer) null;
	}
	

}
