package com.fushaolei.android_mix_recyclerview_demo;

public class Bean {
    private int layoutStyle;

    private String title;
    private String name;
    private String desc;
    private int pic;

    public Bean(int layoutStyle, String title, String desc, int pic) {
        this.layoutStyle = layoutStyle;
        this.title = title;
        this.desc = desc;
        this.pic = pic;
    }

    public Bean(int layoutStyle, String name, int pic) {
        this.layoutStyle = layoutStyle;
        this.name = name;
        this.pic = pic;
    }

    public int getLayoutStyle() {
        return layoutStyle;
    }

    public void setLayoutStyle(int layoutStyle) {
        this.layoutStyle = layoutStyle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }
}
