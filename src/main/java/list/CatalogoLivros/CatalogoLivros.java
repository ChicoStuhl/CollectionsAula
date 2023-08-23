package main.java.list.CatalogoLivros;
import java.util.ArrayList;
import java.util.List;
public class CatalogoLivros
{
    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String nome, String autor, int anoPublicacao){
        livrosList.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> listaTemp = new ArrayList<>();
        for(Livro l:livrosList){
            if(l.getAutor().equalsIgnoreCase(autor)){
                listaTemp.add(l);
            }
        }
        return listaTemp;
    }

    public List<Livro> pesquisarPorIntervaloAnos(Integer anoInicio, Integer anoFim){
        List<Livro> listaTemp = new ArrayList<>();
        for(Livro l:livrosList){
            if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim){
                listaTemp.add(l);
            }
        }
        return listaTemp;
    }

    public Livro pesquisarPorTitulo(String nome){
        Livro livroTemp = null;
        for(Livro l:livrosList){
            if(l.getNome().equalsIgnoreCase(nome)){
                livroTemp = l;
                break;
            }
        }
        return livroTemp;
    }

    public void exibirLivros(){
        System.out.println(livrosList);
    }

    public static void main(String[] args)
    {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1927);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1937);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 1997);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1987);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 1967);

        catalogoLivros.exibirLivros();

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1930, 1980));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 4"));

    }


}
