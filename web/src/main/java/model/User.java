package model;


import jakarta.persistence.*;
import jakarta.transaction.Transaction;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;

    private Account account;

    private List<Transaction> transaction;

    public User(){

    }


    public User(Integer id, String name, String surname, Account account, List<Transaction> funds) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.account = account;
        this.transaction = funds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Transaction> getTransaction() {
        return transaction;
    }

    public void setTransaction(List<Transaction> transaction) {
        this.transaction = transaction;
    }
}
