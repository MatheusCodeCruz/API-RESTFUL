package br.com.api.jogo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.jogo.domain.Jogo;
import br.com.api.jogo.services.JogoService;

@RestController
@RequestMapping("/jogos")
public class JogoControllers {

	private final JogoService jogoService;

    @Autowired
    public JogoControllers(JogoService jogoService) {
        this.jogoService = jogoService;
    }

    @GetMapping
    public List<Jogo> getAllJogos() {
        return jogoService.getAllJogos();
    }

    @GetMapping("/{id}")
    public Jogo getJogoById(@PathVariable Long id) {
        return jogoService.getJogoById(id);
    }

    @PostMapping
    public Jogo saveJogo(@RequestBody Jogo jogo) {
        return jogoService.saveJogo(jogo);
    }

    @PutMapping("/{id}")
    public Jogo updateJogo(@PathVariable Long id, @RequestBody Jogo jogoAtualizado) {
        return jogoService.updateJogo(id, jogoAtualizado);
    }

    @DeleteMapping("/{id}")
    public boolean deleteJogo(@PathVariable Long id) {
        return jogoService.deleteJogo(id);
    }
}
