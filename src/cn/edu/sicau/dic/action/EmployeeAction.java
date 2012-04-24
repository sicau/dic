package cn.edu.sicau.dic.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.sicau.dic.service.EmployeeService;

@Controller // employeeAction
public class EmployeeAction {
    @Resource EmployeeService employeeService;
    
	public String execute(){
		ActionContext.getContext().put("employees", employeeService.list());
		return "list";
	}
}
