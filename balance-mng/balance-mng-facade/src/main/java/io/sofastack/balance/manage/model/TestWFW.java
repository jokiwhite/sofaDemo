package io.sofastack.balance.manage.model;

/**
* @Description:测试微服务实体类
* @Author: jokiwhite
* @Date: 2021/4/26
*/
public class TestWFW {
    private String wfw_id;

    private String wfw_title;

    private String wfw_author;

    @Override
    public String toString() {
        return "TestWFW{" +
                "wfw_id='" + wfw_id + '\'' +
                ", wfw_title='" + wfw_title + '\'' +
                ", wfw_author='" + wfw_author + '\'' +
                '}';
    }

    public String getWfw_id() {
        return wfw_id;
    }

    public void setWfw_id(String wfw_id) {
        this.wfw_id = wfw_id;
    }

    public String getWfw_title() {
        return wfw_title;
    }

    public void setWfw_title(String wfw_title) {
        this.wfw_title = wfw_title;
    }

    public String getWfw_author() {
        return wfw_author;
    }

    public void setWfw_author(String wfw_author) {
        this.wfw_author = wfw_author;
    }
}
