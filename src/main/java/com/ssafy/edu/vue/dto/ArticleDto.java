package com.ssafy.edu.vue.dto;

public class ArticleDto {
	private int idx;
	private String title;
	private String writer;
	private String content;
	private int likes;
	private int views;
	private String created_date;
	
	public ArticleDto() {
	}

	public ArticleDto(int idx, String title, String writer, String content, int likes, int views, String created_date) {
		super();
		this.idx = idx;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.likes = likes;
		this.views = views;
		this.created_date = created_date;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	
	
}
