package com.run.web.controller;

import com.run.web.dto.ClubDTO;
import com.run.web.services.club.ClubService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClubController {

    private final ClubService clubService;

    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/clubs")
    public String getAllClubs(Model model) {
        List<ClubDTO> clubs = clubService.findAllClubs();
        model.addAttribute("clubs", clubs);
        return "clubs-list";
    }
}
