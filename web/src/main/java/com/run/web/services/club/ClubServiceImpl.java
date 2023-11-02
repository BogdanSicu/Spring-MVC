package com.run.web.services.club;

import com.run.web.dto.ClubDTO;
import com.run.web.mapper.MapperInterface;
import com.run.web.models.Club;
import com.run.web.repo.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubServiceImpl implements ClubService{

    private final ClubRepository clubRepository;
    private final MapperInterface<Club, ClubDTO> clubMapper;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository, MapperInterface<Club, ClubDTO> clubMapper) {
        this.clubRepository = clubRepository;
        this.clubMapper = clubMapper;
    }

    @Override
    public List<ClubDTO> findAllClubs() {
        return clubRepository.findAll().stream()
                .map(clubMapper::toDTO).toList();
    }
}
