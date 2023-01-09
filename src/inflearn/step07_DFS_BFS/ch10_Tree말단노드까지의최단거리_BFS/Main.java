package inflearn.step07_DFS_BFS.ch10_Tree말단노드까지의최단거리_BFS;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));
    }
}
class Node {
    int data;
    Node lt, rt; // 객체 주소를 저장하는 class

    public Node(int val) {
        data = val;
        lt = rt = null; // 생성되는 순간에는 null 임 -> 여기에 주소를 넣어야함.
    }
}
