public class Main {
    public static void main(String[] args) {

        Balyk fish = new Balyk();
        System.out.println("balyk");
        fish.setJashaganjeri("сууда жашайт");
        fish.setColor("синий");
        fish.setWeight("2.8 gramm");
        fish.setLength("6.5 cm");
        fish.setPrice(300);
        System.out.println(fish.getJashaganjeri());
        System.out.println(fish.getColor());
        System.out.println(fish.getWeight());
        System.out.println(fish.getLength());
        System.out.println(fish.getPrice());
        System.out.println("\n");
        Popugai parrot = new Popugai();
        System.out.println("popugay");
        parrot.setName("Kesha");
        parrot.setColor("сине-розоввый");
        parrot.setPrice(6500);
        System.out.println(parrot.getName());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getPrice());
        System.out.println("\n");
        Myshyk cat = new Myshyk();
        System.out.println("myshyk");
        cat.setName("Муизза");
        cat.setColor("серый");
        cat.setAge(3);
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getAge());
        System.out.println("\n");
        It dog = new It();
        System.out.println("it");
        dog.setName("Рекс");
        dog.setColor("коричневый");
        dog.setAge(2);
        System.out.println(dog.getName());
        System.out.println(dog.getColor());
        System.out.println(dog.getAge());
    }
}