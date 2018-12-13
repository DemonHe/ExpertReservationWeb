package com.expert.controller;

import com.expert.model.Expert;
import com.expert.service.ExpertManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/expert")
public class ExpertController {

    @Autowired
    private ExpertManageService expertManageService;

    @RequestMapping(value="/getAll")
    public List getAll(){
        return expertManageService.getAll();
    }

    @RequestMapping(value="/searchByName")
    public List getAllByName(@RequestParam("name") String name){
        return expertManageService.getAllByNameLike(name);
    }

    @RequestMapping(value="/searchBySchool")
    public List getAllBySchool(@RequestParam("school") String school){
        return expertManageService.getAllBySchool(school);
    }

    @RequestMapping(value="/searchBySpecialty")
    public List getAllBySpecialty(@RequestParam("specialty") String specialty){
        return expertManageService.getAllBySpecialty(specialty);
    }

    @RequestMapping(value="/searchByNationality")
    public List getAllByNationality(@RequestParam("nationality") String nationality){
        return expertManageService.getAllByNationality(nationality);
    }

    @RequestMapping(value="/searchByPosition")
    public List getAllByPosition(@RequestParam("position") String position){
        return expertManageService.getAllByPosition(position);
    }

    @RequestMapping(value="/search")
    public List search(@RequestParam("name") String name,@RequestParam("nationality") String nationality,
                            @RequestParam("speciality") String speciality,@RequestParam("position") String position){
        return expertManageService.getAllByDetail(name,nationality,speciality,position);
    }

    @RequestMapping(value="/getDetail")
    public Expert getDetail(@RequestParam("id") int id){
        return expertManageService.getById(id);
    }

    @RequestMapping(value="/add")
    public Expert addExpert(@RequestBody Expert expert){
        return expertManageService.addOrUpdate(expert);
    }

    @RequestMapping(value="/delete")
    public void deleteExpert(@RequestParam("id") int id){
         expertManageService.delete(id);
    }

    @RequestMapping(value="/deleteSome")
    public void deleteExpert(@RequestBody List<Integer> eids){
        expertManageService.delete(eids);
    }

    @RequestMapping(value="/modify")
    public Expert deleteExpert(@RequestBody Expert expert){
        return expertManageService.addOrUpdate(expert);
    }

}
