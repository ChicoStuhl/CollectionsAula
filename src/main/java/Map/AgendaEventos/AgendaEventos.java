package main.java.Map.AgendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos
{
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos(){
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> agendaOrdenada = new TreeMap<>(agendaMap);

        System.out.println(agendaOrdenada);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        for(Map.Entry<LocalDate, Evento> entry : agendaMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println(entry.getKey() + " = " + entry.getValue());
                break;
            }
        }
    }


}
