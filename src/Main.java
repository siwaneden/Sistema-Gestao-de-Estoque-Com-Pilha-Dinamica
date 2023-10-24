import java.util.Scanner;
import java.util.Stack;

class Produto {
    private int id;
    private String nome;
    private int quantidade;

    public Produto(int id, String nome, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Produto> estoque = new Stack<>(); //implementa uma pilha dinamica
        Scanner scanner = new Scanner(System.in);

        while (true) { //opções do menu
            System.out.println("\nOpções:");
            System.out.println("1. novo produto");
            System.out.println("2. Vender");
            System.out.println("3. ultimo adicionado");
            System.out.println("4. olhar quantidade");
            System.out.println("5. Sair");
            System.out.print("Opção desejada: ");

            int opcao = scanner.nextInt();
            //caso de opções de acordo com as escolhas
            switch (opcao) { //loop infinito até sair
                case 1:
                    System.out.print("Digite o ID do produto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Qunatidade em Estoque: ");
                    int quantidade = scanner.nextInt();
                    Produto novoProduto = new Produto(id, nome, quantidade);//cria um obj produto
                    estoque.push(novoProduto); //metodo push pra adicionar ao topo da pilha
                    break;
                case 2:
                    if (!estoque.isEmpty()) {//verifica se está vazio
                        Produto produtoVendido = estoque.pop(); // se não estiver vazio remove do topo,
                        System.out.println("Produto vendido: " + produtoVendido.getNome());
                    } else {
                        System.out.println("Sem estoque");
                    }
                    break;
                case 3:
                    if (!estoque.isEmpty()) {// verifica se está vazio
                        Produto produtoTopo = estoque.peek();// verifica o produto no topo
                        System.out.println("produto primario : " + produtoTopo.getNome());
                    } else {
                        System.out.println("Estoque vazio.");
                    }
                    break;
                case 4:
                    if (estoque.isEmpty()) {// verifica se está vazio
                        System.out.println("Vazio");
                    } else {
                        System.out.println("tem produtos em estoque");
                    }
                    break;
                case 5:// da a saida do programa
                    System.out.println("Sair.");
                    System.exit(0);
                default:
                    System.out.println("opção não valida");
            }
        }
    }
}
