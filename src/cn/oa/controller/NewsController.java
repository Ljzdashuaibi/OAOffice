package cn.oa.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.oa.pojo.Dept;
import cn.oa.pojo.Deptschedule;
import cn.oa.pojo.News;
import cn.oa.pojo.User;
import cn.oa.service.news.NewsService;
import cn.oa.tools.Constants;

@Controller
public class NewsController {
	
	@Resource
	private NewsService newsService;//新闻
	
	
	//新闻列表 
	@RequestMapping("/searchNews.html")
	public String addDept(Model model,News news){
		List<News> list=newsService.newslist();
		model.addAttribute("news",list);
		return "searchNews";
	}
	
	//添加新闻
	@RequestMapping("/createNews.html")
	public String addDepts(){
		return "updateNews";
	}
	
	@RequestMapping(value="addnews.html")
	public String adddepts(News news,HttpSession session,HttpServletRequest request){
		boolean flag=true;
		if(flag) {
			news.setUserid(((User)session.getAttribute(Constants.USER_SESSION)).getId());
			//createTime
			news.setCreateTime(new Date());
			if(newsService.addnews(news)){
				return "redirect:/searchNews.html";
			}
		}
		return "updateNews";
	}
	
	//删除
	@RequestMapping("/deleteDeptSchedule")
	public String deletes(@RequestParam Integer id) {
		if (newsService.delete(id)>0) {
			return "redirect:/searchNews.html";
		}
		return "searchNews";
	}
	
	
}
