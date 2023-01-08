package com.BorrowRecordService.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    private  Long barcodeNumber;
    private  String name;
    private  String author;
    private  Integer pageNumber;
}
