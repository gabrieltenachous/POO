
package Lista04.Pedido;

public class Paozinho extends Produto{

public Paozinho(double preco, int quantidade) {
    super(preco, quantidade);
}

@Override
public String toString() {
    return super.toString();
}

@Override
public double quantidadeXpreco() {
return getPreco()*getQuantidade();
}
}
