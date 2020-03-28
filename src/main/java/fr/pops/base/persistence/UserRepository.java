package fr.pops.base.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.pops.base.business.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
