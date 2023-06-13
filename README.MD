[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-f4981d0f882b2a3f0472912d15f9806d57e124e0fc890972558857b51b24a6f9.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=10120019)
# Gestão de estoque
Sistema simples de gestão de estoque, com cálculo de preço de venda de produtos e atualização/reposição de produtos quando necessário.

- escrito/corrigido por mim (Cleiton)

## Nota base do grupo: 9,25

A nota final, que é individual, se dará pela nota acima, multiplicada por um peso entre 0 e 1 relativo ao acompanhamento semanal do projeto. Lembre-se: não é só a entrega do produto finalizado que importa, é todo o processo de sua construção e as entregas parciais para o “cliente”.

## Comentários
	- Preencheram o backlog
	- Ficou confuso terem deixado a pasta Gestão de Estoque na raiz e ainda terem a pasta de código (deveriam ter direcionado para a pasta dentro de código)
	- Existem arquivos que estão dentro de um package e outros não


### Diagrama + aderência das classes ao diagrama: 2/2 pontos 


### Requisitos corretamente implementados: 4/6 pontos 
	- produto (preço, estoque) - 1,5 / 2
	Existem dois métodos duplicados valorTotal()
	Não é uma boa prática colocar input dentro de uma classe de negócio
	Não valida a quantidade mínima de caracteres para a descrição no construtor
	Não valida elementos negativos

	- estoque (valor, abaixo do estoque) - 1,25 / 2
	A classe estoque deveria modularizar as operações a serem realizadas no produto, evitando assim operações do tipo: e.produtos[codProduto].repor(qtd) que atualmente estão sendo realizadas pela classe aplicação.
	A atividade de repor produto do estoque seria de responsabilidade da classe estoque. Ex: e.repor(codProduto, qtd)

	- sistema (vender, comprar, consultas)  1,25 / 2
	Não existe construtor de Produto com 6 parâmetros

	0  -  Finalizar programa
	1  -  Vender e fazer pedido de produtos - Permite vender produtos que não possue no estoque. Ex. Estoque 0 e permite fazer venda, permite operações com valores negativos
	2  -  Consultar dados - Ok
	3  -  Balanço da empresa - Poderia no balanço gerado, já apresentar todas as informações
	4  -  Cadastrar produto - Permite cadastro com descrição menor de 3 caracteres



### Documentação de código: 0,75 pontos 
	Documentação praticamente inexistente
	Usaram DisplayName para os testes
	
### Testes (quantidade e qualidade): 2,5/4 pontos 
	Preencheram o plano de testes

	- produto: 1/2 pontos
	Não existe construtor com 6 parâmetros
	Criei o construtor manualmente para rodar a suite de testes
	Poderia testar os casos de insucesso. Ex. Colocar a descrição menor que 3 caracteres

	
	- estoque: 1,5/2 pontos
	Não existe construtor com 6 parâmetros
  
  
## Alunos integrantes da equipe

* Amanda Moura de Souza
* Arthur do Nascimento Sita Gomes
* Gabriel Estevão Nogueira Sobrinho
* Luiz Gustavo Mendes Santos
* Vitor Nunes Calhau

## Professores responsáveis

* Cleiton Silva Tavares
* João Caram Santos de Oliveira

