package com.work.backend_intern_portal.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InternDTO {
    private String name;
    private String referralCode;
    private int totalDonations;
    private int totalReferrals;
    private int rank;
}
