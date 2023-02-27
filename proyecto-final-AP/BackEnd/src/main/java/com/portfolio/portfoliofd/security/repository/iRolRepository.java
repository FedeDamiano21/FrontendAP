
package com.portfolio.portfoliofd.security.repository;

import com.portfolio.portfoliofd.security.entity.Rol;
import com.portfolio.portfoliofd.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
