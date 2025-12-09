package M2_Activity1;

public class M2Activity1 {

	public static void main(String[] args) {
		Book myBook = new Book();
		myBook.author = "GMKZ";
		myBook.title = "My Diary";
		myBook.bookInfo();
		
		System.out.println("");
		
		House myHouse = new House();
		myHouse.street = "Zone 4";
		myHouse.barangay = "Caridad";
		myHouse.city = "Baybay";
		myHouse.houseInfo();
		
		System.out.println("");
		
		Tree myTree = new Tree();
		myTree.name = "Mahugani";
		myTree.count = 5;
		myTree.treeInfo();
	}

}
