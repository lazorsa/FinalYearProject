package net.mzouabi.ng2.server.mvc;

import net.mzouabi.ng2.server.controllers.LecturePreferencesController;
import net.mzouabi.ng2.server.model.LecturePreferences;
import net.mzouabi.ng2.server.services.LecturePreferencesService;
import net.mzouabi.ng2.server.util.Response;
import net.mzouabi.ng2.server.util.ResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jayani on 7/16/17.
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/api/lecturePreferences")
public class LecturePreferencesControllerImpl implements LecturePreferencesController {
	@Autowired
	LecturePreferencesService lecturePreferencesService;

	public Response getAllLecturePreferences() {
		return ResponseBuilder.create()
			.withData(lecturePreferencesService.fineAll())
			.withMessage("All Data Retrieved").get();
	}

	public void addLectuerPreferences(
		@RequestBody LecturePreferences lecturePreferences) {
		lecturePreferencesService.addPreference(lecturePreferences);
	}

	public Response getPreferencesByLecture(
		@PathVariable(Constances.LECTURE_ID) String lectureId) {
		Iterable<LecturePreferences> lecturePreferences = lecturePreferencesService.findByLectureId(lectureId);
		return ResponseBuilder.create()
			.withData(lecturePreferences)
			.withMessage("Data Retrieved").get();
	}
}
