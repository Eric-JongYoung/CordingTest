package inflearn.step07_DFS_BFS.ch07_이진트리_레벨탐색_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size(); // Q의 원소의 갯수는 몇개인가
            System.out.print(L + " : "); // L : Level :
            for (int i = 0; i < len; i++) { // 해당 레벨의 원소를 봅는 방법
                Node cur = Q.poll(); // Q에서 맨앞꺼 꺼내고
                System.out.print(cur.data + " "); // 출력
                if(cur.lt!=null) Q.offer(cur.lt); // 왼쪽자식 넣기
                if(cur.rt!=null) Q.offer(cur.rt); // 오른쪽 자식 넣기
            }
            L++;
            System.out.println(); // 줄바꿈
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
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
