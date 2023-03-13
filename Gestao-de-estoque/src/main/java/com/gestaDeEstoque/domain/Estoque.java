package com.gestaDeEstoque.domain;

public class Estoque {

    public Produto[] produtos;
    private int quantidade;
    private float valorTotal;
    private int MAX_ESTOQUE = 100;

    public Estoque(int quantidadeDeEstoque) {
        produtos = new Produto[quantidadeDeEstoque];
        quantidade = 0;
        valorTotal = 0;
    }

    public Estoque() {
        produtos = new Produto[MAX_ESTOQUE];
        quantidade = 0;
        valorTotal = 0;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal() {
      float total = 0;
      for(int i = 0; i < quantidade; i++) {
        total += produtos[i].valorTotal();
      }
      this.valorTotal = total;
    }

    public boolean dentroDoLimite() {
        return quantidade > 0;
    }

    public void listarProdutos(int quantity){
      System.out.println("Lista de produtos");
      for(int i = 0; i < quantidade; i++){
        if(produtos[i].getEstoque() < quantity){
          System.out.println("  "+i+ "  -  " + produtos[i].getNome());
          
        }
        
      }
      System.out.println("");
     
    }

    public float valorDeReposicao(){
      float totalValue = 0;

      for(int i = 0; i < quantidade; i++){
        totalValue += produtos[i].valorDeReposicao();
      }

      return totalValue;
    }

    public float totalArrecadado(){
      float total = 0;
      for(int i = 0; i < quantidade; i++) {
        total += produtos[i].valorArrecadado();
      }

      return total;
    }

  public void cadProduto(Produto p) {
    this.produtos[quantidade++] = p;
  }
  
}