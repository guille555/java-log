package dev.sprout.main.model;

import java.time.LocalDateTime;

/**
 * @author DEV Sprout
 */
public abstract class AbstractSeed {

  private String publicKey;
  private boolean state;
  private boolean visible;
  private LocalDateTime createDate;
  private LocalDateTime lastUpdate;

  public AbstractSeed() {
    this.publicKey = null;
    this.state = false;
    this.visible = false;
    this.createDate = null;
    this.lastUpdate = null;
  }

  public AbstractSeed(boolean state, boolean visible, LocalDateTime createDate, LocalDateTime lastUpdate) {
    this.publicKey = null;
    this.state = state;
    this.visible = visible;
    this.createDate = createDate;
    this.lastUpdate = lastUpdate;
  }

  public abstract void showInformation();

  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }

  public boolean isState() {
    return state;
  }

  public void setState(boolean state) {
    this.state = state;
  }

  public boolean isVisible() {
    return visible;
  }

  public void setVisible(boolean visible) {
    this.visible = visible;
  }

  public LocalDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
  }

  public LocalDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(LocalDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }
}
