package com.yzc.news.server.web.admin.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 前端树控件
 */
@Data
public class TreeView implements Serializable {
    private String id;
    private String icon;
    private String text;
    private boolean children;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "TreeView{" +
                "id='" + id + '\'' +
                ", icon='" + icon + '\'' +
                ", text='" + text + '\'' +
                ", children=" + children +
                '}';
    }
}
