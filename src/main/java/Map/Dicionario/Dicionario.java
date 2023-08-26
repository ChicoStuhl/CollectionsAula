package main.java.Map.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario
{
    Map<String, String> dicionarioMap;
    public Dicionario()
    {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionarioMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }

    public String pesquisaPorPalavra(String palavra){
        if(!dicionarioMap.isEmpty()){
            return dicionarioMap.get(palavra);
        }
        return null;
    }

    public static void main(String[] args)
    {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Teste1", "Descrição 1");
        dicionario.adicionarPalavra("Teste2", "Descrição 2");
        dicionario.adicionarPalavra("Teste3", "Descrição 3");
        dicionario.adicionarPalavra("Teste4", "Descrição 4");
        dicionario.adicionarPalavra("Teste5", "Descrição 5");
        dicionario.adicionarPalavra("Teste6", "Descrição 6");
        dicionario.adicionarPalavra("Teste7", "Descrição 7");
        dicionario.adicionarPalavra("Teste8", "Descrição 8");

        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisaPorPalavra("Teste8"));




    }

}
