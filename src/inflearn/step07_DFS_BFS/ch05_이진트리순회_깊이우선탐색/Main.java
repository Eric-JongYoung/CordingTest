package inflearn.step07_DFS_BFS.ch05_이진트리순회_깊이우선탐색;

public class Main {
    Node root;

    /**
     * sout -> DFS lt -> DFS rt : 전위
     * DFS lt-> sout -> DFS rt : 중위
     * DFS lt-> DFS rt -> sout : 후위
     * */
    public void DFS(Node root) {
        if(root==null) return;
        else {
            System.out.print(root.data+ " "); // 전위
            DFS(root.lt); //왼쪽 자식으로 가기
            DFS(root.rt); //오른쪽 자식으로 가기
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
        tree.DFS(tree.root);
    }
}

class Node{
    int data;
    Node lt, rt; // 객체 주소를 저장하는 class
    public Node(int val) {
        data = val;
        lt=rt=null; // 생성되는 순간에는 null 임 -> 여기에 주소를 넣어야함.
    }
}
