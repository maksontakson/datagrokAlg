package sum.up.binary.tree;

public class BinaryTree {
  public static class Node {
    Node left;
    Node right;
    double value;
  }
  public double getSumOfNodes(Node node) {
    if (node == null) {
      return 0;
    }

    return node.value + getSumOfNodes(node.left) + getSumOfNodes(node.right);
  }

  public Node createNewNode(int val) {
    Node newNode = new Node();
    newNode.value = val;
    newNode.left = null;
    newNode.right = null;
    return newNode;
  }
}
