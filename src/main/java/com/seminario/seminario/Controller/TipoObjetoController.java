package com.seminario.seminario.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seminario.seminario.Model.TipoObjeto;
import com.seminario.seminario.Service.TipoObjetoService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tipoObjeto")
@Api(tags = "tipoObjeto")
@CrossOrigin

public class TipoObjetoController {



    @Autowired
    private TipoObjetoService tipoObjetoService;

    @PostMapping(path = "/insert")
    @ApiOperation(value = "Insert tipoObjeto", response = TipoObjeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public TipoObjeto insertTipoObjeto(@RequestBody TipoObjeto tipoObjeto) { return tipoObjetoService.saveTipoObjeto(tipoObjeto); }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Update tipoObjeto", response = TipoObjeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public TipoObjeto updateTipoObjeto(@RequestBody TipoObjeto tipoObjeto) {
        return tipoObjetoService.editTipoObjeto(tipoObjeto);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete tipoObjeto", response = TipoObjeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public void removeTipoObjeto(@RequestParam Long id) {
        tipoObjetoService.deleteTipoObjetoById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All tipoObjeto", response = TipoObjeto.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public List<TipoObjeto> getAllTipoObjeto() {
        return tipoObjetoService.getAllTipoObjeto();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get tipoObjeto by Id", response = TipoObjeto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public Optional<TipoObjeto> getByIdciuad(@RequestParam Long id) {
        return tipoObjetoService.getById(id);
    }

}
