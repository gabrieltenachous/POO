
package Lista04.Pedido;

public class Frios extends Produto{

public Frios(double preco, int quantidade) {
    super(preco, quantidade);
}

@Override
public double quantidadeXpreco() {
    return getPreco()*getQuantidade();
}

}