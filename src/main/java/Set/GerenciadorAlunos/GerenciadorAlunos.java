package main.java.Set.GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos
{
    Set<Aluno> alunoSet;

    public GerenciadorAlunos()
    {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota){
        alunoSet.add(new Aluno(nome, nota, matricula));
    }

    public Set<Aluno> exibirAlunoPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparePorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }
    public Set<Aluno> exibirAlunoPorMatricula(){
        Set<Aluno> alunosPorMatricula = new TreeSet<>(new ComparePorMatricula());
        alunosPorMatricula.addAll(alunoSet);
        return alunosPorMatricula;
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }

    public static void main(String[] args)
    {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Pedro", 124578, 8.0);
        gerenciadorAlunos.adicionarAluno("André", 122578, 5.0);
        gerenciadorAlunos.adicionarAluno("AAron", 124278, 3.0);
        gerenciadorAlunos.adicionarAluno("Camila", 224578, 9.0);
        gerenciadorAlunos.adicionarAluno("Maria", 124528, 10.0);
        gerenciadorAlunos.adicionarAluno("Kelly", 124572, 7.5);
        gerenciadorAlunos.adicionarAluno("José", 124538, 8.5);

        System.out.println(gerenciadorAlunos.exibirAlunoPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunoPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunoPorMatricula());
        gerenciadorAlunos.exibirAlunos();

    }
}
