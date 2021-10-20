/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mbkm.hr.repositories;

import com.mbkm.hr.models.hrschemas.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author hp
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{
    Department findByManager(Integer manager);
}
