/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.pizza_restaurant;

/**
 *
 * @author Miguel
 */
public class Ementa {

    private String designacao;
    private String descricao;
    private int codigo;
    private String dataInicio;
    private String dataFim;
    private int numeroPizzas;
    private Pizza[] pizza;

    public Ementa(String designacao, String descricao, int codigo, String dataInicio, String dataFim, int numeroPizzas, Pizza[] pizza) {
        this.designacao = designacao;
        this.descricao = descricao;
        this.codigo = codigo;
        this.dataFim = dataFim;
        this.dataInicio = dataInicio;
        this.numeroPizzas = numeroPizzas;
        this.pizza = pizza;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public int getNumeroPizzas() {
        return numeroPizzas;
    }

    public void setNumeroPizzas(int numeroPizzas) {
        this.numeroPizzas = numeroPizzas;
    }

    public Pizza[] getPizza() {
        return pizza;
    }

    public void setPizzas(Pizza[] pizza) {
        this.pizza = pizza;
    }

}
