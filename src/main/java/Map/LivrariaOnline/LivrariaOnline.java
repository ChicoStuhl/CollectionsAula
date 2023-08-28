package main.java.Map.LivrariaOnline;

import java.util.*;

public class LivrariaOnline
{
    private Map<String, Livro> livroMap;

    public LivrariaOnline(){
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, Double preco){
        livroMap.put(link, new Livro(titulo, preco, autor));
    }

    public void removerLivro(String titulo){
        for(Map.Entry<String, Livro> livro : livroMap.entrySet()){
            if(livro.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livroMap.remove(livro.getKey());
            }
        }
    }

    public Set<Livro> exibirLivrosOrdenadosPorPreco(){
        Set<Livro> livrosPorPreco = new TreeSet<>(new CompareLivrosPorPreco());
        for(Map.Entry<String, Livro> livro : livroMap.entrySet()){
            livrosPorPreco.add(livro.getValue());
        }
        return livrosPorPreco;

    }

    public List<String> pesquisarLivrosPorAutor(String autor){
        List<String> livrosList = new ArrayList<>();
        for(Map.Entry<String, Livro> livro : livroMap.entrySet()){
            if(livro.getValue().getAutor().equalsIgnoreCase(autor)){
                livrosList.add(livro.getValue().getTitulo());
            }
        }
        return livrosList;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroTemp = null;
        Double valorMaior = Double.MIN_VALUE;
        for(Map.Entry<String, Livro> livro : livroMap.entrySet()){
            if(livro.getValue().getPreco() > valorMaior){
                valorMaior = livro.getValue().getPreco();
                livroTemp = livro.getValue();
            }
        }
        return livroTemp;
    }

    public Livro exibirLivroMaisBarato(){
        Livro livroTemp = null;
        Double valorMenor= Double.MAX_VALUE;
        for(Map.Entry<String, Livro> livro : livroMap.entrySet()){
            if(livro.getValue().getPreco() < valorMenor){
                valorMenor = livro.getValue().getPreco();
                livroTemp = livro.getValue();
            }
        }
        return livroTemp;
    }

    public static void main(String[] args)
    {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        livrariaOnline.adicionarLivro("link 5", "Livro 5", "Autor 5", 5.00);
        livrariaOnline.adicionarLivro("link 1", "Livro 1", "Autor 1", 1.00);
        livrariaOnline.adicionarLivro("link 3", "Livro 3", "Autor 3", 3.00);
        livrariaOnline.adicionarLivro("link 2", "Livro 2", "Autor 2", 2.00);
        livrariaOnline.adicionarLivro("link 6", "Livro 6", "Autor 6", 6.00);
        livrariaOnline.adicionarLivro("link 4", "Livro 4", "Autor 4", 4.00);

        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.exibirLivroMaisBarato());
        System.out.println(livrariaOnline.obterLivroMaisCaro());

    }
}
