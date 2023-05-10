package binarySearchTree;

public class MainUC1 {
	/**
	 * This method is created to create a binary search tree.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * myBinaryTree object is created.
		 */
		UC1<Integer> myBinaryTree = new UC1<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		System.out.println("Size:" + myBinaryTree.getSize());

	}
}
