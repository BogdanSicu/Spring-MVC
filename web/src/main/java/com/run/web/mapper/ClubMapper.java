package com.run.web.mapper;

import com.run.web.dto.ClubDTO;
import com.run.web.models.Club;
import org.springframework.stereotype.Service;

@Service
public class ClubMapper implements MapperInterface<Club, ClubDTO> {
    @Override
    public Club toModel(ClubDTO myDTO) {
        return Club.builder()
                .title(myDTO.getTitle())
                .photoUrl(myDTO.getPhotoURL())
                .content(myDTO.getContent())
                .createdOn(myDTO.getCreatedOn())
                .updatedOn(myDTO.getUpdatedOn())
                .build();
    }

    @Override
    public ClubDTO toDTO(Club myModel) {
        return ClubDTO.builder()
                .title(myModel.getTitle())
                .photoURL(myModel.getPhotoUrl())
                .content(myModel.getContent())
                .createdOn(myModel.getCreatedOn())
                .updatedOn(myModel.getUpdatedOn())
                .build();
    }
}
