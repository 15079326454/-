package com.hgkj.model.entity;

import java.util.Date;
import java.util.List;

public class Blog {
    private Integer id;

    private String title;

    private String content;

    private String createTime;

    private String type;

    private Author author;
    private List<Comment> comments;

    public List <Comment> getComments() {
        return comments;
    }

    public void setComments(List <Comment> comments) {
        this.comments = comments;
    }

    public Blog() {
    }

    public Blog(String title, String content, String createTime, String type, Author author) {
        this.title = title;
        this.content = content;
        this.createTime = createTime;
        this.type = type;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}