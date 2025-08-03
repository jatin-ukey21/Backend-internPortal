package com.work.backend_intern_portal.controller;

import com.work.backend_intern_portal.DTO.LeaderboardEntryDTO;
import com.work.backend_intern_portal.services.LeaderboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LeaderboardController {
    @Autowired
    private LeaderboardService leaderboardService;

    @GetMapping("/leaderboard")
    public ResponseEntity<List<LeaderboardEntryDTO>> getLeaderboard() {
        return ResponseEntity.ok(leaderboardService.getAllEntries());
    }
}
