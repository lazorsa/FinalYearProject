package net.mzouabi.ng2.server.mvc;

import net.mzouabi.ng2.server.dto.ClassroomDTO;
import net.mzouabi.ng2.server.service.ClassroomService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;


@RestController
@CrossOrigin
@RequestMapping(value = "/api/classroom")
public class ClassroomController {

    final static Logger LOG = LoggerFactory.getLogger(ClassroomController.class);

    @Inject
    ClassroomService classroomService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<ClassroomDTO>> findAllClassroom(Pageable pageable, HttpServletRequest req) {
        Page<ClassroomDTO> page = classroomService.findClassrooms(pageable);
        return new ResponseEntity<>(page, HttpStatus.OK);
    }
}


