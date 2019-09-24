
package javaclass;

public class Car {
    private int door;
    private int weels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toUpperCase();
        if(validModel.equals("CARERA") || validModel.equals("commodo")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
