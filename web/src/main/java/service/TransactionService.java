package service;

import model.Account;
import model.Transaction;
import model.enumerations.Type;

import java.util.List;

public interface TransactionService {

    Transaction create(Account account,double amount, String description, Type type, String category);

    Transaction update(String description,String category, double amount);

    void delete(Integer id);

    List<Transaction> listTransactions();
}
