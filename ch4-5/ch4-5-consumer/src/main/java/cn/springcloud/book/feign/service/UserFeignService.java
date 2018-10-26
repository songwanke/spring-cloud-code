package cn.springcloud.book.feign.service;

import cn.springcloud.book.feign.config.HelloFeignServiceConfig;
import cn.springcloud.book.feign.model.User;
import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "ch4-5-provider",configuration = HelloFeignServiceConfig.class)
public interface UserFeignService {

    /**
     * 如果RequestMethod=POST，@RequestParam标注的参数拼接在url上
     * @param name
     * @param id
     * @param age
     * @param hobby
     * @return
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.GET)
    public String addUser(@RequestParam("name") String name,
                          @RequestParam("id") Long id,
                          @RequestParam("age") int age,
                          @RequestParam("hobby") String hobby);

    @RequestMapping(value = "/user/update", method = RequestMethod.POST)
    public String updateUser(@RequestBody User user);

}
