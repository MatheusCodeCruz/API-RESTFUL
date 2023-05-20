package br.com.api.farmacia.services;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.api.farmacia.domain.Farmacia;
import br.com.api.farmacia.domain.Farmacia.Produto;

@Service
public class FarmaciaService {

	private List<Produto> produtos = new ArrayList<>();

    public Farmacia getFarmacia() {
        Farmacia farmacia = new Farmacia(null,null, produtos);
        farmacia.setId(1L);
        farmacia.setNome("Minha Farmácia");
        farmacia.setProdutos(produtos);
        return farmacia;
    	
    }

    public Produto addProduto(Produto produto) {
        produto.setId((long) (produtos.size() + 1));
        produtos.add(produto);
        return produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto getProdutoById(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                return produto;
            }
        }
        return null;
    }

    public Produto updateProduto(Long id, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            if (produto.getId().equals(id)) {
                produtoAtualizado.setId(produto.getId());
                produtos.set(i, produtoAtualizado);
                return produtoAtualizado;
            }
        }
        return null;
    }

    public boolean deleteProduto(Long id) {
        for (Produto produto : produtos) {
            if (produto.getId().equals(id)) {
                produtos.remove(produto);
                return true;
            }
        }
        return false;
    }

	public List<Produto> getAllProdutos() {
		return null;
	}
}
