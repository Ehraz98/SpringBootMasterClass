package com.dailycode.SpringBoot.Tutorial.service;

import com.dailycode.SpringBoot.Tutorial.entity.Department;
import com.dailycode.SpringBoot.Tutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId,Department department);

    public Department fetchDepartmentByName(String departmentName);
}
