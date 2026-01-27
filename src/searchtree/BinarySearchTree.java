package searchtree;

// BinarySearchTree class with insertion, search, and traversal methods

import java.util.Date;

public class BinarySearchTree {
    Node root;

    // Insert a new value into the BST
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive method to insert a new value
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // Search for a value in the BST
    public boolean search(int value) {
        return searchRec(root, value);
    }

    // Recursive method to search for a value
    private boolean searchRec(Node root, int value) {
        if (root == null) return false;
        if (root.value == value) return true;
        return value < root.value ? searchRec(root.left, value) : searchRec(root.right, value);
    }

    // Inorder traversal (Left -> Root -> Right)
    public void inorderTraversal(Node node) {
        if (node == null) return;
        inorderTraversal(node.left);
        System.out.print(node.value + " ");
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        // Insert values into the BST
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Perform inorder traversal (should print sorted order)
        System.out.println("Inorder Traversal:");
        bst.inorderTraversal(bst.root);  // Output: 20 30 40 50 60 70 80

        // Search for some values
        System.out.println("\n\nSearch Results:");
        System.out.println("Is 40 present? " + bst.search(40));  // Output: true
        System.out.println("Is 90 present? " + bst.search(90));  // Output: false
    }
}

// Node class representing an individual node in the BST
class Node {
    int value;
    Node left, right;

    // Constructor to create a new node
    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}

