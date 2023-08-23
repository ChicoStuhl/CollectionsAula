package main.java.list.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras
{
    private List<Item> itensList;

    public CarrinhoCompras(){
        this.itensList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade){
        itensList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaItemParaRemover = new ArrayList<>();
        for (Item i : itensList){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaItemParaRemover.add(i);
            }
        }
        itensList.removeAll(listaItemParaRemover);
    }
    public Double calcularValorTotal(){
        Double valorCalculo = 0.00;
        for(Item i : itensList){
            valorCalculo += i.getPreco() * i.getQuantidade();
        }
        return valorCalculo;
    }

    public void exibirItens(){
        System.out.println(itensList);
    }

    public static void main(String[] args){
        CarrinhoCompras carrinho = new CarrinhoCompras();

        carrinho.adicionarItem("Maça", 10.3, 15);
        carrinho.adicionarItem("Pera", 5.99, 6);
        carrinho.adicionarItem("Melancia", 18.0, 5);

        carrinho.exibirItens();
        System.out.println("O valor total do carrinho é de: "+ carrinho.calcularValorTotal());
    }

}
