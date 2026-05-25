package dev.sprout.main.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DEV Sprout
 */
public final class Contact extends AbstractSeed {

  private long id;
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;
  private List<Entry> listEntries;

  public Contact() {
    super();
    this.listEntries = new ArrayList<Entry>();
  }

  public Contact(
    long id,
    String firstName,
    String lastName,
    String phoneNumber,
    String email,
    boolean state,
    boolean visible,
    LocalDateTime createDate,
    LocalDateTime lastUpdate
  ) {
    super(state, visible, createDate, lastUpdate);
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.listEntries = new ArrayList<Entry>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Entry> getListEntries() {
    return listEntries;
  }

  public void setListEntries(List<Entry> listEntries) {
    this.listEntries = listEntries;
  }

  public void addEntry(Entry entry) {
    this.listEntries.add(entry);
  }

  public Entry getEntry(int index) {
    Entry entry = this.listEntries.get(index);
    return entry;
  }

  @Override
  public void showInformation() {
    StringBuilder text = new StringBuilder("Contact: {");
    text.append("id (long): ");
    text.append(this.id);
    text.append(" publicKey (String): ");
    text.append(this.getPublicKey());
    text.append(" firstName (String): ");
    text.append(this.firstName);
    text.append(" lastName (String): ");
    text.append(this.lastName);
    text.append(" phoneNumber (String): ");
    text.append(this.phoneNumber);
    text.append(" email (String): ");
    text.append(this.email);
    text.append(" state (boolean): ");
    text.append(this.isState());
    text.append(" visible (boolean): ");
    text.append(this.isVisible());
    text.append(" createDate (LocalDateTime): ");
    text.append(this.getCreateDate());
    text.append(" lastUpdate (LocalDateTime): ");
    text.append(this.getLastUpdate());
    text.append(" listEntries (List) }");
    System.out.println(text.toString());
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Contact other = (Contact) obj;
    return this.id == other.id;
  }

  @Override
  public String toString() {
    return "Contact{}";
  }
}
