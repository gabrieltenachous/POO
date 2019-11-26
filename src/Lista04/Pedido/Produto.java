
package Lista04.Pedido;

public abstract class Produto {

private double preco;
private int quantidade;

public Produto(double preco, int quantidade) {
    setPreco(preco);
    setQuantidade(quantidade);
}

@Override
public String toString() {
    return "[Preco:]" + preco + "\t[Quantidade:]" + quantidade+ "\t[Quantidade*preco]"+quantidadeXpreco();
}

/**
 * @return the preco
 */
public double getPreco() {
    return preco;
}

/**
 * @param preco the preco to set
 */
public void setPreco(double preco) {
    this.preco = preco;
}

/**
 * @return the quantidade
 */
public int getQuantidade() {
    return quantidade;
}

/**
 * @param quantidade the quantidade to set
 */
public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}

public abstract double quantidadeXpreco();

}
