package dev.sprout.main.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author DEV Sprout
 */
public final class Entry extends AbstractSeed {

  public long id;
  public String content;
  public List<Contact> listContacts;

  public Entry() {
    super();
    this.listContacts = new ArrayList<Contact>();
  }

  public Entry(String content, boolean state, boolean visible, LocalDateTime createDate, LocalDateTime lastUpdate) {
    super(state, visible, createDate, lastUpdate);
    this.content = content;
    this.listContacts = new ArrayList<Contact>();
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<Contact> getListContacts() {
    return listContacts;
  }

  public void setListContacts(List<Contact> listContacts) {
    this.listContacts = listContacts;
  }

  public void addContact(Contact contact) {
    this.listContacts.add(contact);
  }

  public Contact getContact(int index) {
    Contact contact = this.listContacts.get(index);
    return contact;
  }

  @Override
  public void showInformation() {
    StringBuilder text = new StringBuilder("Entry: { ");
    text.append("id (long): ");
    text.append(this.id);
    text.append(" publicKey (String): ");
    text.append(this.getPublicKey());
    text.append(" content (String): ");
    text.append(this.content);
    text.append(" state (boolean): ");
    text.append(this.isState());
    text.append(" visible (boolean): ");
    text.append(this.isVisible());
    text.append(" createDate (LocalDateTime): ");
    text.append(this.getCreateDate());
    text.append(" lastUpdate (LocalDateTime): ");
    text.append(this.getLastUpdate());
    text.append(" listContacts (List) }");
    System.out.println(text.toString());
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 53 * hash + (int) (this.id ^ (this.id >>> 32));
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
    final Entry other = (Entry) obj;
    return this.id == other.id;
  }

  @Override
  public String toString() {
    return "Entry{}";
  }
}
