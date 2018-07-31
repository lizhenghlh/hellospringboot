package io.github.lizhenghlh.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

@TableName("book")
public class Book implements Serializable {

    private Long id;
    private String name;
    private String author;
    private String category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
