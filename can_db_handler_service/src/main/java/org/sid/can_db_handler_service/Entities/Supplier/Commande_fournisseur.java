package org.sid.can_db_handler_service.Entities.Supplier;
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
@Table(name="can_commande_fournisseur")

public class Commande_fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private Date tms;
    /*foring key a faire
    fk_soc			int(11)
     */
    private String ref;
    private int entity;
    private String ref_supplier;
    /*foring key a faire
    fk_projet		int(11)
    fk_creation		datetime
     */
    private Date date_valid;
    private Date date_cloture;
    private Date date_commande;
    /*foring key a faire
    fk_user_author		int(11)
    fk_user_valid		int(11)
    fk_user_cloture		int(11)
     */
    private int source;
    /*foring key a faire
    fk_statut		smallint(6)
     */
    private double amount_ht;
    private double remise_percent;
    private double remise;
    private double tva;
    private double localtax1;
    private double localtax2;
    private double total_ht;
    private double total_ttc;
    private String note;
    private String note_public;
    private String model_pdf;
    /*foring key a faire
    fk_methode_commande	int(11)
     */
}
