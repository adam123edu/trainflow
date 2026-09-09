package se.adam.trainflow.web;

import org.springframework.web.bind.annotation.*;
import se.adam.trainflow.domain.Exercise;
import se.adam.trainflow.service.ExerciseService;

import java.util.List;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {

    private final ExerciseService exerciseService;

    public ExerciseController(ExerciseService exerciseService) {
        this.exerciseService = exerciseService;
    }

    @PostMapping
    public ExerciseResponse createExercise(@RequestBody CreateExerciseRequest request) {
        Exercise exercise = exerciseService.createExercise(request.name(), request.muscleGroup(),
                                                           request.equipment(), request.difficulty());
        return ExerciseResponse.from(exercise);
    }

    @GetMapping
    public List<ExerciseResponse> getAllExercises() {
        return exerciseService.getAllExercises().stream()
                .map(exercise -> ExerciseResponse.from(exercise))
                .toList();
    }
}
