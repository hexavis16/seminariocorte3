package com.seminario.seminario.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seminario.seminario.Model.Objeto;
import com.seminario.seminario.Service.ObjetoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/objeto")
@Api(tags = "objeto")
@CrossOrigin

public class ObjetoController {

    @Autowired
    private ObjetoService objetoService;

    @PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Objeto", response = Objeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Objeto insertObjeto(@RequestBody Objeto objeto) {
        return objetoService.saveObjeto(objeto);
    }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Update Objeto", response = Objeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Objeto updateObjeto(@RequestBody Objeto objeto) {
        return objetoService.editObjeto(objeto);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete Objeto", response = Objeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public void removeObjeto(@RequestParam Long id) {
        objetoService.deleteObjetoById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All Objeto", response = Objeto.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public List<Objeto> getAllObjeto() {
        return objetoService.getAllObjeto();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get Objeto by Id", response = Objeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public Optional<Objeto> getByIdObjeto(@RequestParam Long id) {
        return objetoService.getById(id);
    }
}
