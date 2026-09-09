package se.adam.trainflow.web;

import se.adam.trainflow.domain.Difficulty;
import se.adam.trainflow.domain.Equipment;
import se.adam.trainflow.domain.Exercise;
import se.adam.trainflow.domain.MuscleGroup;

public record ExerciseResponse(
        Long id,
        String name,
        MuscleGroup muscleGroup,
        Equipment equipment,
        Difficulty difficulty
) {
    public static ExerciseResponse from(Exercise exercise) {
        return new ExerciseResponse(exercise.getId(), exercise.getName(),
                                    exercise.getMuscleGroup(), exercise.getEquipment(),
                                    exercise.getDifficulty());
    }
}
