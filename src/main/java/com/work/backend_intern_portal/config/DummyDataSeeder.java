package com.work.backend_intern_portal.config;


import com.work.backend_intern_portal.entities.LeaderboardEntry;
import com.work.backend_intern_portal.repositories.LeaderboardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DummyDataSeeder {
    @Bean
    CommandLineRunner initDatabase(LeaderboardRepository repo) {
        return args -> {
            if (repo.count() == 0) {
                repo.saveAll(List.of(
                        new LeaderboardEntry(null, 1, "Sarah Chen", "sarah2025", 28500, 42),
                        new LeaderboardEntry(null, 2, "Michael Rodriguez", "mike2025", 24800, 38),
                        new LeaderboardEntry(null, 3, "Emily Davis", "emily2025", 22100, 35),
                        new LeaderboardEntry(null, 4, "James Wilson", "james2025", 19750, 31),
                        new LeaderboardEntry(null, 5, "Alex Johnson", "alex2025", 15420, 23),
                        new LeaderboardEntry(null, 6, "Jessica Thompson", "jess2025", 14200, 22),
                        new LeaderboardEntry(null, 7, "David Kim", "david2025", 12800, 19),
                        new LeaderboardEntry(null, 8, "Lisa Anderson", "lisa2025", 11500, 18),
                        new LeaderboardEntry(null, 9, "Chris Parker", "chris2025", 10200, 16),
                        new LeaderboardEntry(null, 10, "Anna Martinez", "anna2025", 9750, 15)
                ));
            }
        };
    }
}
