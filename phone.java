public class phone
{
  private String make;
  private int model;
  private String fit;
  private double versionNumber;

//over loaded constructor
  public phone(String a, int b, String c, double d)
  {
    make = a;
    model = b;
    fit = c;
    versionNumber = d;
  }

  //Default constructor
  public phone()
  {

  }
//Getters fetch
  public String getMake()
  {
    return make;
  }

  public int getModel()
  {
    return model;
  }

  public String getFit()
  {
    return fit;
  }
  
  public double getVersionNumber()
  {
    return versionNumber;
  }
//Setters (set to smth new)

public void setMake(String newMake)
{
    make = newMake;
}

public void setModel(int newModel)
{
    model = newModel;
}

public void setFit(String newFit)
{
    fit = newFit;
}

public void setVersionNumber(double newVersionNumber)
{
    versionNumber = newVersionNumber;
}

