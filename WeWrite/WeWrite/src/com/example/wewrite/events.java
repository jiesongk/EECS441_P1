package com.example.wewrite;

public class events {
  //need a constructor
  
  events(final events event)
  {
    this.globalCursor = event.globalCursor;
    this.removeLength = event.removeLength;
    this.insertLength = event.insertLength;
    this.characters = event.characters;
    this.removedCharacters = event.removedCharacters;
    this.username = event.username;
    this.afterGlobalOrderId = event.afterGlobalOrderId;
    this.globalOrderId = event.globalOrderId;
  }
  
  public events()
  {
    // TODO Auto-generated constructor stub
  }

  private int globalCursor;
  private int removeLength;
  private int insertLength;
  private String characters;
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
  
  public String getCharacters()
  {
    return characters;
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
  
  public void setCharacters(String newCharacters)
  {
    characters = newCharacters;
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