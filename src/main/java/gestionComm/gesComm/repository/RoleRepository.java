package gestionComm.gesComm.repository;

import gestionComm.gesComm.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<RoleModel,Long> {
}
