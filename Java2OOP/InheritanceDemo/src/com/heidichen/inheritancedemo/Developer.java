package com.heidichen.inheritancedemo;

import java.util.ArrayList;

public class Developer {
    // 1. private attributes /properties /  member variables
    private String name;
    private int wpm;
    private ArrayList<String> languages;
    private double salary;
    private int braincell;
    
    // 2. constructor 
    public Developer(){
        this.name = "Anonymous";
        this.wpm = 200;
        this.languages = new ArrayList<String>();
        this.languages.add("Java");
        this.salary = 150000;
        this.braincell = 8;
    }

    public Developer(String name){
        this.name = name;
        this.wpm = 60;
        this.languages = new ArrayList<String>();
        this.languages.add("Java");
        this.languages.add("HTML");
        this.languages.add("Python");
        this.salary = 120000;
        this.braincell = 10;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWpm() {
		return wpm;
	}

	public void setWpm(int wpm) {
		this.wpm = wpm;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBraincell() {
		return braincell;
	}

	public void setBraincell(int braincell) {
		this.braincell = braincell;
	}
	
	// 4. other methods
    public void display(){
        System.out.println("==== Developer Display ======");
        System.out.println("Name: "+ this.name);
        System.out.println("wpm: "+ this.wpm);
        System.out.println("languages: "+ this.languages);
        System.out.println("salary: "+ this.salary);
        System.out.println("braincell: "+ this.braincell);
    }

    public Developer debug(){
        System.out.println(this.name + " is debugging..... still working on it");
        this.braincell--;
        return this;
    }

    public Developer fixedBug(){
        System.out.println(this.name + " has successfully fixed the bug");
        this.braincell+= 2;
        return this;        
    }
    
    
}
