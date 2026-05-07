package org.example.ebanking_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.ebanking_backend.enums.AccountStatus;

import java.util.Date;
import java.util.List;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE )//CETTE CLASSE POSSEDE LHERITAGE
@DiscriminatorColumn(name = "TYPE",length = 4)//TYPE PAR DEFAUT EST STRING
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class BankAccount {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    @Enumerated(EnumType.STRING)
    private AccountStatus status;
    private String currency;
    @ManyToOne
    private Customer customer;//compte appartient a un client
   @OneToMany(mappedBy = "bankAccount" )
    private List<AccountOperation> accountOperations;
}
