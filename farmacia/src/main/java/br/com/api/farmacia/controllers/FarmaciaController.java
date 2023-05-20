package br.com.api.farmacia.controllers;

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

import br.com.api.farmacia.domain.Farmacia;
import br.com.api.farmacia.domain.Farmacia.Produto;
import br.com.api.farmacia.services.FarmaciaService;

@RestController
@RequestMapping("/farmacia")
public class FarmaciaController {

	 private final FarmaciaService farmaciaService;

	    @Autowired
	    public FarmaciaController(FarmaciaService farmaciaService) {
	        this.farmaciaService = farmaciaService;
	    }

	    @GetMapping
	    public Farmacia getFarmacia() {
	        return farmaciaService.getFarmacia();
	    }
	   
	    //http://localhost:8080/farmacia/produtos
	    @PostMapping("/produtos")
	    public Produto addProduto(@RequestBody Produto produto) {
	        return farmaciaService.addProduto(produto);
	    }
	    
	    //http://localhost:8080/farmacia/produtos
	    @GetMapping("/produtos")
	    public List<Produto> getAllProdutos() {
	        return farmaciaService.getAllProdutos();
	    }
	    //http://localhost:8080/farmacia/produtos/id
	    @GetMapping("/produtos/{id}")
	    public Produto getProdutoById(@PathVariable Long id) {
	        return farmaciaService.getProdutoById(id);
	    }

	    @PutMapping("/produtos/{id}")
	    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produtoAtualizado) {
	        return farmaciaService.updateProduto(id, produtoAtualizado);
	    }

	    @DeleteMapping("/produtos/{id}")
	    public boolean deleteProduto(@PathVariable Long id) {
	        return farmaciaService.deleteProduto(id);
	    }
	
//	
//	http:/localhost:8080/farmacia/produtos
//	@GetMapping("/produtos")
//	public List<Produto> listarProdutos(){
//		return farmaciaService.listarProdutos();
//	}
//	
//	
//	http:/localhost:8080/farmacia/produto
//	@PostMapping("/produto")
//	public void adicionarProduto(@RequestBody Produto produto) {
//		farmaciaService.adicionarProduto(produto);
//	}
//	
//	http:/localhost:8080/farmacia/produto/{nome}
//	@DeleteMapping("/produto/{nome}")
//	public void removerProduto(@PathVariable String nome) {
//		farmaciaService.removerProduto(nome);
//	}

	
}
