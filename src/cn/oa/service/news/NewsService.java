package cn.oa.service.news;

import java.util.List;

import cn.oa.pojo.News;

public interface NewsService {
	
	//查询新闻
	public List<News> newslist();
	
	//发布新闻
	public boolean addnews(News news);
	
	//删除
	public int delete(Integer id);

}
