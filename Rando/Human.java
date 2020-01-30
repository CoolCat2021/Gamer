public class Human {
  private String name;
  private double health = 10;
  private String location = "River of Life";
  private String subclass;
  private String line;

  public Human(String name, String subclass, String line) {
    this.name = name;
    this.subclass = subclass;
    this.line = line;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getHealth() {
    return health;
  }
  public void setHealth(double health) {
    this.health = health;
  }
  public String getLocation() {
    return location;
  }
  public void setLocation(String location) {
    this.location = location;
  }
  public String getSubclass() {
    return subclass;
  }
  public void setSubclass(String subclass) {
    this.subclass = subclass;
  }
  public String getLine() {
    return line;
  }
  public void setLine(String line) {
    this.line = line;
  }
  public String getTest() {
    return name+subclass+line;
  }
}
