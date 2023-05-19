package ExerciciosMedios;

public class Exercicio8 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Inserindo elementos na árvore
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // Pesquisando por um elemento
        System.out.println("Elemento 40 encontrado: " + tree.search(40));
        System.out.println("Elemento 90 encontrado: " + tree.search(90));

        // Exibindo os elementos em ordem
        System.out.print("Elementos em ordem: ");
        tree.inOrderTraversal();
    }
}

class BinaryTree {
    private Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public boolean search(int value) {
        return searchRecursive(root, value);
    }

    private boolean searchRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        if (value < current.value) {
            return searchRecursive(current.left, value);
        } else {
            return searchRecursive(current.right, value);
        }
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(Node node) {
        if (node != null) {
            inOrderTraversalRecursive(node.left);
            System.out.print(node.value + " ");
            inOrderTraversalRecursive(node.right);
        }
    }
}