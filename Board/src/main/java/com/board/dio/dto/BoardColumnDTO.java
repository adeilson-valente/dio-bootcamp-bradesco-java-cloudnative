package com.board.dio.dto;

public record BoardColumnDTO(Long id,
                             String name,
                             com.board.dio.persistence.entity.BoardColumnKindEnum kind,
                             int cardsAmount) {
}