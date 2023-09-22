package com.example.prueba.repository;


import com.example.prueba.model.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

@Mapper
public interface EmployeeMyBatisRepository {

    @Select("select * from articulo")
    public List<Map> findAll();

    @Select("SELECT * FROM employees WHERE id = #{id}")
    public Employee findById(Integer id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int deleteById(Integer id);

    @Insert("INSERT INTO employees(id, nombre, apellido, email) " +
            " VALUES (#{id}, #{nombre}, #{apellido}, #{email})")
    public int insert(Employee employee);

    @Update("Update employees set nombre=#{nombre}, " +
            " apellido=#{apellido}, email=#{email} where id=#{id}")
    public int update(Employee employee);

}
