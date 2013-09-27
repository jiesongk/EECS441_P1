package com.example.wewrite;

public class ExecOp{
  private CharSequence insertChar;
  private int insertLength;
  private CharSequence removeChar;
  private int removeLength;
  private int globalStart;
  private String userName;
  
  public ExecOp(CharSequence previousS, CharSequence s, int start, int before, int count, String userDisplayName){
    this.globalStart = start;
    this.insertChar = s.subSequence(start, start+count).toString();
    this.insertLength = count;
    this.removeChar = previousS.subSequence(start, start+count);
    this.removeLength = before;
    this.userName = userDisplayName;
  }
  
  public void insert(){
    
  }
  
  public void remove(){
    
  }
  
  public CharSequence getInsertChar()
  {
    return insertChar;
  }
  public void setInsertChar(CharSequence insertChar)
  {
    this.insertChar = insertChar;
  }
  public int getInsertLength()
  {
    return insertLength;
  }
  public void setInsertLength(int insertLength)
  {
    this.insertLength = insertLength;
  }
  public CharSequence getRemoveChar()
  {
    return removeChar;
  }
  public void setRemoveChar(CharSequence removeChar)
  {
    this.removeChar = removeChar;
  }
  public int getRemoveLength()
  {
    return removeLength;
  }
  public void setRemoveLength(int removeLength)
  {
    this.removeLength = removeLength;
  }
  public int getGlobalStart()
  {
    return globalStart;
  }
  public void setGlobalStart(int globalStart)
  {
    this.globalStart = globalStart;
  }
  public String getUserName()
  {
    return userName;
  }
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
 
  
}
