package com.seminario.seminario.Controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.seminario.seminario.Model.Personas;
import com.seminario.seminario.Service.PersonasService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas")
@Api(tags = "personas")
@CrossOrigin

public class PersonasController {

    @Autowired
    private PersonasService personasService;

    @PostMapping(path = "/insert")
    @ApiOperation(value = "Insert Personas", response = Personas.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Personas insertPersonas(@RequestBody Personas personas) {
        return personasService.savePersonas(personas);
    }

    @PutMapping(path = "/update")
    @ApiOperation(value = "Update Personas", response = Personas.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied") })
    public Personas updatePersonas(@RequestBody Personas personas) {
        return personasService.editPersonas(personas);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "Delete Personas", response = Personas.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Personas doesn't exist") })
    public void removePersonas(@RequestParam Long id) {
        personasService.deletePersonasById(id);
    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "Get All Personas", response = Personas.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Personas doesn't exist") })
    public List<Personas> getAllPersonas() {
        return personasService.getAllPersonas();
    }

    @GetMapping(path = "/id")
    @ApiOperation(value = "Get Personas by Id", response = Personas.class)
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Something went wrong"),
            @ApiResponse(code = 401, message = "Access denied"),
            @ApiResponse(code = 404, message = "The Personas doesn't exist") })
    public Optional<Personas> getByIdCasino(@RequestParam Long id) {
        return personasService.getById(id);
    }
}
