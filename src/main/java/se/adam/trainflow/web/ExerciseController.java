package se.adam.trainflow.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.adam.trainflow.domain.Exercise;
import se.adam.trainflow.service.ExerciseService;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping
    public Exercise createExercise(@RequestBody CreateExerciseRequest request) {
        return exerciseService.createExercise(request.name(), request.muscleGroup(), request.equipment(), request.difficulty());
    }
}
