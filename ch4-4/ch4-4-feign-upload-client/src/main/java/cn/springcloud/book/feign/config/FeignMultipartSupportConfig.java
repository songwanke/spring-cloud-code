package cn.springcloud.book.feign.config;

import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import feign.codec.Encoder;


/**
 * Feign文件上传Configuration
 */
@Configuration
public class FeignMultipartSupportConfig {

    /**
     * 容器在接受到该类型的对象的请求的时候，会每次都重新生成一个新的对象给请求方，
     * 虽然这种类型的对象的实例化以及属性设置等工作都是由容器负责的，
     * 但是只要准备完毕，并且对象实例返回给请求方之后，容器就不在拥有当前对象的引用，
     * 请求方需要自己负责当前对象后继生命周期的管理工作，包括该对象的销毁。
     * 也就是说，容器每次返回请求方该对象的一个新的实例之后，就由这个对象“自生自灭”了。
     * @return
     */
    @Bean
    @Primary
    @Scope("prototype")
    public Encoder multipartFormEncoder() {
        return new SpringFormEncoder();
    }
}
