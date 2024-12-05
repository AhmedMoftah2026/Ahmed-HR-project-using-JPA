package com.ahmed.hr.reposatory;

import com.ahmed.hr.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {


    @Override
    @Transactional(readOnly = false)
    List<User> findAll();


}
