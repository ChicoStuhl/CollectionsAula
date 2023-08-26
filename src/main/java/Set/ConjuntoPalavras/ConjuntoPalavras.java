package main.java.Set.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavras
{
    private Set<String> palavrasSet;

    public ConjuntoPalavras()
    {
        this.palavrasSet = new HashSet<>();
    }
    public void adicionarPalavra(String palavra){
        palavrasSet.add(palavra);
    }
    public void removerPalavra(String palavra){
        palavrasSet.remove(palavra);
    }
    public boolean verificarPalavra(String palavra){
        return palavrasSet.contains(palavra);
    }
    public void exibirPalavrasUnicas(){
        System.out.println(palavrasSet);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavras that)) return false;
        return Objects.equals(palavrasSet, that.palavrasSet);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(palavrasSet);
    }


}
