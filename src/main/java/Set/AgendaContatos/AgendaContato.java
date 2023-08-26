package main.java.Set.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato
{
    private Set<Contato> contatoSet;
    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaContatoPorNome(String nome){
        Set<Contato> contatosTemp = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosTemp.add(c);
            }
        }
        return contatosTemp;
    }

    public Contato atualizarContato(String nome, int numero)
    {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(numero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
