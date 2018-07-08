/**
 * Copyright (C), 2013-2018, 北京火币天下网络技术有限公司
 * FileName: HelloController
 * Author:   tonychen
 * Date:     2018/4/1 下午2:47
 * Description: 发布接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.huobi.springbootdubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.huobi.springbootdubboapi.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈发布接口〉
 *
 * @author tonychen
 * @create 2018/4/1
 * @since 1.0.0
 */
@RestController
public class HelloController {


    //注入服务提供方暴露的接口，通过@Reference注解，dubbo会在扫描的时候自动代理接口，然后通过rpc调用远程服务。
    @Reference(version = "${demo.service.version}",
    application = "${dubbo.application.id}",
    url = "dubbo://localhost:20880")
    private HelloService helloService;

    @GetMapping("/say")
    public String say(){
        return helloService.sayHello();
    }
}