package org.sid.can_db_handler_service.Entities.Marketing;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="can_mailing")
public class Mailing implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rowid;
    private int statut;
    private String titre;
    private int entity;
    private String sujet;
    private String body;
    private String bgcolor;
    private String bgimage;
    private String cible;
    private int nbemail;
    private String email_from;
    private String email_replyto;
    private String email_errorsto;
    private Date date_creat;
    private Date dae_valide;
    private Date date_appro;
    private Date date_envoi;
    /*foring key a faire
    fk_user_creat		int(11)
    fk_user_vaild		int(11)
    fk_user_appro		int(11)
     */
    private String joined_file1;
    private String joined_file2;
    private String joined_file3;
    private String joined_file4;
    @OneToMany(mappedBy = "mailing" , fetch = FetchType.LAZY)
    private Set<Mailing_cibles> mailing_cibles;
}
