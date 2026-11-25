package domain;

import java.time.Duration;
import java.time.LocalDate;

public class Training {
    private  Long id;
    private Trainee trainee;
    private Trainer trainer;
    private String name;
    private  TrainingType trainingType;
    private LocalDate date;
    private Duration duration;

    public Training(Long id, Trainee trainee, Trainer trainer, String name, TrainingType trainingType, LocalDate date, Duration duration) {
        this.id = id;
        this.trainee = trainee;
        this.trainer = trainer;
        this.name = name;
        this.trainingType = trainingType;
        this.date = date;
        this.duration = duration;
    }


    //setters & getters


    public Long getId(){
        return id;
    }
    public Trainee getTrainee() {
        return trainee;
    }

    public void setTrainee(Trainee trainee) {
        this.trainee = trainee;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrainingType getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(TrainingType trainingType) {
        this.trainingType = trainingType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
