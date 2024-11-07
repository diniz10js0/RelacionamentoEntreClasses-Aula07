public class TesteCarrinho {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.0);
        Produto produto2 = new Produto("Feijao", 7.5);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);

        System.out.println("Total do carrinho: " + carrinho.calcularTotal());
    }
}
