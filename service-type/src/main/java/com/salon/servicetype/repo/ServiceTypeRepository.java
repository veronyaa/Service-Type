package com.salon.servicetype.repo;

import com.salon.servicetype.repo.model.ServiceType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceTypeRepository extends JpaRepository<ServiceType,Long> {
}
