package TugasPertemuan4;


public class StrukturList {
	private Node HEAD;
	public StrukturList () {
		this.HEAD = null;
	}
	public boolean isEmpty () {
		return HEAD == null;
	}
	public void addTail (double data) 
	{
		Node posNode=null, curNode=null;
		
		Node newNode = new Node (data);
		if (isEmpty()) 
		{
			HEAD = newNode;
		}
		else 
		{
			curNode = HEAD;
			while (curNode != null) 
			{
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
			
	}
	
	public void addHead(double data) {
		Node newNode = new Node (data);
		if (isEmpty()) {
			HEAD = newNode;
		}
		else {
			newNode.setNext(HEAD);
			HEAD = newNode;
		}
		
	}
	
	public void addMid(double data, double position) {
        Node newNode = new Node(data);
        if (HEAD== null) {
            HEAD = newNode;
            return;
        }
        
        else {
        Node curNode = HEAD;
        if (position == 1) {  
            newNode.setNext(curNode);
            HEAD = newNode;
            return;
        }
        
        else {
        Node posNode = null;
        int i = 1;

        while (curNode != null && i < position) {
            posNode = curNode;
            curNode = curNode.getNext();
            i++;
        }

        posNode.setNext(newNode);
        newNode.setNext(curNode); 
    }
        }
	}
	public void displayElement() {
		Node curNode = HEAD;
		while (curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();		}
	}
}
	

