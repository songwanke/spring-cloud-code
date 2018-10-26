package cn.springcloud.book.feign.controller;

import cn.springcloud.book.feign.model.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/user")
public class UserController {

	/**
	 * consumer传参方式：method=Get,param=User----借助拦截器将user(不加注解默认body形式)转换为param形式
	 * @param user
	 * @param request
	 * @return
	 */
	/*@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(User user , HttpServletRequest request){
		String token=request.getHeader("oauthToken");
		return "hello,"+user.getName();
	}*/

	/**
	 * consumer传参方式：method=Get,param=User----不借助拦截器将user(不加注解默认body形式)转换为param形式时，服务端接收的参数为null
	 * @param user
	 * @param request
	 * @return
	 */
/*	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(User user , HttpServletRequest request){
		String token=request.getHeader("oauthToken");
		return "hello,"+user.getName();
	}*/

	/**
	 * consumer传参方式：method=Get/Post,param=@RequestBody User----双方都为body形式
	 * @param user
	 * @param request
	 * @return
	 */
	/*@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addUser(@RequestBody User user , HttpServletRequest request){
		String token=request.getHeader("oauthToken");
		return "hello,"+user.getName();
	}*/


	/**
	 * consumer传参方式：method=Get/Post,param=@RequestBody User----双方都为body形式
	 * @param user
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addUser(User user , HttpServletRequest request){
		String token=request.getHeader("oauthToken");
		return "hello,"+user.getName();
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser( @RequestBody User user){
		return "hello,"+user.getName();
	}


}
