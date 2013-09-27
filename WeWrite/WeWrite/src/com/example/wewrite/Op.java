package com.example.wewrite;

public interface Op {
  public abstract void execute ();
  public abstract void broadcast();
  public abstract int getSubmissionId();
}
