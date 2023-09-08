package com.example.springdatajpa.dto;

import java.time.LocalDateTime;

public interface BoardInterface {
    public Integer getBoardId();
    public String getTitle();
    public String getContent();
    public Integer getUserId();
    public String getName();
    public LocalDateTime getRegdate();
    public int getViewCnt();
}
