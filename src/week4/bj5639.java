package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj5639 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	private static class Node {
		int data;
		Node left, right;

		public Node(int n, Node left, Node right) {
			this.data = n;
			this.left = left;
			this.right = right;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public void insert(int n) {
			  if (n < this.data) {
	                if (this.left == null)
	                	this.setLeft(new Node(n, null, null));
	                else this.left.insert(n);
	            } else {
	                if (this.right == null)
	                	this.setRight(new Node(n, null, null));
	                else this.right.insert(n);
	            }
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		Node root = new Node(n, null, null); // 초기 루트
		while (true) {
			String input = br.readLine();
			if (input == null || input.equals(""))
				break;
			root.insert(Integer.parseInt(input));
		}
		postOrder(root);

	}

	private static void postOrder(Node node) {
		if (node == null)
			return;
		postOrder(node.left);
		postOrder(node.right);
		System.out.println(node.data);
	}

}
