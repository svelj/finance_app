package model;

import jakarta.persistence.*;
import lombok.Data;
import model.enumerations.Type;

import java.util.Date;

@Data
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date date;

    @ManyToOne
    private Account account;

    private String description;

    private double amount;

    private String category;

    @Enumerated(value = EnumType.STRING)
    private Type type;

    public Transaction() {
    }

    public Transaction(Integer id,Account account, Date date, String description, double amount, String category, Type type) {
        this.id = id;
        this.account = account;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.type = type;
    }
}
