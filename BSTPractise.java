
public class BSTPractise {
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(20);
		bst.insert(10);
		bst.insert(6);
		bst.insert(3);
		bst.insert(8);
		bst.insert(14);
		bst.insert(30);
		bst.insert(24);
		bst.insert(1);
		bst.insert(40);
		System.out.println(bst.root);
//		bst.inOrderTraversal();
//		bst.preOrderTraversal();
		bst.postOrderTraversal();
		System.out.print(bst.validate());
		bst.nodesAtkDistance(2);
		System.out.println("size"+bst.size());
		System.out.println();
		System.out.println(bst.contains(10));
		System.out.println(bst.areSiblings(24, 40));
	}
	
}
