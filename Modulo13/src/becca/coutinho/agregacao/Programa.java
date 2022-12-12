package becca.coutinho.agregacao;

public class Programa {

    public static void main(String args[]){
        Produto produtoTV = criarProduto(1L, 1000d, "TV");
        Produto produtoCel = criarProduto(12L, 100d, "Celular");

        Vendedor vendedor = criarVendedor("Rebecca", 10d);

        Comprador comprador = criarComprador("Caio", 1000d);

        Venda venda = new Venda();
        venda.setVendedor(vendedor);
        venda.setComprador(comprador);
        venda.add(produtoTV);
        venda.add(produtoCel);

        venda.concretizarVenda();
    }

    private static Comprador criarComprador(String nome, Double verba) {
        Comprador comprador = new Comprador();
        comprador.setVerba(verba);
        comprador.setNome(nome);
        return comprador;
    }

   private static Vendedor criarVendedor(String nome, Double comissao) {
        Vendedor vendedor = new Vendedor();
        vendedor.setComissao(comissao);
        vendedor.setNome(nome);
        return vendedor;
    }

    private static Produto criarProduto(Long codigo, Double valor, String nome){
        Produto produto = new Produto();
        produto.setCodigo(codigo);
        produto.setPreco(valor);
        produto.setNome(nome);
        return produto;
    }
}
