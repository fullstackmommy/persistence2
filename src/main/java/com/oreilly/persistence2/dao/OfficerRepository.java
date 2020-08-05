package com.oreilly.persistence2.dao;

import com.oreilly.persistence2.entities.Officer;
import com.oreilly.persistence2.entities.Rank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OfficerRepository extends JpaRepository<Officer, Integer> {
    List<Officer> findByRank(@Param("rank") Rank rank);
    List<Officer> findByLast(@Param("last") String last);
    List<Officer> findAllByRankAndLastLike(Rank rank, String last);
}
