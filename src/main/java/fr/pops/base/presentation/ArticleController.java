package fr.pops.base.presentation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.pops.base.business.entity.Article;
import fr.pops.base.business.service.ArticleService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleController {

	@Autowired
	private ArticleService artServ;

	@PostMapping("/articles")
	public void saveArticle(@RequestBody Article article) {
		this.artServ.saveArticle(article);
	}

	@GetMapping("/articles")
	public List<Article> getArticles() {
		return this.artServ.getArticles();
	}

	@GetMapping("/articles/{id}")
	public Article getArticle(@PathVariable Long id) {
		return this.artServ.getArticle(id);
	}

	@PostMapping("/delarticle")
	public void deleteArticle(@RequestBody Long id) {
		this.artServ.deleteArticle(id);
	}

}
