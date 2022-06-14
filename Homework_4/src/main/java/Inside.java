public class Inside {
    private String name;
    private int age;
    private String color;
    private int height;

    public Inside(String name, int age, String color, int height) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
    }

    public Inside(String name, int age) {
        this.name = name;
        this.age = age;
        this.color = "white";
        this.height = 90;
    }

    public Inside() {
        System.out.println("Creating object of the class Dog.");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
