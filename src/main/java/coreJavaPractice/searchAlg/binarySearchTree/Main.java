package coreJavaPractice.searchAlg.binarySearchTree;

public class Main {

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(10);
    tree.insert(15);
    tree.insert(0);
    tree.insert(2);
    tree.insert(5);
    tree.insert(50);

    tree.traverse();

    System.out.println();
    System.out.println(tree.get(0));
    System.out.println(tree.get(1888));
  }
}
