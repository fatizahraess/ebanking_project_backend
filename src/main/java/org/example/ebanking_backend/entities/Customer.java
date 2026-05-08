package org.example.ebanking_backend.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.websocket.OnError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Entity//pour le mapping objet relationnel
@Data //GETTERS ET SETTERS
@NoArgsConstructor @AllArgsConstructor // CONSTRUCTEURS AVEC ET SANS ARGS
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
@OneToMany(mappedBy = "customer")//si on fait pas mapped by jpa va creer 2 cles etrangeres
@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)

    private List<BankAccount> bankaccount;//car un customer a plsrs comptes
}
