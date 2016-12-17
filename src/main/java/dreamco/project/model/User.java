package dreamco.project.model;

import dreamco.project.util.DesireUtil;


import java.util.Date;
import java.util.EnumSet;
import java.util.Set;

/**
 * User: temaprof
 * Date: 19.09.2016
 */
public class User extends NamedEntity {

    protected String email;

    protected String password;

    protected boolean enabled = true;

    protected Date registered = new Date();

    protected Set<Role> roles;

    protected int countBarter = DesireUtil.DEFAULT_BARTER;

    public User() {
    }

    public User(User u) {
        this(u.getId(), u.getName(), u.getEmail(), u.getPassword(), u.getCountBarter(), u.isEnabled(), u.getRoles());
    }

    public User(Integer id, String name, String email, String password, Role role, Role... roles) {
        this(id, name, email, password, DesireUtil.DEFAULT_BARTER, true, EnumSet.of(role, roles));
    }

    public User(Integer id, String name, String email, String password, int countBarter, boolean enabled, Set<Role> roles) {
        super(id, name);
        this.email = email;
        this.password = password;
        this.countBarter = countBarter;
        this.enabled = enabled;
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getCountBarter() {
        return countBarter;
    }

    public void setCountBarter(int countBarter) {
        this.countBarter = countBarter;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User (" +
                "id=" + id +
                ", email=" + email +
                ", name=" + name +
                ", enabled=" + enabled +
                ", roles=" + roles +
                ", countBarter=" + countBarter +
                ')';
    }
}
