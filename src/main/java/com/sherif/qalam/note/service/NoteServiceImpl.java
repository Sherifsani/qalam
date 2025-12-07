package com.sherif.qalam.note.service;

import com.sherif.qalam.note.dto.NoteRequestDTO;
import com.sherif.qalam.note.dto.NoteResponseDTO;
import com.sherif.qalam.note.entity.Note;
import com.sherif.qalam.note.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    @Override
    public String createKitab(NoteRequestDTO dto, Long userId) {
        
        return "";
    }

    @Override
    public List<NoteResponseDTO> getAll() {
        return List.of();
    }

    @Override
    public NoteResponseDTO getById(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    public NoteResponseDTO update(Long id, NoteRequestDTO dto) {
        return null;
    }

    private boolean checkIfExists(String id) {
        return true;
    }
}
