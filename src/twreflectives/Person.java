package twreflectives;

public class Person implements Identifiable {

    private String name;
    private Integer age;
    public Integer number;

    @Override
    public String getUniqueData() {
        return String.format("%s with age %s", name, age);
    }

    public Integer getAge() {
        return age;
    }

    private void print(String name) {
        System.out.println();
    }

}
