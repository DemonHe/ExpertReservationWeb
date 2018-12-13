package com.service.dao;

import com.service.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceDao extends JpaRepository<Service, Integer> {

    public Service save(Service service);

}
