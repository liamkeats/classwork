package codeHS;

public class Assignment
{
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints){
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public String getName(){
        return name;
    }
    public double getAvailablePoints(){
        return availablePoints;
    }
    public double getEarnedPoints(){
        return earnedPoints;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAvaiablePoints(double availablePoints){
        this.availablePoints = availablePoints;
    }
    public void setEarnedPoints(double earnedPoints){
        this.earnedPoints = earnedPoints;
    }
}

