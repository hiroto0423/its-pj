package com.example.its.web.issue;

import com.example.its.domain.issue.IssueEntity;
import com.example.its.domain.issue.IssueService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import lombok.RequiredArgsConstructor;


@Controller
@RequiredArgsConstructor
public class IssueController {
    private final IssueService issueService;
    @GetMapping("/issues")
    public String showList(Model model) {
        model.addAttribute("issueList",issueService.findAll());
        return "issues/List";
    }
}
