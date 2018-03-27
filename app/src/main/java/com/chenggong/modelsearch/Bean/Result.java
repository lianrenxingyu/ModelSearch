package com.chenggong.modelsearch.Bean;

/**
 * Created by chenggong on 18-3-27.
 */

public class Result {
    //id","webpageURL","imgWebURL","name","author","timePost","browseNum","description",
    // "source","label","summary","number","flag","version"

    private String id;
    private String name;    //搜索的名字
    private String author;  //上传模型的作者
    private String timePost;    //模型上传时间
    private String description;     // 描述
    private String webpageURL;  //模型web网页网址
    private String source;  //网站网址

    private String imgWebURL;   //
    private String browseNum;   //
    private String label;   //
    private String summary; //
    private String flag;   //
    private String version; // 版本

    public Result() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getTimePost() {
        return timePost;
    }

    public void setTimePost(String timePost) {
        this.timePost = timePost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebpageURL() {
        return webpageURL;
    }

    public void setWebpageURL(String webpageURL) {
        this.webpageURL = webpageURL;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getImgWebURL() {
        return imgWebURL;
    }

    public void setImgWebURL(String imgWebURL) {
        this.imgWebURL = imgWebURL;
    }

    public String getBrowseNum() {
        return browseNum;
    }

    public void setBrowseNum(String browseNum) {
        this.browseNum = browseNum;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


}
