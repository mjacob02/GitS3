package fr.insa.jacob.projets3.repository;

import fr.insa.jacob.projets3.entity.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface OperationRepository extends JpaRepository<Operation, Integer>, JpaSpecificationExecutor<Operation> {

}