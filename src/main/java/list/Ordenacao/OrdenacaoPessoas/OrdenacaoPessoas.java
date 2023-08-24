package main.java.list.Ordenacao.OrdenacaoPessoas;

import java.util.*;

public class OrdenacaoPessoas
{
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoas()
    {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, Integer idade, Double altura){
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparePorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args)
    {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Maria", 23, 1.56);
        ordenacaoPessoas.adicionarPessoa("João", 26, 1.66);
        ordenacaoPessoas.adicionarPessoa("Pedro", 10, 1.76);
        ordenacaoPessoas.adicionarPessoa("Carla", 32, 1.86);
        ordenacaoPessoas.adicionarPessoa("Luciana", 20, 1.96);


        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.ordenarPorAltura());



    }
}

class ComparePorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa, Pessoa pessoa2)
    {
        return Double.compare(pessoa.getAltura(), pessoa2.getAltura());
    }
}
