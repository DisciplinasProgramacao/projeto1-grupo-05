import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProdutoTest {
	public static Produto p;
	
	@BeforeEach
	public void setUp() throws Exception {
		p = new Produto("wingslongson",22,3,1.4f);
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
	
}
