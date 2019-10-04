package br.com.waldson.aula11;

public class ArvoreBinariaBusca{
    private Node raiz = null;

    public boolean isEmpty() {
        return raiz == null;
    }

    public Node getRoot() {
        return raiz;
    }

    public void insert(Node node) {
        if (raiz == null) {
            raiz = node;
            return;
        }
        raiz.insert(node);
    }

    public void insert(int value) {
        Node n = new Node(value);
        insert(n);
    }

    public Node search(int key) {
        if (raiz == null) {
            return null;
        }
        return raiz.search(key);
    }

    // Atividade para implementar Método para Verificar se uma Árvore está Balanceada
    //Aluno: Raul Miguel de Souto Santos
    //Para saber se a árvore está balanceada, precisamos inicialmente encontrar a sua altura.
    public boolean isBalanced(){
        return isBalanced(this);
    }

    public boolean isBalanced(ArvoreBinariaBusca arvore){
      if(arvore.raiz.isBalanced())
          return true;
      return false;
    }

}

