package model;

import java.util.ArrayList;
import java.util.List;

public class Universidade {
    private Integer id;
    private String nome;
    private Integer cnpj;
    private List<Aluno> alunos = new ArrayList<Aluno>();

    public Universidade() {
    }

    public Universidade(Integer id, String nome, Integer cnpj){
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
