import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class Group implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private String description;
    private Set<String> members = new HashSet<>();
    
    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public boolean isInGroup(User user) {
        return members.contains(user.getName());
    }

    public void enrollInGroup(User user) {
        if (members.add(user.getName())) { // HashSet ensures uniqueness
            System.out.println(user.getName() + " has been successfully enrolled in group " + name);
            JOptionPane.showMessageDialog(null, user.getName() + " has been successfully enrolled in group " + name);
        } else {
            JOptionPane.showMessageDialog(null, "You are already in this group");
        }
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
