package fr.pops.base.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.pops.base.business.entity.Article;
import fr.pops.base.persistence.ArticleRepository;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepo;

	public void saveArticle(Article article) {
		this.articleRepo.save(article);
	}

	public List<Article> getArticles() {
		return this.articleRepo.findAll();
	}

	public void deleteArticle(Long id) {
		this.articleRepo.deleteById(id);
	}

	public Article getArticle(Long id) {
		return this.articleRepo.getOne(id);
	}

}
