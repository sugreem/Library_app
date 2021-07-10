package com.example.gfg.libraryapp.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Student {


    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private  int id;

    @Column(name = "my_email", unique = true, nullable = false )
    private  String email;
    private int age;
    private String name;

    @OneToMany(mappedBy = "student")
    private List<Book> books;

    @OneToMany(mappedBy = "my_student")
    private List<Transaction> transactions;

    @CreationTimestamp
    private Date createdOn;
}
