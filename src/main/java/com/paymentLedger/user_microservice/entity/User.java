package com.paymentLedger.user_microservice.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "App_user")
 //schema = "public")

public class User {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String name;

    private String password;

    @Column(unique = true)
    private String email;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }
}


