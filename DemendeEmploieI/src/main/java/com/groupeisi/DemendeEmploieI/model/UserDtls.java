package com.groupeisi.DemendeEmploieI.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
@Entity
public class UserDtls {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private String Age;
    private String email;
    private  String address;
    private String telephone;
    private String specialite;
    private String niveauEtude;
    private String experienceProfessionnelle;
    private String password;

    private String role;
}
