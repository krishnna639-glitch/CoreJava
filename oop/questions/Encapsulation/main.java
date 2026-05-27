class Student {

    private int id;
    private String name;
    private String grad;

    void setData(int id, String name, String grad) {
        this.id = id;
        this.name = name;
        this.grad = grad;
    }

    void getData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Graduation: " + grad);
    }
}

class main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setData(101, "Ananya", "B.Tech");

        s.getData();
    }
}