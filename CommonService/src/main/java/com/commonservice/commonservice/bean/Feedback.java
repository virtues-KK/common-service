package com.commonservice.commonservice.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    /**
     * 反馈人
     */
    private String name;

    /**
     * 手机号码
     */
    private String phoneNum;

    /**
     * 反馈内容
     */
    @Column(columnDefinition = "text")
    private String content;

    /**
     * 反馈时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private LocalDateTime time;

}
