package com.gestaDeEstoque.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    public static Produto p;

    @BeforeEach
    void setUp() throws Exception {
        p = new Produto("wingslongson",22,3,1, 4);
    }

    @Test
    void testCalcularVenda() {
        assertEquals(36.34, p.calcularVenda(),0.01);
    }

    @Test
    void testEmEstoque() {
        assertTrue(p.emEstoque());
    }
    @Test
    void testValorArrecadado() {
        assertEquals(109.03,p.valorArrecadado(),0.01);
    }

    @Test
    void testCalcularImposto() {
        assertEquals(5.54, p.calcularImposto(),0.01);
    }


    @Test
    @DisplayName("Testando se é possivel repor a quantidade do produto")
    void repor() {
        p.repor(2);

        assertEquals(5, p.getEstoque());
    }

    @Test
    @DisplayName("Testando se é possivel retirar a quantidade do produto")
    void retirar() {
        p.retirar(3);

        assertEquals(0, p.getEstoque());
    }
}