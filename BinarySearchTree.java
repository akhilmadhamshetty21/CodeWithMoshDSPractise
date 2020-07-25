import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
	public class Node{
		public int value;
		public Node leftNode,rightNode;
		public Node(int value) {
			this.value=value;
		}
		@Override
		public String toString() {
			return "Node [value=" + value + ", leftNode=" + leftNode + ", rightNode=" + rightNode + "]";
		}
		
	}
	public Node root=null;
		public void insert(int val) {
		Node insertNode=new Node(val);
		if(root==null) {
			root=insertNode;
			return;
		}
		Node temp=root;
		while(true) {
			if(temp.value<val) {
				if(temp.rightNode==null) {
					temp.rightNode=insertNode;
					break;
				}
				temp=temp.rightNode;
			}
			else {
				if(temp.leftNode==null) {
					temp.leftNode=insertNode;
					break;
				}
				temp=temp.leftNode;
			}
		}		
	}
		public Node find(int val) {
			if(root.value==val)
				return root;
			Node temp=root;
			while(temp!=null) {
				if(temp.value==val)
					return temp;
				if(temp.value>val) {
					temp=temp.leftNode;
				}
				else {
					temp=temp.rightNode;
				}
			}
			return null;
		}
		
		public void preOrderTraversal(Node temp){
			if(temp==null)
				return;
			System.out.print(temp.value);
			preOrderTraversal(temp.leftNode);
			preOrderTraversal(temp.rightNode);
		}
		
		public void preOrderTraversal() {
			preOrderTraversal(root);
		}
		public void inOrderTraversal(Node temp) {
			if(temp==null)
				return;
			inOrderTraversal(temp.leftNode);
			System.out.println(temp.value);
			inOrderTraversal(temp.rightNode);
		}
		public void inOrderTraversal() {
			inOrderTraversal(root);
		}
		public void postOrderTraversal(Node temp) {
			if(temp==null)
				return;
			postOrderTraversal(temp.leftNode);
			postOrderTraversal(temp.rightNode);
			System.out.println(temp.value);
		}
		public void postOrderTraversal() {
			postOrderTraversal(root);
		}
		public void height() {
			System.out.println(height(root));
		}
		private int height(Node root2) {
			if(root2.leftNode==null && root2.rightNode==null)
				return 0;
			return 1+Math.max(height(root2.leftNode), height(root2.rightNode));
			
		}
		public boolean equals(BinarySearchTree second) {
			return equals(root,second.root);
		}
		private boolean equals(Node first, Node second) {
			// TODO Auto-generated method stub
			if(first==null && second==null)
				return true;
			if(first!=null && second!=null) {
				return first.value==second.value && equals(first.leftNode,second.leftNode) && equals(first.rightNode,first.rightNode);
			}
			return false;
		}
		public boolean validate() {
			return validate(root,Integer.MAX_VALUE,Integer.MIN_VALUE);
		}
		private boolean validate(Node root2, int maxValue, int minValue) {
			// TODO Auto-generated method stub
			if(root2==null)
				return true;
			if(root2.value>maxValue || root2.value<minValue)
				return false;
			return validate(root2.leftNode,root2.value-1,minValue) && validate(root2.rightNode,maxValue,root2.value+1);
			
			
		}
		public void nodesAtkDistance(int k) {
			nodesAtkDistance(root,k);
		}
		private void nodesAtkDistance(Node root, int k) {
			if(root==null)
				return;
			// TODO Auto-generated method stub
			if(k==0) {
				System.out.println(root.value);
				return;
			}
			
				nodesAtkDistance(root.leftNode,k-1);
				nodesAtkDistance(root.rightNode,k-1);
		}
		public int size() {
			return size(root);
		}
		private int size(Node root) {
			// TODO Auto-generated method stub
			if(root==null)
				return 0;
			if(root.leftNode==null && root.rightNode==null)
				return 1;
			return 1+size(root.leftNode)+size(root.rightNode);
		}
		public int countLeaves() {
			return countLeaves(root);
		}
		private int countLeaves(Node root) {
			// TODO Auto-generated method stub
			if(root==null)
				return 0;
			if(isLeaf(root))
				return 1;
			return countLeaves(root.leftNode)+countLeaves(root.rightNode);
		}
		 private boolean isLeaf(Node node) {
			    return node.leftNode == null && node.rightNode == null;
			  }
		 public int max() {
			 return max(root);
		 }
		 private int max(Node root) {
			// TODO Auto-generated method stub
			if(root.rightNode==null)
				return root.value;
			return max(root.rightNode);
		}
		public boolean contains(int value) {
			return contains(root,value);
		}
		private boolean contains(Node root, int value) {
			// TODO Auto-generated method stub
			if(root==null)
				return false;
			if(root.value==value)
				return true;
			if(root.value<value) {
				return contains(root.rightNode, value);
			}
			else
				return contains(root.leftNode, value);
			
		}
		public boolean areSiblings(int val1,int val2) {
			return areSiblings(root,val1,val2);
		}
		private boolean areSiblings(Node root, int val1, int val2) {
			// TODO Auto-generated method stub
			if(root==null)
				return false;
			if(root.leftNode==null || root.rightNode==null)
				return false;
			if((root.leftNode.value==val1 && root.rightNode.value==val2) || (root.leftNode.value==val2 && root.rightNode.value==val1))
				return true;
			return areSiblings(root.leftNode, val1, val2) || areSiblings(root.rightNode, val1, val2);
			
		}
		
}
