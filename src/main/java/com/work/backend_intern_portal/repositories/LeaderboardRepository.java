package com.work.backend_intern_portal.repositories;

import com.work.backend_intern_portal.entities.LeaderboardEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LeaderboardRepository extends MongoRepository<LeaderboardEntry,String> {
}
