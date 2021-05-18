package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 요청을 받을 클래스
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoRequest {

    private String title;

    private Long order;

    private Boolean completed;
}
