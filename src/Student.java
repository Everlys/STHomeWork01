import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
public class Student { /*8 Student类 */

    private int ID; /* 7 nID*/
    private String name;
    private String birDate;
    private boolean gender;/*7 bGender*/
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Student(int ID, String name, String birDate, boolean gender) {
        this.ID = ID;
        this.name = name;
        this.birDate = birDate;
        this.gender = gender;
    }

    public Student() {
    }

    @Override
    public String toString() {

        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", birDate='" + birDate + '\'' +
                ", gender=" + (gender==true?"男":"女") +
                '}';
    }
}/* 6  { 对应line1*/
