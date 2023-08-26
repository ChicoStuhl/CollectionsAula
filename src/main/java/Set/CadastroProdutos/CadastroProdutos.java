package main.java.Set.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos
{
    Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, int quantidade, double preco){
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public Set<Produto> exibirProdutosPorCodigo(){
        Set<Produto> produtosPorCodigo = new TreeSet<>(new ComparatorPorCodigo());
        produtosPorCodigo.addAll(produtoSet);
        return produtosPorCodigo;
    }

    public static void main(String[] args)
    {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("Queijo", 22145, 3, 60.12);
        cadastroProdutos.adicionarProduto("Maça", 22146, 3, 2.12);
        cadastroProdutos.adicionarProduto("Leite", 22175, 3, 0.12);
        cadastroProdutos.adicionarProduto("Ovo", 22115, 3, 60.2);
        cadastroProdutos.adicionarProduto("Vinho", 21145, 3, 60.1);
        cadastroProdutos.adicionarProduto("Whiskey", 12145, 3, 62.12);
        cadastroProdutos.adicionarProduto("Acem", 23145, 3, 30.12);
        cadastroProdutos.adicionarProduto("Filé", 20145, 3, 10.12);

        System.out.println(cadastroProdutos.exibirProdutosPorCodigo());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());
        System.out.println(cadastroProdutos.exibirProdutosPorNome());



    }

}
