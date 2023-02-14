package sum.up.binary.tree;

public class MainBinaryTree {
  public static void main(String[] args) {
    BinaryTree binaryTree = new BinaryTree();
    BinaryTree.Node root = binaryTree.createNewNode(10);
    root.left = binaryTree.createNewNode(6);
    root.right = binaryTree.createNewNode(12);
    root.left.left = binaryTree.createNewNode(5);
    root.left.right = binaryTree.createNewNode(8);
    root.left.right.left = binaryTree.createNewNode(7);
    root.left.right.right = binaryTree.createNewNode(9);
    root.right.right = binaryTree.createNewNode(14);
    root.right.left = binaryTree.createNewNode(11);

    System.out.println("Sum is: " + binaryTree.getSumOfNodes(root));
  }
}
