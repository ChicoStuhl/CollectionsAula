package main.java.Map.LivrariaOnline;

import java.util.Comparator;

public class Livro
{
    private String titulo;
    private Double preco;
    private String autor;

    public Livro(String titulo, Double preco, String autor)
    {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public Double getPreco()
    {
        return preco;
    }

    public String getAutor()
    {
        return autor;
    }

    @Override
    public String toString()
    {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", preco=" + preco +
                ", autor='" + autor + '\'' +
                '}';
    }
}

class CompareLivrosPorPreco implements Comparator<Livro>
{

    @Override
    public int compare(Livro livro, Livro livro2)
    {
        return Double.compare(livro.getPreco(), livro2.getPreco());
    }
}
