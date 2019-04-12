package app.models;

import java.util.List;

public class DataDto {

  private String fName;
  private String lName;
  private List<String> fileNames;

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public List getFileNames() {
    return fileNames;
  }

  public void setFileNames(List fileNames) {
    this.fileNames = fileNames;
  }
}
