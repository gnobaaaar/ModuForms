package com.modu.ModuForm.app.domain.user.acess;

import com.modu.ModuForm.app.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccessRepository extends JpaRepository<Access, Long> {
    Optional<Access> findByUsers(User user);
    Optional<Access> findByUserId(String userId);
    void deleteByUsers(User user);
}
