package com.zb.entity;

public class Replies {
    private Integer id;
    private String content;
    private String replyTime;
    private Integer infold;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public Integer getInfold() {
        return infold;
    }

    public void setInfold(Integer infold) {
        this.infold = infold;
    }
}
