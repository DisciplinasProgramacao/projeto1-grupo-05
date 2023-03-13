package com.gestaDeEstoque.domain;

public class Estoque {

    private Produto[] produtos;
    private int quantidade;
    private int valorTotal;
    private int MAX_ESTOQUE = 100;

    public Estoque(int quantidadeDeProdutos) {
        produtos = new Produto[quantidadeDeProdutos];
        quantidade = 0;
        valorTotal = 0;
    }

    public Estoque() {
        produtos = new Produto[MAX_ESTOQUE];
        quantidade = 0;
        valorTotal = 0;
    }


    public void repor(Produto produto, int novoEstoque) {
        for(int i = 0; i < produtos.length; i++) {
            
            if(produtos[i].getNome().equals(produto.getNome())) {
                produtos[i].setEstoque(produto.getEstoque() + novoEstoque);
            }
        }
    }


    public void retirar(Produto produto, int novoEstoque) {

        for(int i = 0; i < produtos.length; i++) {
            
            if(produtos[i].getNome().equals(produto.getNome())) {
                produtos[i].setEstoque(produtos[i].getEstoque() - novoEstoque);
            }
        }

    }

    public boolean dentroDoLimite() {
        return quantidade > 0;
    }
}
