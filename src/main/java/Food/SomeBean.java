package Food;

import java.time.LocalDate;

public class SomeBean {

    private String datePlanted;
    private String datePlanted1;

    public SomeBean(){

    }
    public SomeBean(String datePlanted) {
        this.datePlanted = datePlanted;
    }

    public String getDatePlanted() {
        return datePlanted;
    }

    public void setDatePlanted(String datePlanted) {
        this.datePlanted = datePlanted;
    }
//include getter and setter
public String getDatePlanted1() {
    return datePlanted1;
}

    public void setDatePlanted1(String datePlanted1) {
        this.datePlanted1 = datePlanted1;
    }
//include getter and setter

}