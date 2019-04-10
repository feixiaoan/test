package cn.mldn.action;
import cn.mldn.vo.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller   //�������ﶨ��һ��������
@RequestMapping("/page/back/message/*")  //�������·��
public class MessageAction {
	@RequestMapping(value="hello_demo")  //Ϊdemo��������ӳ����·��
	public ModelAndView demo(Message msg) {
		ModelAndView mav = new ModelAndView("page/forward.jsp");
		mav.addObject("msg","��Ϣ��Ϣ��ӳɹ�");
		mav.addObject("url","index.jsp"); 
		System.out.println(msg);
		return mav;  
	}
}
