package br.com.waldson.aula11;

import static org.junit.Assert.*;

public class ArvoreBinariaBuscaTest {

    @org.junit.Test
    public void isBalanced() {
        ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();

        arvore.insert(new Node(9));
        arvore.insert(new Node(11));
        arvore.insert(new Node(10));

        assertSame(true, arvore.isBalanced());
    }
}