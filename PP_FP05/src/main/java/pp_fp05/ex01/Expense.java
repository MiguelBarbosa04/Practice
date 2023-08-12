/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.ex01;

/**
 *
 * @author Miguel
 */
public class Expense {

    private static int nextId = 1;
    private int id;
    private String tipo;
    private double valorGasto;
    private String dataDespesa;

    public Expense(int id, String tipo, double valorGasto, String dataDespesa) {
        this.id = id;
        this.tipo = tipo;
        this.valorGasto = valorGasto;
        this.dataDespesa = dataDespesa;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public String getDataDespesa() {
        return dataDespesa;
    }
 
}
