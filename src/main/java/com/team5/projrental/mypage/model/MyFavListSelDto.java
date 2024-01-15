package com.team5.projrental.mypage.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class MyFavListSelDto {
    private int page;
    private int iuser;
    @JsonIgnore
    private int startIdx;

    private int rowCount = 10;

    public void setPage(int page) {
        this.startIdx = (page-1) * this.rowCount;
    }
}
