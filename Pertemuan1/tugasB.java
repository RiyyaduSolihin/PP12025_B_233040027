package Pertemuan1;

public class NodeMain {
	public static void main (String[] args) {
		
		// Membuat 2 buah node n1 & n2
		Node n1 = new Node (5);
		Node n2 = new Node (7);
		Node n3 = new Node (2);
		Node n4 = new Node (3);
		Node n5 = new Node (9);
		Node n6 = new Node (8);
		
		
		// Membuat relasi Node n1 & n2
		n3.setNext(n4);
		n4.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n5);
		
		// Menampilkan Node n1 & n2 dengan Pointer p
		Node p = n3;
		while(p != null)
		{
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
	}
}