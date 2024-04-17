package model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Account {

    @Id
    private Integer id;

    private String nameOfAccount;

    private Integer sumOfAccount;

    public Account() {
    }

    public Account(Integer id, String nameOfAccount, Integer sumOfAccount) {
        this.id = id;
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
