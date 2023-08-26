package main.java.Set.AgendaContatos;

import java.util.Objects;

public class Contato
{
    private String nome;
    private int numero;

    public Contato(String nome, int numero)
    {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome()
    {
        return nome;
    }

    public int getNumero()
    {
        return numero;
    }

    public void setNumero(int numero)
    {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return getNumero() == contato.getNumero() && Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getNome(), getNumero());
    }

    @Override
    public String toString()
    {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }


}
