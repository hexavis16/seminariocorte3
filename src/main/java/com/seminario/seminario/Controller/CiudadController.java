package com.seminario.seminario.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seminario.seminario.Model.Ciudad;
import com.seminario.seminario.Service.CiudadService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ciudad")
@Api(tags = "ciudad")
@CrossOrigin

public class CiudadController {



    @Autowired
    private CiudadService ciudadService;

    @PostMapping(path = "/insert")
    @ApiOperation(value = "Insert ciudad", response = Ciudad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Ciudad insertCiudad(@RequestBody Ciudad ciudad) { return ciudadService.saveCiudad(ciudad); }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Update ciudad", response = Ciudad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Ciudad updateCiudad(@RequestBody Ciudad ciudad) {
        return ciudadService.editCiudad(ciudad);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete ciudad", response = Ciudad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public void removeCiudad(@RequestParam Long id) {
        ciudadService.deleteCiudadById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All ciudad", response = Ciudad.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public List<Ciudad> getAllCiudad() {
        return ciudadService.getAllCiudad();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get Ciudad by Id", response = Ciudad.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Objeto doesn't exist") })
    public Optional<Ciudad> getByIdciuad(@RequestParam Long id) {
        return ciudadService.getById(id);
    }

}
