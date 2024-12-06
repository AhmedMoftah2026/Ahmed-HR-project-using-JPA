package com.ahmed.hr.reposatory;

import com.ahmed.hr.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName (String name);

}