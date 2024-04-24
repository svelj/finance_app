package model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private User user;

    private String nameOfAccount;

    private Integer sumOfAccount;

    public Account() {
    }

    public Account(Integer id,User user, String nameOfAccount, Integer sumOfAccount) {
        this.id = id;
        this.user = user;
        this.nameOfAccount = nameOfAccount;
        this.sumOfAccount = sumOfAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfAccount() {
        return nameOfAccount;
    }

    public void setNameOfAccount(String nameOfAccount) {
        this.nameOfAccount = nameOfAccount;
    }

    public Integer getSumOfAccount() {
        return sumOfAccount;
    }

    public void setSumOfAccount(Integer sumOfAccount) {
        this.sumOfAccount = sumOfAccount;
    }
}
