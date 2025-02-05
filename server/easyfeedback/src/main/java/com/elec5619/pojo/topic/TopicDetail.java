package com.elec5619.pojo.topic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TopicDetail {
    private Long topicId;
    private String topicName;
    private String content;
    private Timestamp createTime;
    private Long pmId;
    private String pmName;
    private String photo;
    private Integer collectNum;
    private boolean collectState;
    private Integer commentNum;
    private Integer likeNum;
    private boolean likeState;

}
