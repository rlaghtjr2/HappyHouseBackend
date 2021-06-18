package com.ssafy.edu.vue.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssafy.edu.vue.dto.ArticleDto;
@Repository
public class ArticleDaoImpl implements ArticleDao{
	
    private String ns="com.ssafy.edu.vue.dao.HrmMapper.";
	
	@Autowired
	private SqlSession sqlSession;


	@Override
	public int addArticle(ArticleDto dto) {
		// TODO Auto-generated method stub
		return sqlSession.insert(ns+"addArticle",dto);
	}

	@Override
	public boolean deleteArticle(int idx) {
		sqlSession.delete(ns+"deleteArticle",idx);
		 return true;
	}

	@Override
	public boolean updateUser(ArticleDto dto) {
		sqlSession.update(ns+"updateArticle",dto);
		 return true;
	}

	@Override
	public List<ArticleDto> findArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findArticleByTitle", title);
	}

	@Override
	public List<ArticleDto> findArticleByWriter(String writer) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findArticleByWriter", writer);
	}

	@Override
	public ArticleDto findArticleByIdx(int idx) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(ns+"findArticleByIdx", idx);
	}

	@Override
	public List<ArticleDto> findArticleByPage(int page) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findArticleByPage", page);
	}

	@Override
	public List<ArticleDto> findArticle() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(ns+"findArticle");
	}
	
}
