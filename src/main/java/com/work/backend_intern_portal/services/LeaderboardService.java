package com.work.backend_intern_portal.services;

import com.work.backend_intern_portal.DTO.LeaderboardEntryDTO;
import com.work.backend_intern_portal.repositories.LeaderboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LeaderboardService {
    @Autowired
    private LeaderboardRepository leaderboardRepository;

    public List<LeaderboardEntryDTO> getAllEntries(){
        return leaderboardRepository.findAll()
                .stream()
                .map(entry -> new LeaderboardEntryDTO(
                            entry.getRank(),
                            entry.getName(),
                            entry.getReferralCode(),
                            entry.getDonationsRaised(),
                        entry.getReferrals()
                        ))
                .collect(Collectors.toList());
    }
}
