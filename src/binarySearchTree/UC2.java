package binarySearchTree;

public class UC2<K extends Comparable<K>> {

	/**
	 * Class contains left and right child of node and key value.
	 * 
	 */
	private static class MyBinaryNode<K extends Comparable<K>> {
		K key;
		MyBinaryNode<K> left;
		MyBinaryNode<K> right;

		public MyBinaryNode(K element) {
			this.key = element;
			this.left = null;
			this.right = null;

		}
	}

	/**
	 * Root of binary search tree.
	 */
	private MyBinaryNode<K> root;

	/**
	 * To add root to the tree.
	 * 
	 */

	public void add(K key) {
		this.root = this.addRecur(root, key);
	}

	private MyBinaryNode<K> addRecur(MyBinaryNode<K> root, K key) {
		/**
		 * if the tree is empty, returns a new node.
		 */
		if (root == null) {
			root = new MyBinaryNode<>(key);
			return root;
		}
		/**
		 * To Compare
		 */
		int comparereResult = key.compareTo(root.key);
		if (comparereResult == 0) {
			return root;
		}
		if (comparereResult < 0) {
			root.left = addRecur(root.left, key);

		} else {
			root.right = addRecur(root.right, key);
		}
		return root;
	}

	/**
	 * To arrange the tree in a order.
	 */
	public void order() {
		orderRecur(root);
	}

	public void orderRecur(MyBinaryNode<K> root) {
		if (root == null) {
			orderRecur(root.left);
			System.out.println(root.key + "->");
			orderRecur(root.right);
		}
	}

	/**
	 * To get the size of the tree.
	 * 
	 * @return
	 */
	public int getSize() {
		return this.getSize(root);
	}

	public int getSize(MyBinaryNode<K> current) {
		return current == null ? 0 : 1 + this.getSize(current.left) + this.getSize(current.right);
	}
}
