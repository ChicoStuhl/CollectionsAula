package main.java.list.CatalogoLivros;

public class Livro
{
    private String nome;
    private String autor;
    private Integer anoPublicacao;

    public Livro(String nome, String autor, Integer anoPublicacao)
    {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNome()
    {
        return nome;
    }

    public String getAutor()
    {
        return autor;
    }

    public Integer getAnoPublicacao()
    {
        return anoPublicacao;
    }

    @Override
    public String toString()
    {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                "}\n";
    }
}
