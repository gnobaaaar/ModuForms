package com.modu.ModuForm.app.domain.surbay;

import com.modu.ModuForm.app.domain.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    List<Survey> findSurveysByUser(User user);
    List<Survey> findAllByOrderByCreatedDateDesc();
    Page<Survey> findAllByOrderByCreatedDateDesc(Pageable pageable);
}
