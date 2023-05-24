package br.com.api.suplementos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.suplementos.domain.Suplemento;
import br.com.api.suplementos.services.SuplementoService;

@RestController
@RequestMapping("/suplementos")
public class SuplementoController {

	private final SuplementoService suplementoService;

    @Autowired
    public SuplementoController(SuplementoService suplementoService) {
        this.suplementoService = suplementoService;
    }

    @GetMapping("/listar")
    public List<Suplemento> getAllSuplementos() {
        return suplementoService.getAllSuplementos();
    }

    @GetMapping("/{id}")
    public Optional<Suplemento> getSuplementoById(@PathVariable Long id) {
        return suplementoService.getSuplementoById(id);
    }

    @PostMapping
    public Suplemento saveSuplemento(@RequestBody Suplemento suplemento) {
        return suplementoService.saveSuplemento(suplemento);
    }

    @PutMapping("/{id}")
    public Suplemento updateSuplemento(@PathVariable Long id, @RequestBody Suplemento suplemento) {
        suplemento.setId(id);
        return suplementoService.saveSuplemento(suplemento);
    }

    @DeleteMapping("/{id}")
    public void deleteSuplemento(@PathVariable Long id) {
        suplementoService.deleteSuplemento(id);
    }
}
