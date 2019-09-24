
package javaconstrator;

public class VipPerson {
    private String vipName;
    private double craditLimit;
    private String vipEmail;

    public VipPerson() {
        this("Default Name", 5000.0, "Default@Email.com");
    }

    public VipPerson(String vipName, double craditLimit) {
        this(vipName, craditLimit, "Unknown@gmail.com");
    }

    public VipPerson(String vipName, double craditLimit, String vipEmail) {
        this.vipName = vipName;
        this.craditLimit = craditLimit;
        this.vipEmail = vipEmail;
    }

    public String getVipName() {
        return vipName;
    }

    public double getCraditLimit() {
        return craditLimit;
    }

    public String getVipEmail() {
        return vipEmail;
    }
}
