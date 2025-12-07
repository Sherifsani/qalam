package com.sherif.qalam.note.dto;

import com.sherif.qalam.note.entity.Note;

public class NoteMapper {

    public static Note toNote(NoteRequestDTO dto) {
        return Note.builder()
                .name(dto.getName())
                .build();
    }

    public static NoteRequestDTO toDTO(Note note) {
        return NoteRequestDTO.builder()
                .name(note.getName())
                .build();
    }
}
