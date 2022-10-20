import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Staff {


    private String name;
    private int age;
    private String[] position;              //  Array
    private List<String> skills;            //  List
    private Map<String, BigDecimal> salary; //  Map

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPosition(String[] position) {
        this.position = position;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public void setSalary(Map<String, BigDecimal> salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String[] getPosition() {
        return position;
    }

    public List<String> getSkills() {
        return skills;
    }

    public Map<String, BigDecimal> getSalary() {
        return salary;
    }

    // getters , setters, some boring stuff

}