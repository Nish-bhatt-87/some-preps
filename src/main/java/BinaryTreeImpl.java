public class BinaryTreeImpl {

    Node root;

    public void insert(int data) {
        root= insertRec(root,data);
    }

    public Node insertRec(Node node, int data) {
        if (node == null) {
            node = new Node();
            node.setData(data);
        }else if (data > node.getData()) {
            node.setRight( insertRec(node.getRight(),data));
        }else {
            node.setLeft(insertRec(node.getLeft(),data));
        }
        return node;
    }

    public void traverse() {
        traverseRec(this.root);
    }

    private void traverseRec(Node root) {
        if (root != null) {
            traverseRec(root.getLeft());
            System.out.print(root.getData() + " ");
            traverseRec(root.getRight());
        }
    }
}
