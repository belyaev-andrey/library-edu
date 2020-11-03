package ru.vsu.csf.groupsix.books;

import ru.vsu.csf.groupsix.common.Drawable;
import ru.vsu.csf.groupsix.common.Storeable;

public class LibItem implements Storeable, Drawable {

    private Long id;

    private String name;

    private Integer pageNum;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public void Draw() {

    }
}
