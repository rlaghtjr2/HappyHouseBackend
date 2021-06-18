package com.ssafy.edu.vue.service;

import java.util.List;

import com.ssafy.edu.vue.dto.ArticleDto;

public interface ArticleService {
	
	public int addArticle(ArticleDto dto);

	public boolean deleteArticle(int idx);

	public boolean updateArticle(ArticleDto dto);

	public List<ArticleDto> findArticleByTitle(String title);

	public List<ArticleDto> findArticleByWriter(String writer);

	public ArticleDto findArticleByIdx(int idx);

	public List<ArticleDto> findArticleByPage(int page);

	public List<ArticleDto> findArticle();
	
}
