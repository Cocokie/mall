package com.lix.mall.thirdparty.config;

import com.alibaba.cloud.spring.boot.context.env.AliCloudProperties;
import com.alibaba.cloud.spring.boot.oss.env.OssProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@EnableConfigurationProperties(value = {AliCloudProperties.class, OssProperties.class})
@Component
public class OssConfig {
    @Autowired
    AliCloudProperties aliCloudProperties;
    @Autowired
    OssProperties ossProperties;
    @Value("${ali.oss.bucket}")
    String bucket;

    public AliCloudProperties getAliCloudProperties() {
        return aliCloudProperties;
    }

    public void setAliCloudProperties(AliCloudProperties aliCloudProperties) {
        this.aliCloudProperties = aliCloudProperties;
    }

    public OssProperties getOssProperties() {
        return ossProperties;
    }

    public void setOssProperties(OssProperties ossProperties) {
        this.ossProperties = ossProperties;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }
}
