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
public class User {

    private static int nextId = 1;
    protected final int Despesas_Size = 31;
    private int id;
    private String nome;
    private String email;
    private String data_de_nascimento;
    private Expense[] despesas;
    private int numExpenses;

    public User(String nome, String email, String data_de_nascimento) {
        this.id = nextId++;
        this.nome = nome;
        this.email = email;
        this.data_de_nascimento = data_de_nascimento;
        this.despesas = new Expense[10];
        this.numExpenses = 0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataDeNascimento() {
        return data_de_nascimento;
    }

    public Expense[] getExpenses() {
        return despesas;
    }

    public void addExpense(Expense expense) {
        if (numExpenses < despesas.length) {
            despesas[numExpenses] = expense;
            numExpenses++;
        } else {
            System.out.println("Máximo atingido.");
        }
    }
}
