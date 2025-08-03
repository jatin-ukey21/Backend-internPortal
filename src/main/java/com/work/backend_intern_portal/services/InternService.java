package com.work.backend_intern_portal.services;

import com.work.backend_intern_portal.DTO.InternDTO;
import org.springframework.stereotype.Service;

@Service
public class InternService {
    public InternDTO getInternData(){
        return new InternDTO(
                "Steve Rogers",
                "alex2025",
                15420,
                23,
                5
        );
    }
}
