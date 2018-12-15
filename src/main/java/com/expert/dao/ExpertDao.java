package com.expert.dao;

import com.expert.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface ExpertDao extends JpaRepository<Expert, Integer> {
    public Expert findById(int id);

    @Query(value = "select distinct e from Expert e")
    public List<Expert> findAll();

    public List<Expert> findAllBySchool(String school);

    public List<Expert> findAllBySpecialty(String speciality);

    public List<Expert> findAllByNationality(String nationality);

    public List<Expert> findAllByPosition(String position);

    @Query(value = "select e from Expert e where e.name like %?1%")
    public List<Expert> findAllByNameLike(String name);

    @Query(value = "select e from Expert e where e.name like %?1% and e.nationality = ?2 and e.specialty = ?3 and e.position = ?4")
    public List<Expert> findAllByDetail(String name,String nationality, String speciality,String position);

    public Expert save(Expert e);

    public void deleteById(int id);
}
