/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp05.expenses;

/**
 *
 * @author Miguel
 */
public class ExpensesDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    final int MAX_USERS = 10;
    final int MAX_EXPENSES_PER_USER = 10;

    User[] users = new User[MAX_USERS];

    User user1 = new User("Miguel", "miguel@gmail.com", "2002-06-04");
    Expense despesa1 = new Expense(1, "alimentar", 10.10, "2020-01-03");
    Expense despesa2 = new Expense(2, "automóvel", 32.45, "2020-02-05");

    user1.addExpense(despesa1);
    user1.addExpense(despesa2);
    users[0] = user1;

    User user2 = new User("João", "joão@gmail.com", "2002-10-04");
    user2.addExpense(despesa1);
    user2.addExpense(despesa2);
    users[1] = user2;

    for (int i = 0; i < users.length; i++) {
        User user = users[i];
        if (user != null) {
        System.out.println("User ID: " + user.getId());
        System.out.println("User Name: " + user.getName());
        System.out.println("User Email: " + user.getEmail());
        System.out.println("User Data de Nascimento: " + user.getDataDeNascimento());
        
        Expense[] userExpenses = user.getExpenses();
        for (int j = 0; j < userExpenses.length; j++) {
            Expense expense = userExpenses[j];
            if (expense != null) {
                System.out.println("--------------------------");
                System.out.println("Expense ID: " + expense.getId());
                System.out.println("Expense Type: " + expense.getTipo());
                System.out.println("Expense Value: " + expense.getValorGasto());
                System.out.println("Expense Date: " + expense.getDataDespesa());
                System.out.println("--------------------------");
            }
        }
        System.out.println("==============================");
    }
}
}

}
