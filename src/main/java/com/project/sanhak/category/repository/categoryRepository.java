package com.project.sanhak.category.repository;

import com.project.sanhak.domain.skil.code.CodeSkil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface categoryRepository extends JpaRepository<CodeSkil, Integer> {
    List<CodeSkil> findByCSNameIn(List<String> names);

    CodeSkil getCodeSkilByCSName(String name);
}