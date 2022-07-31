package com.yacoding.service.oss.utils;

/**
 * @Author yaCoding
 * @create 2022-07-31 下午 9:54
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 从配置文件读取变量
 */
@Data
@Component
@ConfigurationProperties(prefix = "aliyun.oss")

public class OssProperties {
}
