package com.zhiyuan.starter.demo;

/**
 * @ClassName TalkService
 * @Description Todo
 * @Author ming.lu
 * @Date 2020/2/28 19:17
 */
public class TalkService {
    TalKProperties talKProperties;

    public TalKProperties getTalKProperties() {
        return talKProperties;
    }

    public void setTalKProperties(TalKProperties talKProperties) {
        this.talKProperties = talKProperties;
    }

    public String talkToLead(String name) {
        return talKProperties.getPrefix() +"----"+name +"-----" + talKProperties.getSuffix();
    }
}
