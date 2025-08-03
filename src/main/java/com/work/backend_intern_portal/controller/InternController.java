package com.work.backend_intern_portal.controller;

import com.work.backend_intern_portal.DTO.InternDTO;
import com.work.backend_intern_portal.services.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api")
public class InternController {
    @Autowired
    private InternService internService;

    @GetMapping("/intern")
    public ResponseEntity<InternDTO> getInternData(){
        InternDTO internDTO = internService.getInternData();
        return ResponseEntity.ok(internDTO);
    }
}
