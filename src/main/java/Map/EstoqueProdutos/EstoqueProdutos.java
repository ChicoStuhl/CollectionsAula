package main.java.Map.EstoqueProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos
{
    Map<Integer, Produto> produtoMap;

    public EstoqueProdutos(){
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(Integer codigo, String nome, Integer quantidade, Double preco){
        produtoMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(produtoMap);
    }

    public Double calcularValorTotalEstoque(){
        Double somaProdutos = 0.0;
        for(Produto p : produtoMap.values()){
            somaProdutos += p.getPreco() * p.getQuantidade();
        }
        return somaProdutos;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaiorValor = null;
        Double maiorPreco = Double.MIN_VALUE;
        for(Produto p : produtoMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaiorValor = p;
                maiorPreco = p.getPreco();
            }
        }
        return produtoMaiorValor;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMenorValor = null;
        Double menorPreco = Double.MAX_VALUE;
        for(Produto p : produtoMap.values()){
            if(p.getPreco() < menorPreco){
                produtoMenorValor = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMenorValor;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQtd = null;
        Double maiorValor = Double.MIN_VALUE;
        for(Produto p : produtoMap.values()){
            if(p.getQuantidade() * p.getPreco() > maiorValor){
                produtoMaiorQtd = p;
                maiorValor = p.getPreco() * p.getQuantidade();
            }
        }
        return produtoMaiorQtd;
    }

    public static void main(String[] args)
    {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(11254, "Pera", 6, 10.99 );
        estoqueProdutos.adicionarProduto(2353, "Maçã", 7, 8.99);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }

}
