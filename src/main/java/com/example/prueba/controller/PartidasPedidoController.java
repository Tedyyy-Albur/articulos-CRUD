package com.example.prueba.controller;

import com.example.prueba.model.ImprimirModel;
import com.example.prueba.model.PartidasPedidoModel;
import com.example.prueba.model.Respuesta;
import com.example.prueba.service.PartidasPedidoService;
import jakarta.servlet.http.HttpServletResponse;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/partidas-pedido")
public class PartidasPedidoController {
    @Autowired
    private PartidasPedidoService partidasPedidoService;
    @ResponseBody
    @RequestMapping(value = "/guardar", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Respuesta guardarPedido(@RequestBody PartidasPedidoModel partidasPedidoModel) {
        return  partidasPedidoService.insertarPedido(partidasPedidoModel);
    }
    @ResponseBody
    @RequestMapping(value = "/obtener", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ImprimirModel> mostrarPedidos(@RequestParam Integer id) {
        return partidasPedidoService.imprimirPedido(id);
    }
    @ResponseBody
    @RequestMapping(value = "/imprimir", method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> getDocument(@RequestParam Integer id, HttpServletResponse response) throws IOException, JRException {

        List<ImprimirModel> empleadosList = partidasPedidoService.imprimirPedido(id);

        File file = ResourceUtils.getFile("classpath:Blank_A4.jrxml");
        JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(empleadosList);
        JasperReport jasperReport = null;
        JasperDesign jasperDesign = null;
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("nombreCliente", empleadosList.get(0).getNombreCliente());
        parameters.put("total", 20.0);


        // String path = getServletContext().getRealPath("/WEB-INF/");
        jasperDesign = JRXmlLoader.load(file);
        jasperReport = JasperCompileManager.compileReport(jasperDesign);
        byte[] byteStream = JasperRunManager.runReportToPdf(jasperReport, parameters, ds);
        String base64 = Base64.getEncoder().encodeToString(byteStream);
        Map<String, String> responses = new HashMap<>();
        responses.put("base64", base64);
        return responses;
    }
}
