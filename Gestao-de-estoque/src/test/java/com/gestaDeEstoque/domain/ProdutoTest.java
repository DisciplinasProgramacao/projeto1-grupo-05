
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    public static Produto p;

    @BeforeEach
    void setUp() throws Exception {
    //nome,preco de custo, margem de lucro, estoque atual, vendidos, estoque total
       p=new Produto("Picanha",40f,80,30,10,40);
    }

    @Test
    @DisplayName("Teste do preço de venda")
    void testCalcularVenda() {
        assertEquals(59.00, p.calcularVenda(),0.01);
    }

    @Test
    @DisplayName("Teste se existe produto em estoque")
    void testEmEstoque() {
        assertTrue(p.emEstoque());
    }
    
    @Test
    @DisplayName("Testa o valor arrecadado com o produto ate o momento")
    void testValorArrecadado() {
        assertEquals(100.00,p.valorArrecadado(),0.01);
    }

    @Test
    @DisplayName("Testa se o valor do imposto esta calculado corretamente")
    void testCalcularImposto() {
        assertEquals(9, p.calcularImposto(),0.01);
    }

    @Test
    @DisplayName("Testa o custo total do estoque atual do produto")
    void testCalcularCusto(){
        assertEquals(1200,p.calcularCusto(),0.01);
    }
  
    @Test
    
    
    @DisplayName("Testando se é possivel repor o estoque do produto")
    void repor() {
        p.repor(2);
        assertEquals(32, p.getEstoque());
    }

    @Test
    @DisplayName("Testando se é possivel retirar o estoque do produto")
    void retirar() {
        p.retirar(3);
        assertEquals(27, p.getEstoque());
    }

    @Test
    @DisplayName("Teste do valor de venda total de um produto")
    void testValorTotal() {
    	assertEquals(1770, p.valorTotal());
    }

    @Test
    @DisplayName("Teste do valor de reposição total de um produto")
    void testValorDeReposicao() {
    	assertEquals(1600, p.valorDeReposicao());
    }

}
