package rentACar.entities;

public class Car {
    private int id;
    private String color;
    private int model;

    public Car(int id,String color,int model)
    {
        this.setId(id);
        this.setColor(color);
        this.setModel(model);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
