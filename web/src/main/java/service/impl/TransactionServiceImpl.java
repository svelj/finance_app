package service.impl;

import model.Account;
import model.Transaction;
import model.enumerations.Type;
import service.AccountService;
import service.TransactionService;

import java.util.List;

public class TransactionServiceImpl implements TransactionService {

    private final TransactionService transactionService;
    private final AccountService accountService;

    public TransactionServiceImpl(TransactionService transactionService, AccountService accountService) {
        this.transactionService = transactionService;
        this.accountService = accountService;
    }

    @Override
    public Transaction create(Account account, double amount, String description, Type type, String category) {
        return null;
    }

    @Override
    public Transaction update(String description, String category, double amount) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Transaction> listTransactions() {
        return null;
    }
}
