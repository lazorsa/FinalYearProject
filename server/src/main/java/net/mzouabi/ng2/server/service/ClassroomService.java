package net.mzouabi.ng2.server.service;

import net.mzouabi.ng2.server.dto.ClassroomDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClassroomService {

    Page<ClassroomDTO> findClassrooms(Pageable pageable);

//    ClassroomDTO getClassroom(String id);
//
//    void updateClassroom(ClassroomDTO classroomDTO);
//
//    void saveClassroom(ClassroomDTO classroomDTO);
//
//    void deleteClassroom(String id);

}
