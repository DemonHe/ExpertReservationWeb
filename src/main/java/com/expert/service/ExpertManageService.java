package com.expert.service;

import com.expert.model.Expert;

import java.util.List;

public interface ExpertManageService {

    public List<Expert> getAll();

    public List<Expert> getAllByMajor(String major);

    public List<Expert> getAllBySchool(String school);

    public List<Expert> getAllByNameLike(String name);

    public Expert addOrUpdate(Expert e);

    public void delete(List<Expert> experts);

}
