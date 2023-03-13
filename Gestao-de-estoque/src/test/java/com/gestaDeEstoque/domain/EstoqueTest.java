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
        Produto produto = new Produto("test", 22, 10, 0, 30);
        Estoque e = new Estoque();

        e.repor(produto);

        assertEquals(1, e.getQuantidade());
    }

    @Test
    @DisplayName("Testando se é possivel repor o estoque")
    void repor() {
        Produto produto = new Produto("test", 22, 10, 0, 30);
        Estoque e = new Estoque();

        estoque.repor(produto);
        e.repor(produto);

        assertSame(e, estoque);
    }

    @Test
    @DisplayName("Testando se é possivel retirar um produto do estoque")
    void retirar() {
        Produto produto = new Produto("test", 22, 10, 0, 30);
        Estoque e = new Estoque();

        e.repor(produto);
        e.retirar(produto);

        assertEquals(0, e.getQuantidade());
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