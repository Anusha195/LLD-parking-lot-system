package project.model;

public class Car implements ICar{
    private String reg_no;
    private String color;

    public Car(String reg_no, String color) {
        this.reg_no = reg_no;
        this.color = color;
    }

    @Override
    public String getRegno() {
        return reg_no;
    }

    @Override
    public String getColor() {
        return color;
    }
    
}
