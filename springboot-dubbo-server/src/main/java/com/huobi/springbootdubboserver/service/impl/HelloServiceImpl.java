/**
 * Copyright (C), 2013-2018, 北京火币天下网络技术有限公司
 * FileName: HelloServiceImpl
 * Author:   tonychen
 * Date:     2018/4/1 下午2:40
 * Description: Hello服务实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.huobi.springbootdubboserver.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.huobi.springbootdubboapi.service.HelloService;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Hello服务实现类〉
 *
 * @author tonychen
 * @create 2018/4/1
 * @since 1.0.0
 */
@Service(version = "${demo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
) //该Service注解是dubbo的注解，不是spring的。若使用xml配置方式暴露接口，则不需要该注解。
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello() {
        return "Hello world";
    }
}