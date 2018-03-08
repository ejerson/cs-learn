package tree;

public class LearnBinaryTree {
  
  // ma ctrl + space
  public static void main(String[] args) {
    Node a = new Node(10);
    a.insert(5);
    a.insert(8);
    a.insert(15);
    
//    System.out.println(a.right.right.right.data);
    a.printInOrder();
  }

}


class Node {
  Node left, right;
  int data;
  public Node(int data) {   
    this.data = data;
  }
  
  public void insert(int value) {
    if (value <= data) {
        if (left == null) {
          left = new Node(value);
        } else {
          left.insert(value);
        }
    } else {
        // if right node is empty, create a new node with currently passed value
        if (right == null) {
          right = new Node(value);
        // if the node exist, insert the current value inside that node
        } else {
          right.insert(value);
        }
    }
  }
  
  public boolean contains(int value) {
    // return true if what I passed this method is equal to data
    if (value == data) {
        return true;
    } else if (value < data) {
        // if empty return false
        if (left == null) {
          return false;
        } else {
          // 1. calling left child node of root or parent node's contains method
          //        data == what's inserted in the left node which 5
          return left.contains(value);
        }
    } else {
        if (right == null) {
          return false;
        } else {
          return right.contains(value);
        }
    }
  }
  
  public void printInOrder() {
    if (left != null) {
      left.printInOrder();
    }
    System.out.println(data);
     if (right != null) {
       right.printInOrder();
     }
  }
  
}