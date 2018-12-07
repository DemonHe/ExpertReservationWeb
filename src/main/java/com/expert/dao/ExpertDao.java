package com.expert.dao;

import com.expert.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExpertDao extends JpaRepository<Expert, Integer> {
    public Expert findById(int id);

    @Query(value = "select distinct e from Expert e")
    public List<Expert> findAll();

    public List<Expert> findAllBySchool(String school);

    public List<Expert> findAllByMajor(String major);

    @Query(value = "select e from Expert e where e.name like %?1%")
    public List<Expert> findAllByNameLike(String name);

    public Expert save(Expert e);

    public void deleteById(int id);
}
