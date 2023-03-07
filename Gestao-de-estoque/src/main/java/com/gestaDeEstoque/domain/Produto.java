package com.gestaDeEstoque.domain;

public class Produto {
    private String nome;
    private float precoCusto;
    private int estoque;
    private int vendidos;
    private int margemLucro;
    private int maxEstoque;

    public Produto(String nome, float precoCusto, int estoque, int vendidos, int margemLucro){
        this.nome=nome;
        this.precoCusto=precoCusto;
        this.estoque=estoque;
        this.vendidos=vendidos;
        this.margemLucro=margemLucro;
        this.maxEstoque=0;
    }

    public int getMargemLucro() {
        return margemLucro;
    }
    public void setMargemLucro(int margemLucro) {
        this.margemLucro = margemLucro;
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
        this.maxEstoque+=estoque;
    }
    public int getVendidos() {
        return vendidos;
    }
    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public int getMaxEstoque() {
        return maxEstoque;
    }

    public float calcularImposto(){
        return(0.18f/(this.getPrecoCusto()*this.getMargemLucro()));
    }

    public float calcularVenda(){
        return((this.getPrecoCusto()*this.getMargemLucro())+calcularImposto());
    }

    public boolean emEstoque(){
        return 0>this.getEstoque();
    }

    public float valorArrecadado(){
        return this.getPrecoCusto() * this.getMaxEstoque();
    }
}
