package com.gestaDeEstoque.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {
    public static Estoque estoque;

    @BeforeEach
    void setUp() throws Exception {
        estoque = new Estoque();
    }

    @Test
    @DisplayName("Testando se o estoque está dentro do limite")
    void estaDentroDoLimite() {
        assertEquals(false, estoque.dentroDoLimite());
    }

    @Test
    @DisplayName("Testando se pode adicionar um produto ao estoque")
    void cadProduto() {
        Produto produto = new Produto("test", 0, 0);
        estoque.cadProduto(produto);

        assertEquals(1, estoque.getQuantidade());

    }

    @Test
    @DisplayName("Testando o total arrecadado do estoque")
    void totalArrecadado() {
        Produto produto = new Produto("test", 10, 5);

        produto.repor(10);

        estoque.cadProduto(produto);
        assertEquals(100, estoque.totalArrecadado());
    }

    @Test
    @DisplayName("Testando o valor de reposição do estoque")
    void valorDeReposicao() {
        Produto produto = new Produto("test", 10, 5);

        produto.repor(10);

        estoque.cadProduto(produto);
        assertEquals(100, estoque.valorDeReposicao());
    }


    @Test
    @DisplayName("Testando se os produtos estão sendo listados")
    void testListarProdutos() {
      Produto produto = new Produto("test",30,30);
      estoque.cadProduto(produto);
      assertEquals("  0  -  test", estoque.listarProdutos(1000));
    }
	
	  @Test
    @DisplayName("Testando se o valor total está sendo calculado")
    void testSetValorTotal() {
      Produto produto = new Produto("Picanha",40f,80,30,10,40);
      Produto produto2 = new Produto("Pipoca premium gourmet",50f,50,20,15,60);
      estoque.cadProduto(produto);
      estoque.cadProduto(produto2);
      estoque.setValorTotal();
      assertEquals(4130,estoque.getValorTotal());
    }

}