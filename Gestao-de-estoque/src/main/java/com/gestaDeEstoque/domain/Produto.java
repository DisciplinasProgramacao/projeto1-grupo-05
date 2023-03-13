import java.util.Scanner;

public class Produto{

  private String nome;
  private float precoCusto;
  private float margemLucro;
  private int estoque;
  private int vendidos;
  private int totalEstoque;
  
  Scanner input = new Scanner(System.in);

    public Produto(String nome, float precoCusto, float margemLucro, int estoque, int vendidos, int totalEstoque) {
  		this.nome = nome;
  		this.precoCusto = precoCusto;
  		this.setMargemLucro(margemLucro);
  		this.estoque = estoque;
  		this.vendidos = vendidos;
  		this.totalEstoque = totalEstoque;
	  }
  

    public Produto(String nome, float precoCusto, float margemLucro){
        this.nome=nome;
        this.precoCusto=precoCusto;
        this.estoque=0;
        this.vendidos=0;
        this.setMargemLucro(margemLucro);
        this.totalEstoque=0;
    }

    public float getMargemLucro() {
        return margemLucro;
    }
    public void setMargemLucro(float margemLucro) {
        if(margemLucro<=80 && margemLucro>=30) {
          this.margemLucro = margemLucro;
        } else{
          System.out.println("Valor invalido");
          do {
            System.out.print("Digite a margem de lucro do produto(30% - 80%): ");
            margemLucro = input.nextFloat();
          } while(margemLucro <= 30 || margemLucro >= 80);
          this.margemLucro = margemLucro;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.length()>=3){
            this.nome = nome;}else {
            System.out.println("Nome possui menos de 3 caracteres");
        }
    }
    public float getPrecoCusto() {
        return precoCusto;
    }
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getEstoque() {
        return estoque;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public int getVendidos() {
        return vendidos;
    }
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public int getTotalEstoque() {
        return totalEstoque;
    }

    public float calcularImposto(){
      return(0.18f*(100/this.getMargemLucro()*this.getPrecoCusto()));
    }

    public float calcularVenda(){
      return 100/this.getMargemLucro()*this.getPrecoCusto()+this.calcularImposto();
    }

    public boolean emEstoque(){
        return this.getEstoque()>0;
    }

    public float valorTotal(){
        return this.calcularVenda() * this.getEstoque();
    }

    public float valorArrecadado(){
        return (this.calcularVenda() - this.getPrecoCusto() - this.calcularImposto()) * this.getVendidos();
    }

    public void imprimir(){
    	System.out.print("\nNome: " + nome + "\nPreco de custo: " + precoCusto + "\nEstoque: " + estoque + "\nVendidos: " + vendidos
		   + "\nMargem de Lucro: " + margemLucro + "%");
    	System.out.printf("\nValor de venda = %.2f\n",this.calcularVenda());
    	
    }
    
    public float calcularCusto(){
        return(this.getEstoque() * this.getPrecoCusto());
    }

    public void repor(int quantidadeParaRepor) {
        this.setEstoque(this.getEstoque() + quantidadeParaRepor);
        this.totalEstoque+=quantidadeParaRepor;  
    }

    public float valorDeReposicao(){
      return this.getTotalEstoque()*this.getPrecoCusto();
    }


    public void retirar(int quantidadeParaRetirar) {
      this.setEstoque(this.getEstoque() - quantidadeParaRetirar);
      this.vendidos+=quantidadeParaRetirar;
    }

}
