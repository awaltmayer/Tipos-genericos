package br.edu.atitus.augusto_wolfart_altmayer;


public class Main {

    public static void main(String[] args) {

        System.out.println("═══════════════════════════════");
        System.out.println(" FILA DE CLIENTES");
        System.out.println("═══════════════════════════════");

        Fila<Cliente> filaCliente = new Fila<>();
        filaCliente.adicionar(new Cliente("Augusto W. Altmayer",    "522.565.458-23"));
        filaCliente.adicionar(new Cliente("Mano Lima",   "445.032.593-78"));
        filaCliente.adicionar(new Cliente("Gascaino", "057.019.081-24"));

        System.out.println("\n[1] Todos os elementos:");
        filaCliente.listar();

        System.out.println("\n[2] Primeiro da fila: " + filaCliente.primeiro());

        System.out.println("\n[3] Removendo próximo: " + filaCliente.proximo());

        System.out.println("\n[4] Elementos restantes:");
        filaCliente.listar();

        System.out.println("\n[5] Quantidade: " + filaCliente.quantidade());


        System.out.println("\n═══════════════════════════════");
        System.out.println(" FILA DE CHAMADOS");
        System.out.println("═══════════════════════════════");

        Fila<Chamado> filaChamado = new Fila<>();
        filaChamado.adicionar(new Chamado(5, "Problemas na identção do projeto"));
        filaChamado.adicionar(new Chamado(102, "Erro ao emitir o banner"));
        filaChamado.adicionar(new Chamado(154, "Lentidão"));

        System.out.println("\n[1] Todos os elementos:");
        filaChamado.listar();

        System.out.println("\n[2] Primeiro da fila: " + filaChamado.primeiro());

        System.out.println("\n[3] Removendo próximo: " + filaChamado.proximo());

        System.out.println("\n[4] Elementos restantes:");
        filaChamado.listar();

        System.out.println("\n[5] Quantidade: " + filaChamado.quantidade());


        System.out.println("\n═══════════════════════════════");
        System.out.println(" FILA DE PEDIDOS");
        System.out.println("═══════════════════════════════");

        Fila<Pedido> filaPedido = new Fila<>();
        filaPedido.adicionar(new Pedido(1001, 299.90));
        filaPedido.adicionar(new Pedido(1002,  89.50));
        filaPedido.adicionar(new Pedido(1003, 549.00));

        System.out.println("\n[1] Todos os elementos:");
        filaPedido.listar();

        System.out.println("\n[2] Primeiro da fila: " + filaPedido.primeiro());

        System.out.println("\n[3] Removendo próximo: " + filaPedido.proximo());

        System.out.println("\n[4] Elementos restantes:");
        filaPedido.listar();

        System.out.println("\n[5] Quantidade: " + filaPedido.quantidade());


        System.out.println("\n═══════════════════════════════");
        System.out.println(" TESTE: FILA VAZIA");
        System.out.println("═══════════════════════════════");

        Fila<Cliente> filaVazia = new Fila<>();
        System.out.println("proximo() em fila vazia: " + filaVazia.proximo());
        System.out.println("primeiro() em fila vazia: " + filaVazia.primeiro());
        System.out.println("vazia(): " + filaVazia.vazia());
    }
}