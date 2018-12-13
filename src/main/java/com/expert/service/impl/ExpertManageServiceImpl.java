package com.expert.service.impl;

import com.expert.dao.ExpertDao;
import com.expert.model.Expert;
import com.expert.service.ExpertManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpertManageServiceImpl implements ExpertManageService {

    @Autowired
    private ExpertDao expertDao;

    @Override
    public List<Expert> getAll() {
        return expertDao.findAll();
    }

    @Override
    public List<Expert> getAllBySpecialty(String specialty) {
        return expertDao.findAllBySpecialty(specialty);
    }

    @Override
    public List<Expert> getAllBySchool(String school) {
        return expertDao.findAllBySchool(school);
    }

    @Override
    public List<Expert> getAllByNameLike(String name) {
        return expertDao.findAllByNameLike(name);
    }

    @Override
    public List<Expert> getAllByNationality(String nationality) {
        return expertDao.findAllByNationality(nationality);
    }

    @Override
    public List<Expert> getAllByPosition(String position) {
        return expertDao.findAllByPosition(position);
    }

    @Override
    public List<Expert> getAllByDetail(String name, String nationality, String speciality, String position) {
        return expertDao.findAllByDetail(name,nationality,speciality,position);
    }

    @Override
    public Expert addOrUpdate(Expert e) {
        return expertDao.save(e);
    }

    @Override
    public void delete(List<Integer> experts) {
        for(int i = 0;i<experts.size();i++){
            expertDao.deleteById(experts.get(i));
        }
    }

    @Override
    public void delete(int id) {
        expertDao.deleteById(id);
    }

    @Override
    public Expert getById(int id) {
        return expertDao.findById(id);
    }
}
