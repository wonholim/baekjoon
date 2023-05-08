
import java.util.*;
import java.io.*;

public class Main {
	static class Node {
		int data;
		Node leftNode;
		Node rightNode;
		public Node(int data, Node leftNode, Node rightNode) {
			this.data = data;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
	}
	static Node root;
	static int k;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		sb = new StringBuilder();
		String line = "";
		while((line = br.readLine()) != null) {
			k = Integer.parseInt(line);
			if(root == null) {root = new Node(k, null, null);}
			else {makeTree(root);}
		}
		postOrder(root);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		br.close();
	}
	private static void postOrder(Node p) {
		// TODO Auto-generated method stub
		if(p != null) {
			postOrder(p.leftNode);
			postOrder(p.rightNode);
			sb.append(p.data+"\n");
		}
	}
	private static void makeTree(Node p) {
		// TODO Auto-generated method stub
		if(p.data > k) {
			if(p.leftNode == null) {
				p.leftNode = new Node(k, null, null);
				return;
			}
			makeTree(p.leftNode);
		}else {
			if(p.rightNode == null) {
				p.rightNode = new Node(k, null, null);
				return;
			}
			makeTree(p.rightNode);
		}
	}

}
