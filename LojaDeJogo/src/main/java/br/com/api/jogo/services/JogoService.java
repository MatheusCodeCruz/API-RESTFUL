package br.com.api.jogo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.api.jogo.domain.Jogo;

@Service
public class JogoService {

	private List<Jogo> jogos = new ArrayList<>();

    public JogoService() {
        jogos.add(new Jogo(1L, "The Legend of Zelda: Breath of the Wild", "Nintendo Switch", 59.99));
        jogos.add(new Jogo(2L, "God of War", "PlayStation 4", 49.99));
        jogos.add(new Jogo(3L, "The Last of Us Part II", "PlayStation 4", 59.99));
    }

    public List<Jogo> getAllJogos() {
        return jogos;
    }

    public Jogo getJogoById(Long id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId().equals(id)) {
                return jogo;
            }
        }
        return null;
    }

    public Jogo saveJogo(Jogo jogo) {
        jogo.setId((long) (jogos.size() + 1));
        jogos.add(jogo);
        return jogo;
    }

    public Jogo updateJogo(Long id, Jogo jogoAtualizado) {
        for (int i = 0; i < jogos.size(); i++) {
            Jogo jogo = jogos.get(i);
            if (jogo.getId().equals(id)) {
                jogoAtualizado.setId(jogo.getId());
                jogos.set(i, jogoAtualizado);
                return jogoAtualizado;
            }
        }
        return null;
    }

    public boolean deleteJogo(Long id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId().equals(id)) {
                jogos.remove(jogo);
                return true;
            }
        }
        return false;
    }
}
