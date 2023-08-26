package main.java.Map.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras
{
    private Map<String, Integer> contagemMap;

    public ContagemPalavras(){
        this.contagemMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        contagemMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(contagemMap);
    }

    public void encontrarPalavraMaisFrequente(){
        String palavraFreq = null;
        Integer contagemTemp = Integer.MIN_VALUE;
        for (String s : contagemMap.keySet()) {
            if(contagemMap.get(s) > contagemTemp){
                contagemTemp = contagemMap.get(s);
                palavraFreq = s;
            }
        }
        System.out.println(palavraFreq + " = " + contagemTemp);
    }

    public static void main(String[] args)
    {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Palavra 1", 20);
        contagemPalavras.adicionarPalavra("Palavra 2", 90);
        contagemPalavras.adicionarPalavra("Palavra 3", 30);
        contagemPalavras.adicionarPalavra("Palavra 4", 40);
        contagemPalavras.adicionarPalavra("Palavra 5", 70);
        contagemPalavras.adicionarPalavra("Palavra 6", 10);

        contagemPalavras.exibirPalavras();
        contagemPalavras.removerPalavra("Palavra 4");
        contagemPalavras.encontrarPalavraMaisFrequente();
    }

}
