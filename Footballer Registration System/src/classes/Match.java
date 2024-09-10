package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Observer;
import interfaces.Subject;

public class Match implements Subject {
    private List<Observer> observers;
    private int goals;
    private int assists;
    private double goalRating;
    private double assistRating;

    public Match() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(goals, assists, goalRating, assistRating);
        }
    }

    public void setStats(int goals, int assists, double goalRating, double assistRating) {
        this.goals = goals;
        this.assists = assists;
        this.goalRating = goalRating;
        this.assistRating = assistRating;
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    // Getter methods if needed
    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public double getGoalRating() {
        return goalRating;
    }

    public double getAssistRating() {
        return assistRating;
    }

}
