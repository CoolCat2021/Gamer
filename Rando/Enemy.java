import java.lang.Math;
public class Enemy {
  private String enemyName;
  private int maxHealth;
  private int health;
  private int maxDamage;
  private int minDamage = 1;

  public Enemy(String enemyName) {
    this.enemyName = enemyName;
    if (enemyName == "Awooga") {
      maxHealth = 15;
      maxDamage = 3;
    }
    else if (enemyName == "Peepoo") {
      maxHealth = 10;
      maxDamage = 2;
    }
    else if (enemyName == "Weewoo") {
      maxHealth = 5;
      maxDamage = 1;
    }
    else if (enemyName == "Jon") {
      maxHealth = 30;
      maxDamage = 5;
    }
  }

  public String getEnemyName() {
    return enemyName;
  }
  public int getMaxHealth() {
    return maxHealth;
  }
  public int getMaxDamage() {
    return maxDamage;
  }
  public int getHealth() {
    return health;
  }
  public void setHealth(int health) {
    this.health = health;
  }
  public void addToHealth(int deltaHealth) {
    health = health + deltaHealth;
  }
  public void setEnemyName(String enemyName) {
    this.enemyName = enemyName;
  }
  public int calculateDamage() {
    int damageRange = maxDamage-minDamage+1;
    int damage = (int) (Math.random() * damageRange) + 1;

    if (maxDamage == 5) {
      if (Math.random() > 0.10) {
        return damage;
      }
      else {
        return 0;
      }
    }
    else if (maxDamage == 1) {
      if (Math.random() > 0.70) {
        return damage;
      }
      else {
        return 0;
      }
    }
    else if (maxDamage == 2) {
      if (Math.random() > 0.50) {
        return damage;
      }
      else {
        return 0;
      }
    }
    else if (maxDamage == 3) {
      if (Math.random() > 0.25) {
        return damage;
      }
      else {
        return 0;
      }
    }

    else {
      return 0;
    }


  }
}
