package model.Enum;

public enum StatusContas {

    QUITADO("Quitado",1),
    PENDENTE("Pendente",2),
    AGUARDANDO("Aguardanto",3);

    private Integer cod;
    private String descricao;

    StatusContas(String descricao, Integer cod) {
        this.descricao = descricao;
        this.cod = cod;
    }
}
