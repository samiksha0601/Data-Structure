package LinearSearchLinkedList;

import LinearSearchLinkedList.LinearSearch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinearSearch ls=new LinearSearch();
		
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		
		ls.display();
		ls.search(30);
//		ls.search(20);
//		ls.search(30);
//		ls.search(40);
//		ls.search(50);

	}

}
