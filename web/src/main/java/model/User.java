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

    @OneToMany(mappedBy = "user")
    private List<Account> accounts;

    public User(){

    }

    public User(Integer id, String name, String surname, List<Account> accounts ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.accounts = accounts;
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

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
