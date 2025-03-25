package org.sid.can_db_handler_service.Entites.Bank;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_bank_account")
public class Bank_account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  rowid;
    private Date datec;
    private Date tms;
    private String ref;
    private String label;
    private int  entity;
    private String bank;
    private String code_banque;
    private String code_guichet;
    private String number;
    private String cle_rib;
    private String bic;
    private String iban_prefix;
    private String country_iban;
    private String cle_iban;
    private String domiciliation;
    /*foring key a faire
    fk_departement		int(11)
    fk_pays			int(11)
     */
    private String proprio;
    private String adresse_proprio;
    private int courant;
    private int clos;
    private int rappro;
    private String url;
    private String account_number;
    private String currency_code;
    private int min_allowed;
    private int min_desired;
    private String comment;
}
