package week4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class bj1991 {
	
	private static class Node {
		char data;
		Node left;
		Node right;
		
		public Node(char data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public void setRight(Node node) {
			this.right = node;
		}
		
		public void setLeft(Node node) {
			this.left = node;
		}
	}

	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // ����� ����
		
		Node root = new Node('A', null, null);
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char parent = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			addChild(root, parent, left, right);
		}
		
		sb = new StringBuilder();
		
		// ������ȸ(preOrder)
		preOrder(root);
		sb.append("\n");
		// ������ȸ(inOrder)
		inOrder(root);
		sb.append("\n");
		// ������ȸ(postOrder)
		postOrder(root);
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}

	private static void postOrder(Node node) {
		if(node == null) return;
		postOrder(node.left);
		postOrder(node.right);
		sb.append(node.data);
	}

	private static void inOrder(Node node) {
		if(node == null) return;
		inOrder(node.left);
		sb.append(node.data);
		inOrder(node.right);
	}

	private static void preOrder(Node node) {
		if(node == null) return;	
		sb.append(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}

	private static void addChild(Node node, char parent, char left, char right) {
		if(node == null) { return;}
		if(node.data == parent) { // ���� ã�� �����Ϳ� ������
			if(left != '.') { node.setLeft(new Node(left, null, null)); } // ���� ��� ����
			if(right != '.') { node.setRight(new Node(right, null, null)); } // ������ ��� ����
			return;
		}
		addChild(node.left, parent, left, right);
		addChild(node.right, parent, left, right);
	}
}