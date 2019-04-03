package cn.oa.dao.news;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.oa.pojo.News;

public interface NewsMapper {
	
	//查询新闻
	public List<News> newslist();
	
	//发布公告
	public int addnews(News news);
	
	//删除新闻 
	public int delete(@Param("id") Integer id);

}
