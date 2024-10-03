package ma.znagui.app.model;

import java.time.LocalDateTime;

public class Request {
    private int id;
    private String project;
    private String pro;
    private double amount;
    private int duration;
    private double mountly;
    private String email;
    private String phone;
    private String civility;
    private String fistName;
    private String lastName;
    private String cin;
    private LocalDateTime birthDay;
    private double incomes;
    private Boolean currentCredits;

    public Request() {

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }

    public String getPro() {
        return pro;
    }
    public void setPro(String pro) {
        this.pro = pro;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getMountly() {
        return mountly;
    }
    public void setMountly(double mountly) {
        this.mountly = mountly;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {

    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCivility() {
        return civility;
    }
    public void setCivility(String civility) {
        this.civility = civility;
    }

    public String getFistName() {
        return fistName;
    }
    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getCin() {
        return cin;
    }
    public void setCin(String cin) {
        this.cin = cin;
    }

    public LocalDateTime getBirthDay() {
        return birthDay;
    }
    public void setBirthDay(LocalDateTime birthDay) {
        this.birthDay = birthDay;
    }

    public double getIncomes() {
        return incomes;
    }
    public void setIncomes(double incomes) {
        this.incomes = incomes;
    }

    public Boolean getCurrentCredits() {
        return currentCredits;
    }
    public void setCurrentCredits(Boolean currentCredits) {
        this.currentCredits = currentCredits;
    }

}
