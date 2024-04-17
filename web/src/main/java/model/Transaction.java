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

    private String description;

    private double amount;

    private Category category;

    @Enumerated(value = EnumType.STRING)
    private Type type;

    public Transaction() {
    }

    public Transaction(Integer id, Date date, String description, double amount, Category category, Type type) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.amount = amount;
        this.category = category;
        this.type = type;
    }
}
