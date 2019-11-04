package com.seminario.seminario.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seminario.seminario.Model.Pais;
import com.seminario.seminario.Service.PaisService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pais")
@Api(tags = "pais")
@CrossOrigin

public class PaisController {

    @Autowired
    private PaisService paisService;

    @PostMapping(path = "/insert")
    @ApiOperation(value = "Insert pais", response = Pais.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Pais insertPais(@RequestBody Pais pais) { return paisService.savePais(pais); }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Update pais", response = Pais.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Pais updatePais(@RequestBody Pais pais) {
        return paisService.editPais(pais);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete pais", response = Pais.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public void removePais(@RequestParam Long id) {
        paisService.deletePaisById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All pais", response = Pais.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public List<Pais> getAllPais() {
        return paisService.getAllPais();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get Pais by Id", response = Pais.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public Optional<Pais> getByIdPais(@RequestParam Long id) {
        return paisService.getById(id);
    }


}
