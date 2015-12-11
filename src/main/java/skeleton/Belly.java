package skeleton;

public class Belly {
    private static final int BELLY_MAX_CUKES = 41;
    private static final int BELLY_MAX_TIME = 1;
    private static final String BELLY_GROWL = "GROWL";
    private static final String BELLY_SILENT = "silent";
    private int cukes;
  
    public void eat(int cukes) {
        this.cukes = cukes;
    }
  
  public String getSound ( int waitingTime ) {
      if (this.cukes > this.BELLY_MAX_CUKES && waitingTime >= this.BELLY_MAX_TIME) {
        return this.BELLY_GROWL;
      }
      else {
        return this.BELLY_SILENT;
      }
  }
}
