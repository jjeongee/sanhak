package com.project.sanhak.lounge.repository;

import com.project.sanhak.domain.lounge.Lounges;
import com.project.sanhak.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoungeRepository extends JpaRepository<Lounges, Integer> {
    Lounges findByLUid(User user);
}