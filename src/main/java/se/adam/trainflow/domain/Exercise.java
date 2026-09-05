package se.adam.trainflow.domain;

import jakarta.persistence.*;

@Entity
public class Exercise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private MuscleGroup muscleGroup;

    @Enumerated(EnumType.STRING)
    private Equipment equipment;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    protected Exercise() {
    // because jpa needs it and protects us from future bugs
    }

    public Exercise(String name, MuscleGroup muscleGroup, Equipment equipment, Difficulty difficulty) {
        this.name = name;
        this.muscleGroup = muscleGroup;
        this.equipment = equipment;
        this.difficulty = difficulty;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public MuscleGroup getMuscleGroup() {
        return muscleGroup;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
}
