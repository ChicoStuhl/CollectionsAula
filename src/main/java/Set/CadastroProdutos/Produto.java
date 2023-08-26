package main.java.Set.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto>
{
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    @Override
    public int compareTo(Produto produto)
    {
        return nome.compareToIgnoreCase(produto.getNome());
    }


    public Produto(String nome, long codigo, double preco, int quantidade)
    {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo() && Double.compare(produto.getPreco(), getPreco()) == 0 && getQuantidade() == produto.getQuantidade() && Objects.equals(getNome(), produto.getNome());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getNome(), getCodigo(), getPreco(), getQuantidade());
    }

    public String getNome()
    {
        return nome;
    }

    public long getCodigo()
    {
        return codigo;
    }

    public double getPreco()
    {
        return preco;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    @Override
    public String toString()
    {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", codigo=" + codigo +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

}

class ComparatorPorPreco implements Comparator<Produto>
{
    @Override
    public int compare(Produto produto1, Produto produto2)
    {
        return Double.compare(produto1.getPreco(), produto2.getPreco());
    }
}

class ComparatorPorCodigo implements Comparator<Produto>{

    @Override
    public int compare(Produto produto1, Produto produto2)
    {
        return Long.compare(produto1.getCodigo(), produto2.getCodigo());
    }
}
