package main.java.Set.GerenciadorAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>
{
    private String nome;
    private double nota;
    private long matricula;

    public Aluno(String nome, double nota, long matricula)
    {
        this.nome = nome;
        this.nota = nota;
        this.matricula = matricula;
    }

    public String getNome()
    {
        return nome;
    }

    public double getNota()
    {
        return nota;
    }

    public long getMatricula()
    {
        return matricula;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Aluno aluno)) return false;
        return Double.compare(aluno.getNota(), getNota()) == 0 && getMatricula() == aluno.getMatricula() && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getNome(), getNota(), getMatricula());
    }

    @Override
    public String toString()
    {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                ", matricula=" + matricula +
                '}';
    }

    @Override
    public int compareTo(Aluno aluno)
    {
        return nome.compareToIgnoreCase(aluno.getNome());
    }
}

class ComparePorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno, Aluno aluno2)
    {
        return Double.compare(aluno.getNota(), aluno2.getNota());
    }
}

class ComparePorMatricula implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno, Aluno aluno2)
    {
        return Long.compare(aluno.getMatricula(), aluno2.getMatricula());
    }
}
