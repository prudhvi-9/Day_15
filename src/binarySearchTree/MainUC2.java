package binarySearchTree;

public class MainUC2 {
	/**
	 * This method is created to add nodes to the binary search tree.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UC2<Integer> myBinaryTree = new UC2<>();
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

	}
}
