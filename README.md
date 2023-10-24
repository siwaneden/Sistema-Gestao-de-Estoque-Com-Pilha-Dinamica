# Sistema de Estoque em Java

## Introdução
Este projeto é uma implementação em Java de um sistema de estoque simples usando uma pilha (Stack). O código inclui um menu interativo que permite ao usuário adicionar produtos ao estoque, vender produtos, verificar o último produto adicionado e verificar se o estoque está vazio.

## Pré-requisitos
- Java 8 ou superior

## Explicação do Código

### Classe `Produto`
A classe `Produto` é responsável por modelar um produto no estoque. Ela contém três campos privados: `id`, `nome` e `quantidade`, e métodos getters para acessar esses campos.

### Classe `Main` e Método `main`
A classe `Main` contém o método `main`, onde a lógica principal do programa é executada. Ele faz o seguinte:

1. **Inicialização**: Cria uma pilha `estoque` e um objeto `Scanner` para entrada do usuário.
2. **Menu Interativo**: Apresenta um menu com várias opções para o usuário.
    - **Adicionar Produto**: Solicita detalhes do produto e o adiciona ao topo da pilha.
    - **Vender Produto**: Remove e mostra o produto do topo da pilha.
    - **Verificar Último Produto**: Mostra o produto no topo da pilha sem removê-lo.
    - **Verificar Estoque**: Informa se o estoque está vazio ou não.
    - **Sair**: Encerra o programa.

## Conclusão
Este código serve como uma base para entender como implementar um sistema de estoque simples em Java usando uma pilha. O projeto pode ser estendido para incluir mais funcionalidades, como histórico de transações, categorias de produtos, entre outros.
