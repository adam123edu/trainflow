package se.adam.trainflow.service;

import org.springframework.stereotype.Service;
import se.adam.trainflow.domain.*;

@Service
public class ExerciseService {

    private final ExerciseRepository repository;

    public ExerciseService(ExerciseRepository repository) {
        this.repository = repository;

    }

    public Exercise createExercise(String name, MuscleGroup muscleGroup, Equipment equipment, Difficulty difficulty) {
        Exercise exercise = new Exercise(name, muscleGroup, equipment, difficulty);
        return repository.save(exercise);

    }
}
