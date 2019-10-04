    package br.com.waldson.aula11;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public int getValue() {
        return value;
    }

    public void insert(Node node) {
        if (node.value < this.value) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.insert(node);
            }
        } else if (node.value > this.value) {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.insert(node);
            }
        }
    }

    public Node search(int key) {
        if (key == this.value) {
            return this;
        }

        if (key < this.value) {
            if (this.left != null) {
                return this.left.search(key);
            }
        }

        if (key > this.value) {
            if (this.right != null) {
                return this.right.search(key);
            }
        }

        return null;
    }

    public int getHeight() {
        return getHeight(this);
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        } else
            return top(getHeight(node.getLeft()), getHeight(node.getRight()) + 1);
    }

    private int top(int a, int b) {
        return a > b ? a : b;
    }
    //Fim do método para encontrar o tamanho.

    //Agora implementaremos o método para saber se a árvore está balanceada
    public boolean isBalanced(){
        return isBalanced(this);
    }

    boolean isBalanced(Node node)
    {
        int left; //Lado esquerdo da árvore
        int right; //Lado direito da árvore

        if (node == null) {
            return true;
        }

        // Atribue valor aos lados das árvores
        left = getHeight(node.left);
        right = getHeight(node.right);

        //Uso da recursividade para passar por todas as sub-árvores
        if (Math.abs(left - right) <= 1 && isBalanced(node.left) && isBalanced(node.right))
            return true;

        return false;
    }
}


