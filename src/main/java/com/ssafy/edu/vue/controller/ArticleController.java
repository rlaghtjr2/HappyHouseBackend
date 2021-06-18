package com.ssafy.edu.vue.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.edu.vue.dto.ArticleDto;
import com.ssafy.edu.vue.help.BoolResult;
import com.ssafy.edu.vue.help.NumberResult;
import com.ssafy.edu.vue.service.ArticleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

//http://localhost:8197/ssafyvue/swagger-ui.html
@CrossOrigin(origins = { "*" }, maxAge = 6000)
@RestController
@RequestMapping("/article")
@Api(value = "SSAFY", description = "HappyHouse 게시글에 관한 정보")
public class ArticleController {

	public static final Logger logger = LoggerFactory.getLogger(ArticleController.class);

	@Autowired
	private ArticleService articleService;

	@ApiOperation(value = " 새로운 게시글 정보를 입력한다. 그리고 그 게시글의 테이블상 인덱스를 반환한다.", response = NumberResult.class)
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<NumberResult> addUser(@RequestBody ArticleDto dto) throws Exception {
		int total = articleService.addArticle(dto);
		NumberResult nr = new NumberResult();
		nr.setCount(total);
		nr.setName("addArticle");
		nr.setState("succ");
		if (total <= 0) {
			nr.setCount(-1);
			nr.setName("addArticle");
			nr.setState("fail");
			// return new ResponseEntity(HttpStatus.NO_CONTENT);
			return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
		}
		return new ResponseEntity<NumberResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = " 해당게시글을 삭제한다.", response = BoolResult.class)
	@RequestMapping(value = "/{idx}", method = RequestMethod.DELETE)
	public ResponseEntity<BoolResult> deleteEmployee(@PathVariable int idx) throws Exception {

		boolean total = articleService.deleteArticle(idx);
		BoolResult nr = new BoolResult();
		nr.setCount(total);
		nr.setName("deleteArticle");
		nr.setState("succ");
		if (!total) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = " 게시글을 수정한다 ", response = BoolResult.class)
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<BoolResult> updateArticle(@RequestBody ArticleDto dto) throws Exception {
		boolean total = articleService.updateArticle(dto);
		BoolResult nr = new BoolResult();
		nr.setCount(total);
		nr.setName("updateArticle");
		nr.setState("succ");
		if (!total) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<BoolResult>(nr, HttpStatus.OK);
	}

	@ApiOperation(value = "게시글의 제목으로 게시글을 찾는다.", response = ArticleDto.class)
	@RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleDto>> findArticleByTitle(@PathVariable String title) throws Exception {
		List<ArticleDto> articles = articleService.findArticleByTitle(title);
		if (articles.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ArticleDto>>(articles, HttpStatus.OK);
	}

	@ApiOperation(value = "게시글의 작성자 이름으로 게시글을 찾는다.", response = ArticleDto.class)
	@RequestMapping(value = "/writer/{writer}", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleDto>> findArticleByWriter(@PathVariable String writer) throws Exception {
		List<ArticleDto> articles = articleService.findArticleByWriter(writer);
		if (articles.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ArticleDto>>(articles, HttpStatus.OK);
	}

	@ApiOperation(value = "게시글의 인덱스로 게시글의 정보를 찾는다.", response = ArticleDto.class)
	@RequestMapping(value = "/idx/{idx}", method = RequestMethod.GET)
	public ResponseEntity<ArticleDto> findEmployeeById(@PathVariable int idx) throws Exception {
		ArticleDto article = articleService.findArticleByIdx(idx);
		if (article == null || article.getIdx() == 0) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<ArticleDto>(article, HttpStatus.OK);
	}
	
	@ApiOperation(value = "페이지네이션 기능으로 게시글을 찾는다.", response = ArticleDto.class)
	@RequestMapping(value = "/page/{page}", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleDto>> findArticleByPage(@PathVariable String page) throws Exception {
		List<ArticleDto> articles = articleService.findArticleByPage(Integer.parseInt(page)*10);
		if (articles.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ArticleDto>>(articles, HttpStatus.OK);
	}
	
	@ApiOperation(value = "전체 게시글을 반납한다.", response = ArticleDto.class)
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<ArticleDto>> findArticle() throws Exception {
		List<ArticleDto> articles = articleService.findArticle();
		if (articles.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<ArticleDto>>(articles, HttpStatus.OK);
	}

}
