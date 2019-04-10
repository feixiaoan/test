package cn.mldn.action;
import cn.mldn.vo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller   //现在这里定义一个控制器
@RequestMapping("/page/back/message/*")  //整体访问路径
public class MessageAction {
	@RequestMapping(value="hello_demo")  //为demo方法定义映射子路径
	public ModelAndView demo(Message msg) {
		ModelAndView mav = new ModelAndView("page/forward.jsp");
		mav.addObject("msg","消息信息添加成功");
		mav.addObject("url","index.jsp"); 
		System.out.println(msg);
		return mav;  
	}
}
