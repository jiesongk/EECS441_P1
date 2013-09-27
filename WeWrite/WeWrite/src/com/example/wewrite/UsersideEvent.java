package com.example.wewrite;

public class UsersideEvent {
  UsersideEvent(){}
  
  UsersideEvent(final UsersideEvent event)
  {
    this.globalCursor = event.globalCursor;
    this.removeLength = event.removeLength;
    this.insertLength = event.insertLength;
    this.insertCharacters = event.insertCharacters;
    this.removedCharacters = event.removedCharacters;
    this.username = event.username;
    this.afterGlobalOrderId = event.afterGlobalOrderId;
    this.globalOrderId = event.globalOrderId;
  }
  
  private int globalCursor;
  private int removeLength;
  private int insertLength;
  private String insertCharacters;
  private String removedCharacters;
  private String username;
  private int afterGlobalOrderId;
  private int globalOrderId;
  private int globalIndex;
  
  public int getGlobalCursor()
  {
    return globalCursor;
  }
  
  public int getRemoveLength()
  {
    return removeLength;
  }
  
  public int getInsertLength()
  {
    return insertLength;
  }
  
  public String getInsertCharacters()
  {
    return insertCharacters;
  }
  
  public String getRemovedCharacters()
  {
    return removedCharacters;
  }
  
  public String getUsername()
  {
    return username;
  }
  
  public int getAfterGlobalOrderId()
  {
    return afterGlobalOrderId;
  }
  
  public int getGlobalOrderId()
  {
    return globalOrderId;
  }
  
  public int getGlobalIndex()
  {
    return globalIndex;
  }
  
  public void setGlobalCursor(int newGlobalCursor)
  {
    globalCursor = newGlobalCursor;
  }
  
  public void setRemoveLength(int newRemoveLength)
  {
    removeLength = newRemoveLength;
  }
  
  public void setInsertLength(int newInsertLength)
  {
    insertLength = newInsertLength;
  }
  
  public void setInsertCharacters(String newInsertCharacters)
  {
    insertCharacters = newInsertCharacters;
  }
  
  public void setRemovedCharacters(String newRemovedCharacters)
  {
    removedCharacters = newRemovedCharacters;
  }
  
  public void setUsername(String newUsername)
  {
    username = newUsername;
  }
  
  public void setAfterGlobalOrderId(int newAfterGlobalOrderId)
  {
    afterGlobalOrderId = newAfterGlobalOrderId;
  }
  
  public void setGlobalOrderId(int newGlobalOrderId)
  {
    globalOrderId = newGlobalOrderId;
  }
  
  public void setGlobalIndex(int newGlobalIndex)
  {
    globalIndex = newGlobalIndex;
  }
}