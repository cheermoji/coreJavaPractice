package coreJavaPractice.searchAlg.binarySearchTree;

public class Tree {

  private TreeNode root;

  public void insert(int value) {
    if (root == null) {
      root = new TreeNode(value);
    } else {
      root.insert(value);
    }
  }

  public void traverse() {
    if (root != null) {
      root.traverseInOrder();
    }
  }

  public TreeNode get(int value) {
    if (root != null) {
      return root.get(value);
    }
    return null;
  }

  public TreeNode getRoot() {
    return root;
  }

  public void setRoot(TreeNode root) {
    this.root = root;
  }
}
