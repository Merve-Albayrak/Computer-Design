package com.BorrowRecordService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data

@AllArgsConstructor
@NoArgsConstructor

public class BorrowRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    @OneToOne(fetch = FetchType.LAZY)



    private Borrower borrowerId;

    @OneToOne(fetch = FetchType.LAZY)


    private  Book bookId;

    private String borrowingDate;

    private  String deliveryDate;


}
