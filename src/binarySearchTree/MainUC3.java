package binarySearchTree;

public class MainUC3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UC3<Integer> myBinaryTree = new UC3<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		System.out.println("Size:" + myBinaryTree.getSize());
		int key = 63;
		if (myBinaryTree.search(key)) {
			System.out.println(key + " present in the tree.");

		} else {
			System.out.println(key + " not present in the tree.");
		}
	}
}
