import java.util.UUID;

public class Person {
    private final String id;
    private String name;

    Person(String name){
        this.name=name;
        id=String.valueOf(UUID.randomUUID());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                name + "    " + id
                ;
    }
}
