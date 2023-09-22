package com.example.prueba.controller;

import com.example.prueba.model.Employee;
import com.example.prueba.model.Respuesta;
import com.example.prueba.repository.EmployeeMyBatisRepository;
import com.example.prueba.service.PruebaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/articulo")
public class PruebaController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeMyBatisRepository employeeRepository;
    @Autowired
    private PruebaService pruebaService;


    @ResponseBody
    @RequestMapping(value = "/insertar/articulos", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta health() {
        return  pruebaService.pruebaFind();
    }

}
