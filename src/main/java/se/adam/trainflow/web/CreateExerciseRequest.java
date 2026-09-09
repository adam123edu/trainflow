package se.adam.trainflow.web;

import se.adam.trainflow.domain.Difficulty;
import se.adam.trainflow.domain.Equipment;
import se.adam.trainflow.domain.MuscleGroup;


public record CreateExerciseRequest(
        String name,
        MuscleGroup muscleGroup,
        Equipment equipment,
        Difficulty difficulty
) {}
