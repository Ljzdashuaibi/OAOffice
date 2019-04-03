package cn.oa.service.news.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.Mapping;

import cn.oa.dao.news.NewsMapper;
import cn.oa.pojo.News;
import cn.oa.service.news.NewsService;


@Service
public class NewsServiceImpl implements NewsService{

	@Resource
	private NewsMapper newsMapper;//新闻
	
	
	//查询新闻
	public List<News> newslist() {
		List<News> list=newsMapper.newslist();
		return list;
	}

	//发布新闻
	public boolean addnews(News news ) {
		boolean flag=false;
		int num = newsMapper.addnews(news);
		if(num>0){
			flag=true;
			System.out.println("add success!");
		}else{
			System.out.println("add failed!");
		}
		return flag;
	}

	
	//删除
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return newsMapper.delete(id);
	}

}
