package com.expert.service;

import com.expert.model.Expert;

import java.util.List;

public interface ExpertManageService {

    public List<Expert> getAll();

    public List<Expert> getAllBySpecialty(String specialty);

    public List<Expert> getAllBySchool(String school);

    public List<Expert> getAllByNameLike(String name);

    public List<Expert> getAllByNationality(String nationality);

    public List<Expert> getAllByPosition(String position);

    public List<Expert> getAllByDetail(String name,String nationality, String speciality,String position);

    public Expert addOrUpdate(Expert e);

    public void delete(List<Integer> experts);

    public void delete(int id);

    public Expert getById(int id);

}
