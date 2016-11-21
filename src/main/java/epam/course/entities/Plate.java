package epam.course.entities;

/**
 * Created by Rita on 21.11.2016.
 */
public class Plate {
    private String radioOdd;
    private String radioEven;
    private String checkbox;
    private String dropdownColor;
    private String comboMetal;

    public Plate(String radioOdd, String radioEven,
                 String checkbox, String dropdownColor, String comboMetal) {
        this.radioOdd = radioOdd;
        this.radioEven = radioEven;
        this.checkbox = checkbox;
        this.dropdownColor = dropdownColor;
        this.comboMetal = comboMetal;
    }
}
