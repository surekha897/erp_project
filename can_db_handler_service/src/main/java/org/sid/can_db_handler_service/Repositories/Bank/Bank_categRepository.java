package org.sid.can_db_handler_service.Repositories.Bank;

import org.sid.can_db_handler_service.Entites.Bank.Bank_categ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Bank_categRepository extends JpaRepository<Bank_categ,Integer> {
}
