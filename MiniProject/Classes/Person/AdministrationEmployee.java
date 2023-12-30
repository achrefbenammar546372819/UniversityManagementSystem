package MiniProject.Classes.Person;

public class AdministrationEmployee extends Person {
    public String role;

    public AdministrationEmployee(String name, String id, String role) {
        super(name, id);
        this.role = role;
    } 
}
