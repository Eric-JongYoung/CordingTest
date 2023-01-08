package inflearn.step07.ch09_Tree말단노드까지의최단거리_DFS;

public class Main {
    Node root;


    public int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        }
        else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));
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