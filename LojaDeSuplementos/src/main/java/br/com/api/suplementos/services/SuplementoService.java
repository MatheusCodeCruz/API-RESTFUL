package br.com.api.suplementos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.suplementos.domain.Suplemento;
import br.com.api.suplementos.repositories.SuplementoRepository;

@Service
public class SuplementoService {

	private final SuplementoRepository suplementoRepository;

    @Autowired
    public SuplementoService(SuplementoRepository suplementoRepository) {
        this.suplementoRepository = suplementoRepository;
    }

    public List<Suplemento> getAllSuplementos() {
        return suplementoRepository.findAll();
    }

    public Optional<Suplemento> getSuplementoById(Long id) {
        return suplementoRepository.findById(id);
    }

    public Suplemento saveSuplemento(Suplemento suplemento) {
        return suplementoRepository.save(suplemento);
    }

    public void deleteSuplemento(Long id) {
        suplementoRepository.deleteById(id);
    }
}
