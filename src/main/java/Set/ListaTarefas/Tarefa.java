package main.java.Set.ListaTarefas;

import java.util.Objects;

public class Tarefa
{
    private String descricao;
    private Boolean estado = false;

    public Tarefa(String descricao)
    {
        this.descricao = descricao;
    }

    public String getDescricao()
    {
        return descricao;
    }

    public void setEstado(Boolean estado)
    {
        this.estado = estado;
    }

    public Boolean getEstado()
    {
        return estado;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao()) && Objects.equals(getEstado(), tarefa.getEstado());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getDescricao(), getEstado());
    }

    @Override
    public String toString()
    {
        if(estado) {
            return "Tarefa{" +
                    "descricao='" + descricao + '\'' +
                    "Tarefa concluida!"+
                    '}';
        } else {
            return "Tarefa{" +
                    "descricao='" + descricao + '\'' +
                    "Tarefa não concluida!" +
                    '}';
        }
    }
}
