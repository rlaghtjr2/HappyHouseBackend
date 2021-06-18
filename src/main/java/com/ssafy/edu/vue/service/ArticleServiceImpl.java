package com.ssafy.edu.vue.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.edu.vue.dao.ArticleDao;
import com.ssafy.edu.vue.dto.ArticleDto;


@Service
public class ArticleServiceImpl implements ArticleService {
	
    @Autowired
	private ArticleDao articleDao;

	@Override
	public int addArticle(ArticleDto dto) {
		return articleDao.addArticle(dto);
	}

	@Override
	public boolean deleteArticle(int idx) {
		articleDao.deleteArticle(idx);
		return true;
	}

	@Override
	public boolean updateArticle(ArticleDto dto) {
		articleDao.updateUser(dto);
		return true;
	}

	@Override
	public List<ArticleDto> findArticleByTitle(String title) {
		return articleDao.findArticleByTitle(title);
	}

	@Override
	public List<ArticleDto> findArticleByWriter(String writer) {
		// TODO Auto-generated method stub
		return articleDao.findArticleByWriter(writer);
	}

	@Override
	public ArticleDto findArticleByIdx(int idx) {
		// TODO Auto-generated method stub
		return articleDao.findArticleByIdx(idx);
	}

	@Override
	public List<ArticleDto> findArticleByPage(int page) {
		// TODO Auto-generated method stub
		return articleDao.findArticleByPage(page);
	}

	@Override
	public List<ArticleDto> findArticle() {
		// TODO Auto-generated method stub
		return articleDao.findArticle();
	}
    
    
	
}
