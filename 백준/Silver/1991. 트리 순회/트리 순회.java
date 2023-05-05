
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static Node root = new Node('A', null, null);
	static StringBuilder sb;
	static class Node{
		char data;
		Node leftNode;
		Node rightNode;
		public Node(char data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		while(t --> 0) {
			st = new StringTokenizer(br.readLine());
			char parent = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			
			makeTree(root, parent, left, right);
		}
		preOrder(root);
		sb.append("\n");
		inOrder(root);
		sb.append("\n");
		postOrder(root);
		sb.append("\n");
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void postOrder(Node root2) {
		// TODO Auto-generated method stub
		if(root2 == null) return;
		postOrder(root2.leftNode);
		postOrder(root2.rightNode);
		sb.append(root2.data);
	}
	private static void inOrder(Node root2) {
		// TODO Auto-generated method stub
		if(root2 == null) return;
		inOrder(root2.leftNode);
		sb.append(root2.data);
		inOrder(root2.rightNode);		
	}
	private static void preOrder(Node root2) {
		// TODO Auto-generated method stub
		if(root2 == null) return;
		sb.append(root2.data);
		preOrder(root2.leftNode);
		preOrder(root2.rightNode);		
	}
	private static void makeTree(Node root2, char parent, char left, char right) {
		// TODO Auto-generated method stub
		if(parent == root2.data) {
			root2.leftNode = (left == '.') ? null : new Node(left, null, null);
			root2.rightNode = (right == '.') ? null : new Node(right, null, null);
		}else {
			if(root2.leftNode != null) makeTree(root2.leftNode, parent, left, right);
			if(root2.rightNode != null) makeTree(root2.rightNode, parent, left, right);
		}
	}

}
