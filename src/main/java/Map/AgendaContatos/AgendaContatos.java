package main.java.Map.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos
{
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos()
    {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesqusisarPorNome(String nome){
        if(!agendaContatoMap.isEmpty()){
            return agendaContatoMap.get(nome);
        }
        return null;
    }

    public static void main(String[] args)
    {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Pedro", 55889658);
        agendaContatos.adicionarContato("Maria", 55889453);
        agendaContatos.adicionarContato("João", 558896123);
        agendaContatos.adicionarContato("Carla", 5544567);
        agendaContatos.adicionarContato("Francisco", 55855648);
        agendaContatos.adicionarContato("Sérgio", 558787888);


        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesqusisarPorNome("Francisco"));

        agendaContatos.removerContato("Francisco");

        agendaContatos.exibirContatos();
    }

}
