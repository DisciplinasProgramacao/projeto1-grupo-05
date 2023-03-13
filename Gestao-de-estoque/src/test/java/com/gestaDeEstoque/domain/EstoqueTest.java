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

        assertEquals(1, e.getQuantidade())
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

}