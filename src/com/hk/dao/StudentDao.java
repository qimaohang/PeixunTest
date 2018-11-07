package com.hk.dao;

import java.util.List;

import com.hk.bean.Student;

public interface StudentDao {

	List<Student> selectStudents();
}
