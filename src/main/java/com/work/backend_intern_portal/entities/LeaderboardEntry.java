package com.work.backend_intern_portal.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "leaderboard")
public class LeaderboardEntry {
    @Id
    private String id;

    private int rank;
    private String name;
    private String referralCode;
    private int donationsRaised;
    private int referrals;
}
