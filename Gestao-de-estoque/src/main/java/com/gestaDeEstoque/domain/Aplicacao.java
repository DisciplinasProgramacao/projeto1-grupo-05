import java.util.Scanner;

public class Aplicacao {

  Estoque e = new Estoque();
  Produto p = new Produto();
  Estoque[] vetE = new Estoque[10];
  int qtdE = 0;
  
  public void opc1() {
    // Sub menu
		int cod;
		do {
			System.out.println("Codigo  Acao");
			System.out.println("  0  -  Cancelar");
			System.out.println("  1  -  Dar baixa em estoque");
			System.out.println("  2  -  Repor estoque\n");
			System.out.print("Escolha a acao a ser realizada: ");
			cod = input.nextInt();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1: // Da baixa na quantidade escolhida do atributo do produto selecionado
				e.retirar(int qtd, int codProduto);
				break;
			case 2: // Adiciona a quantidade escolhida do atributo do produto selecionado
				e.repor(int qtd, int codProduto);
				break;
			default:
				System.out.println("Codigo invalido");
				break;
			}
		} while (cod != 0);
  }

  public void opc2() {
    // Sub menu
		int cod;
		do {
			System.out.println("Codigo  Acao");
			System.out.println("  0  -  Cancelar");
			System.out.println("  1  -  Quantidade de produtos em estoque");
			System.out.println("  2  -  Produtos com estoque abaixo do minimo");
			System.out.println("  3  -  Detalhes de um produto");
			System.out.println("  4  -  Listar produtos");
			System.out.println("  5  -  Listar estoques\n");
			System.out.print("Escolha a acao a ser realizada: ");
			cod = input.nextInt();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1:
				System.out.println("\nTem " + e.qtdEmEstoque() + " produtos em estoque");
				break;
			case 2: // Lista todos os produtos com estoque abaixo do mínimo
				e.abaixoMinimo();
				break;
			case 3: // Mostra os dados do produto escolhido
      // Com valor de venda, total arrecadado, custo de produção, imposto e situação + atributos
				p.mostrarProduto(int codProduto)
				break;
			case 4: // Lista todos os produtos
				e.listarProdutos()
				break;
			case 5: // Lista todos os estques
				for(int i = 0; i < qtdE; i++) {
          vetE[i].imprimir();
        }
				break;
			default:
				System.out.println("Codigo invalido");
				break;
			}
		} while (cod != 0);
  }

  public void opc3() {
    // Sub menu
		int cod;
		do {
			System.out.println("Codigo  Acao");
			System.out.println("  0  -  Cancelar");
			System.out.println("  1  -  Valor total dos produtos em estoque");
			System.out.println("  2  -  Valor total das vendas de um produto");
			System.out.println("  3  -  Valor total dos produtos do estoque já vendidos");
			System.out.println("  4  -  Valor total dos produtos comprados para estoque\n");
			System.out.print("Escolha a acao a ser realizada: ");
			cod = input.nextInt();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1:
				System.out.println("\nO valor do estoque atual e de R$" + e.getValorTotal());
				break;
			case 2: // Valor total das vendas de um produto
        p.valorArrecadado();
				break;
			case 3: // Usando função de valor arrecadado da classe produto
				e.totalArrecadado();
				break;
			case 4: // Valor total dos produtos comprados para estoque
				e.valorDeReposicao();
				break;
			default:
				System.out.println("Codigo invalido");
				break;
			}
		} while (cod != 0);
  }

  public void opc4() {
    // Sub menu
		int cod;
		do {
			System.out.println("Codigo  Acao");
			System.out.println("  0  -  Cancelar");
			System.out.println("  1  -  Cadastrar produto");
			System.out.println("  2  -  Cadastrar estoque\n");
			System.out.print("Escolha a acao a ser realizada: ");
			cod = input.nextInt();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1:
				e.cadEstoque();
				break;
			case 2:
				e.cadProduto();
				break;
			default:
				System.out.println("Codigo invalido");
				break;
			}
		} while (cod != 0);
  }

	public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
		
		System.out.println("Gestao de estoque:\n");
    Estoque e = new Estoque();
    
    // Menu
		int cod;
		do {
			System.out.println("Codigo  Acao");
			System.out.println("  0  -  Finalizar programa");
			System.out.println("  1  -  Vender e fazer pedido de produtos");
			System.out.println("  2  -  Consultar dados");
			System.out.println("  3  -  Balanço da empresa");
			System.out.println("  4  -  Cadastrar produtos e estoque\n");
			System.out.print("Escolha a acao a ser realizada: ");
			cod = input.nextInt();
			switch(cod) {
			case 0:
				System.out.println("\nAte mais");
				break;
			case 1:
				opc1();
				break;
			case 2:
				opc2();
				break;
			case 3:
				opc3();
				break;
			case 4:
				opc4();
				break;
			default:
				System.out.println("Codigo invalido");
				break;
			}
		} while (cod != 0);

	}

}