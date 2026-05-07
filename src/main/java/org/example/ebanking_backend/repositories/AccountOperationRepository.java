package org.example.ebanking_backend.repositories;

import org.example.ebanking_backend.entities.AccountOperation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountOperationRepository extends JpaRepository<AccountOperation,Long > {
}
