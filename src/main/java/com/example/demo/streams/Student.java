package com.example.demo.streams;

public class Student {
    private String name;
    private Accommodation accommodation;
    private Double gpa;
    private Branch branch;

    private Double availableCash;

    public Student(String name, Accommodation accommodation, Double gpa, Branch branch, Double availableCash) {
        this.name = name;
        this.accommodation = accommodation;
        this.gpa = gpa;
        this.branch = branch;
        this.availableCash = availableCash;
    }

    public String getName() {
        return name;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public Double getGpa() {
        return gpa;
    }

    public Branch getBranch() {
        return branch;
    }

    public Double getAvailableCash() {
        return availableCash;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", accommodation=" + accommodation +
                ", gpa=" + gpa +
                ", branch=" + branch +
                ", availableCash=" + availableCash +
                '}';
    }


}
