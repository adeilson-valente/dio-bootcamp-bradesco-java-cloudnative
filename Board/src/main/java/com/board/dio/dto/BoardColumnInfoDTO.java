package com.board.dio.dto;

public record BoardColumnInfoDTO(Long id, int order, com.board.dio.persistence.entity.BoardColumnKindEnum kind) {
}