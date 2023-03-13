import java.util.Scanner;

public class Aplicacao {

  static Estoque e = new Estoque();
  static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
   
		
		System.out.println("\n____Gestao de estoque____");
    
    // Menu
		int cod;
    botaProdutos();
		do {
			System.out.println("\nCódigo  Ação");
			System.out.println("  0  -  Finalizar programa");
			System.out.println("  1  -  Vender e fazer pedido de produtos");
			System.out.println("  2  -  Consultar dados");
			System.out.println("  3  -  Balanço da empresa");
			System.out.println("  4  -  Cadastrar produto\n");
			System.out.print("Escolha a ação a ser realizada: ");
			cod = input.nextInt();
			input.nextLine();
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
				e.cadProduto(createProduct());
				break;
			default:
				System.out.println("Código inválido");
				break;
			}
		} while (cod != 0);

	}
  
  public static void opc1() {
    // Sub menu
		int cod;
    int qtd;
    int codProduto;
    
		do {
			System.out.print("\n____Venda e pedido de produto____");
			System.out.println("\nCódigo  Ação");
			System.out.println("  0  -  Voltar");
			System.out.println("  1  -  Dar baixa em estoque");
			System.out.println("  2  -  Repor estoque\n");
			System.out.print("Escolha a ação a ser realizada: ");
			cod = input.nextInt();
			input.nextLine();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1: // Da baixa na quantidade escolhida do atributo do produto selecionado
				System.out.print("\nCódigo do produto: ");
				codProduto = input.nextInt();
				System.out.print("Quantidade vendida: ");
				qtd = input.nextInt();
				e.produtos[codProduto].retirar(qtd);
				System.out.println("Foram retirados "+qtd+" produtos de "+e.produtos[codProduto].getNome()+"\nQuantidade atual: "+e.produtos[codProduto].getEstoque());
				break;
			case 2: // Adiciona a quantidade escolhida do atributo do produto selecionado
				System.out.print("\nCódigo do produto: ");
				codProduto = input.nextInt();
				System.out.print("Quantidade para repor: ");
				qtd = input.nextInt();
				e.produtos[codProduto].repor(qtd);
				System.out.println("Foram repostos "+qtd+" produtos de "+e.produtos[codProduto].getNome()+"\nQuantidade atual: "+e.produtos[codProduto].getEstoque());
				  break;
			default:
				System.out.println("\nCódigo invalido");
				break;
			}
		} while (cod != 0);
  }

  public static void opc2() {
    // Sub menu
		int cod;
		int qtd;
	    int codProduto;
		do {
			System.out.print("\n____Consulta de dados____");
			System.out.println("\nCódigo  ação");
			System.out.println("  0  -  Voltar");
			System.out.println("  1  -  Quantidade de produtos em estoque");
			System.out.println("  2  -  Produtos com estoque abaixo do minimo");
			System.out.println("  3  -  Detalhes de um produto");
			System.out.println("  4  -  Listar produtos\n");
			System.out.print("Escolha a ação a ser realizada: ");
			cod = input.nextInt();
			input.nextLine();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1:
				System.out.println("\nTem " + e.getQuantidade() + " produtos em estoque");
				break;
			case 2: // Lista todos os produtos com estoque abaixo do mínimo
        System.out.print("\nQuantidade mínima: ");
        qtd = input.nextInt();
				e.listarProdutos(qtd);
				break;
			case 3: // Mostra os dados do produto escolhido
      // Com valor de venda, total arrecadado, custo de produção, imposto e situação + atributos
				System.out.print("\nCódigo do produto: ");
        codProduto = input.nextInt();
        e.produtos[codProduto].imprimir();
				break;
			case 4: // Lista todos os produtos
				System.out.println("");
				e.listarProdutos(1000);
				break;
			default:
				System.out.println("\nCódigo invalido");
				break;
			}
		} while (cod != 0);
  }

  public static void opc3() {
    // Sub menu
		int cod;
	    int codProduto;
		do {
			System.out.print("\n____Balanço da empresa____");
			System.out.println("\nCódigo  Ação");
			System.out.println("  0  -  Voltar");
			System.out.println("  1  -  Valor total dos produtos em estoque");
			System.out.println("  2  -  Valor total das vendas de um produto");
			System.out.println("  3  -  Valor total dos produtos do estoque já vendidos");
			System.out.println("  4  -  Valor gasto em pedidos de reposição para um produto");
			System.out.println("  5  -  Valor gasto em pedidos de reposição no estoque\n");
			System.out.print("Escolha a ação a ser realizada: ");
			cod = input.nextInt();
			input.nextLine();
			switch(cod) {
			case 0:
				System.out.println("\n");
				break;
			case 1:
        			e.setValorTotal();
				System.out.printf("\nO valor do estoque atual e de R$%.2f\n", e.getValorTotal());
				break;
			case 2: // Valor total das vendas de um produto
				System.out.println("\nDigite o código do produto: ");
				codProduto = input.nextInt();
				System.out.printf("O valor arrecadado total do produto %s e de R$%.2f\n", e.produtos[codProduto].getNome(), e.produtos[codProduto].valorArrecadado());
				break;
			case 3: // Usando função de valor arrecadado da classe produto
				System.out.printf("\nO valor total de produtos ja vendidos e R$%.2f\n",e.totalArrecadado());
				break;
			case 4: // Valor total dos produtos comprados para estoque
				System.out.print("\nDigite o código do produto: ");
				codProduto = input.nextInt();
				input.nextLine();
				System.out.printf("O valor total comprado para estoque desse produto foi de R$%.2f\n",e.produtos[codProduto].valorDeReposicao());
				break;
			case 5: // Valor total gasto na reposição do estoque
		        	System.out.printf("\nO valor total de produtos comprados para o estoque foi de R$%.2f\n",e.valorDeReposicao());
				break;
			default:
				System.out.println("\nCódigo invalido");
				break;
			}
		} while (cod != 0);
  }

	static Produto createProduct(){
	    String nome;
	    float precoCusto;
	    float margemLucro;

	    System.out.print("\nDigite o nome do produto: ");
	    nome = input.nextLine();
	    System.out.print("Digite o preço de custo do produto: ");
	    precoCusto = input.nextFloat();
	    System.out.print("Digite a margem de lucro do produto: ");
	    margemLucro = input.nextFloat();

	    Produto p = new Produto(nome,precoCusto,margemLucro);
	    System.out.println("O produto "+p.getNome()+" foi criado.");
	    return p;
  	}

  	static void botaProdutos() {
		Produto c[]=new Produto[10];

		c[0]=new Produto("Leite",4.50f,40,10,14,28);
		c[1]=new Produto("Macarrão",6.50f,30,20,10,30);
		c[2]=new Produto("Arroz",8f,50,40,20,60);
		c[3]=new Produto("Coca",2.5f,60,50,60,110);
		c[4]=new Produto("Bala",2f,50,40,20,60);
		c[5]=new Produto("Tilápia",15f,50,20,10,30);
		c[6]=new Produto("Picanha",40f,80,30,10,40);
		c[7]=new Produto("Ruffles",5f,50,50,20,70);
		c[8]=new Produto("Fridadeira Eletrica philco air fry",500f,40,11,4,15);
		c[9]=new Produto("Cozinha Completa de Canto Madesa Reims",1400f,50,9,1,10);

		for(int i=0;i<10;i++) {
			e.cadProduto(c[i]);
		}
	}

}
