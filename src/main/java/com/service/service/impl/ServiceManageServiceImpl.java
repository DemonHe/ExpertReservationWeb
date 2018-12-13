package com.service.service.impl;

import com.service.dao.ServiceDao;
import com.service.model.Service;
import com.service.service.ServiceManageService;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceManageServiceImpl implements ServiceManageService {
    @Autowired
    ServiceDao serviceDao;

    @Override
    public Service addService(Service service) {
        return serviceDao.save(service);
    }
}
