package com.example.prueba.service;

import com.example.prueba.model.Employee;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.EmployeeMyBatisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("pruebaService")
public class PruebaService {
    @Autowired
    EmployeeMyBatisRepository employeeMyBatisRepository;

    public Respuesta pruebaFind(){

        List<Map> employee =  employeeMyBatisRepository.findAll();

        return new Respuesta(1,"Ejecutado", "exito", employee);
    }
}
