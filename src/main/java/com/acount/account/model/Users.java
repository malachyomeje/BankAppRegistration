package com.acount.account.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNo;
    @OneToOne( cascade=CascadeType.ALL)
 @JoinColumn
private Account account;

}
