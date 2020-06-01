package top.wankang.entity;


import top.wankang.entity.base.BaseEntity;

import java.io.Serializable;

public class SelfAppraisal extends BaseEntity implements Serializable {

    private String content;

    private Integer userId;

    private static final long serialVersionUID = 1L;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", content=").append(content);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}
