package model;

import model.Enum.StatusContas;

import java.math.BigDecimal;
import java.util.Date;

public class ContasAReceber {

    private Integer id;
    private Aluno aluno;
    private Date dataVencimento;
    private BigDecimal valorAReceber;
    private StatusContas statusConta;

    public ContasAReceber() {
    }

    public ContasAReceber(Integer id, Aluno aluno, Date dataVencimento, BigDecimal valorAReceber, StatusContas statusConta) {
        this.id = id;
        this.aluno = aluno;
        this.dataVencimento = dataVencimento;
        this.valorAReceber = valorAReceber;
        this.statusConta = statusConta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValorAReceber() {
        return valorAReceber;
    }

    public void setValorAReceber(BigDecimal valorAReceber) {
        this.valorAReceber = valorAReceber;
    }

    public StatusContas getStatusConta() {
        return statusConta;
    }

    public void setStatusConta(StatusContas statusConta) {
        this.statusConta = statusConta;
    }
}
