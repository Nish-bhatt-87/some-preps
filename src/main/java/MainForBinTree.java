public class MainForBinTree {

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        binaryTree.insert(6);
        binaryTree.insert(4);
        binaryTree.insert(8);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(7);
        binaryTree.insert(9);

        binaryTree.traverse();

    }
}
