package com.project.sanhak.aiChatbot.dto;

import com.project.sanhak.card.dto.skill;
import com.project.sanhak.domain.skil.code.Tools;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class aiChatDTO {
    private String fromDate;
    private String toDate;
    private String title;
    private List<String> category;
    private List<skill> skills;
    private List<Tools> tools;
    private String reflection;
    private String imageUrl;
    private String pdfName;
    private String pdfUrl;
    private List<String> sourceUrl;
    private String summary;
}
