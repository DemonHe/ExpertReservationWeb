package com.service.service.impl;

import com.service.dao.ServiceDao;
import com.service.model.Result;
import com.service.model.Service;
import com.service.service.ServiceManageService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceManageServiceImpl implements ServiceManageService {
    @Autowired
    ServiceDao serviceDao;

    @Override
    public Result addService(Service service) {
        Result re = new Result();
        try {
            serviceDao.save(service);
            re.setSuccess(true);
            re.setMessage("添加成功！");
            re.setData(null);
        }catch (Exception e){
            re.setSuccess(false);
            re.setMessage("添加失败！");
            re.setData(null);
        }
        return re;
    }
}
