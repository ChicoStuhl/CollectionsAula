package main.java.Set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados
{
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados()
    {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoConvite)
    {
        Convidado convidado = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidado = c;
                break;
            }
        }
        convidadoSet.remove(convidado);
    }

    public Integer contarConvidados()
    {
        return convidadoSet.size();
    }

    public void exibirConvidados()
    {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args)
    {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Convidado 1", 13265);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 13263);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 13262);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 13264);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 13265);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 13269);

        conjuntoConvidados.exibirConvidados();

        conjuntoConvidados.removerConvidadoPorCodigo(13269);

        conjuntoConvidados.exibirConvidados();



    }
}
