package main.java.list.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros
{
    private List<Integer> numerosList;

    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(Integer numero){
        numerosList.add(numero);
    }

    public Integer somaNumeros(){
        Integer somaTemp = 0;
        for(Integer i:numerosList){
            somaTemp += i;
        }
        return  somaTemp;
    }

    public Integer encontrarMaior(){
        Integer maior = 0;
        for(Integer i : numerosList){
            if (i > maior){
                maior = i;
            }
        }
        return maior;
    }

    public Integer encontrarMenor(){
        Integer menor = numerosList.get(0);
        for(Integer i : numerosList){
            if (i < menor){
                menor = i;
            }
        }
        return menor;
    }


    public void exibirNumeros(){
        System.out.println(numerosList);
    }

    public static void main(String[] args)
    {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(33);
        somaNumeros.adicionarNumero(25);
        somaNumeros.adicionarNumero(45);
        somaNumeros.adicionarNumero(65);
        somaNumeros.adicionarNumero(75);

        somaNumeros.exibirNumeros();

        System.out.println(somaNumeros.encontrarMaior());
        System.out.println(somaNumeros.encontrarMenor());
        System.out.println(somaNumeros.somaNumeros());


    }

}
