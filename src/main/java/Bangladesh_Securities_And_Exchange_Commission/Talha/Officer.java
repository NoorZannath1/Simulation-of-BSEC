package Bangladesh_Securities_And_Exchange_Commission.Talha;

public abstract class Officer {
    protected String employeeId;
    protected String name;
    protected String username;
    protected String password;
    protected String email;
    protected String department;

    public Officer() {
    }

    public Officer(String employeeId, String name, String username, String password, String email, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.department = department;
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Officer{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean login(String username, String password) {
        if (this.username != null) {
            if (this.password != null) {
                if (this.username.equals(username)) {
                    return this.password.equals(password);
                }
            }
        }
        return false;
    }
}