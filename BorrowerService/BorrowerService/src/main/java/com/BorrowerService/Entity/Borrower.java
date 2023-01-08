package com.BorrowerService.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Borrower")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Borrower {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  Long tcNumber;
    private String name;
    private  String surname;
    private String birthDate;


}
