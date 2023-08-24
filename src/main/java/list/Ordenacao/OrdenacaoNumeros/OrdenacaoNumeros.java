package main.java.list.Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros
{
    List<Integer> numerosList;

    public OrdenacaoNumeros()
    {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaOrdenadaAscendente = new ArrayList<>(numerosList);
        Collections.sort(listaOrdenadaAscendente);
        return listaOrdenadaAscendente;
    }
    public List<Integer> ordenarDescendente(){
        List<Integer> listaOrdenadaDescendente = new ArrayList<>(numerosList);
        Collections.sort(listaOrdenadaDescendente);
        Collections.reverse(listaOrdenadaDescendente);
        return listaOrdenadaDescendente;
    }

    public static void main(String[] args)
    {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(30);
        ordenacaoNumeros.adicionarNumero(59);
        ordenacaoNumeros.adicionarNumero(89);
        ordenacaoNumeros.adicionarNumero(74);
        ordenacaoNumeros.adicionarNumero(78);
        ordenacaoNumeros.adicionarNumero(996);
        ordenacaoNumeros.adicionarNumero(65);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

}
