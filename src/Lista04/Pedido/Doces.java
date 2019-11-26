 
package Lista04.Pedido;

public class Doces extends Produto{

public Doces(double preco, int quantidade) {
    super(preco, quantidade);
}
@Override
public double quantidadeXpreco() {
    return getPreco()*getQuantidade();
}

}