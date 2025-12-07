package com.sherif.qalam.note.service;

import com.sherif.qalam.note.dto.NoteRequestDTO;
import com.sherif.qalam.note.dto.NoteResponseDTO;

import java.util.List;

public interface NoteService {
    String createKitab(NoteRequestDTO dto, Long user_id);
    List<NoteResponseDTO> getAll();
    NoteResponseDTO getById(String id);
    void delete(String id);
    NoteResponseDTO update(Long id, NoteRequestDTO dto);
}
