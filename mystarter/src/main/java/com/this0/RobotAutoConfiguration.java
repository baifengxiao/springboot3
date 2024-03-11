package com.this0;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//给容器中导入Robot功能要用的所有组件
@Import({RobotProperties.class, RobotService.class})
@Configuration
public class RobotAutoConfiguration {
}
