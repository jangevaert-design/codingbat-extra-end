public class extraEnd {
  public String extraEnd(String str) {
    String outcome = "";
    String substr = str.substring(str.length() - 2, str.length());
    outcome = substr + substr + substr;
    return outcome;
  }
}
