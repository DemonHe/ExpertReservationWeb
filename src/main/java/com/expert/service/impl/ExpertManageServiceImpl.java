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
    public List<Expert> getAllByMajor(String major) {
        return expertDao.findAllByMajor(major);
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
    public Expert addOrUpdate(Expert e) {
        return expertDao.save(e);
    }

    @Override
    public void delete(List<Expert> experts) {
        for(int i = 0;i<experts.size();i++){
            expertDao.deleteById(experts.get(i).getId());
        }
    }
}
