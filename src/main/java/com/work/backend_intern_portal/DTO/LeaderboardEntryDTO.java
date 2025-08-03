package com.work.backend_intern_portal.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LeaderboardEntryDTO {
    private int rank;
    private String name;
    private String referralCode;
    private int donationsRaised;
    private int referrals;
}
