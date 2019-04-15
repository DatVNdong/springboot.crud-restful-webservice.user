package springboot.crudrestfulwebservice.user.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "ConfirmResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class User {

    @JacksonXmlProperty(localName = "Id")
    private int id;
    @JacksonXmlProperty(localName = "Company")
    private int company;
    @JacksonXmlProperty(localName = "Branch")
    private int branch;
    @JacksonXmlProperty(localName = "Team")
    private int team;
    @JacksonXmlProperty(localName = "UserId")
    private String userId;
    @JacksonXmlProperty(localName = "Username")
    private String username;
    @JacksonXmlProperty(localName = "Password")
    private String password;

    public User() {

    }

    public User(int id, int company, int branch, int team, String userId, String username, String password) {
        super();
        this.id = id;
        this.company = company;
        this.branch = branch;
        this.team = team;
        this.userId = userId;
        this.username = username;
        this.password = password;
    }

    public int getBranch() {
        return branch;
    }

    public int getCompany() {
        return company;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getTeam() {
        return team;
    }

    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public void setCompany(int company) {
        this.company = company;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        String result = "{ " + String.valueOf(this.id) + ", " + String.valueOf(this.company) + ", "
                + String.valueOf(this.branch) + ", " + String.valueOf(this.team) + ", " + this.userId + ", "
                + this.username + ", " + this.password + " }";
        return result;
    }
}
