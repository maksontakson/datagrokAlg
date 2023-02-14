package rle.encoder;

public class RleEncoderMain {
  public static void main(String[] args) {
    System.out.println(rle("ATTTGC"));
  }

  private static String rle(String s) {
    StringBuilder builder = new StringBuilder();
    int countsOfRepeat = 1;
    for (Character ch : s.toCharArray()) {
      if (builder.isEmpty()) {
        builder.append(ch);
      } else if (ch.equals(builder.charAt(builder.length() - 1))) {
        countsOfRepeat++;
      } else {
        builder.append(countsOfRepeat);
        builder.append(ch);
        countsOfRepeat = 1;
      }
    }
    builder.append(countsOfRepeat);
    return builder.toString();
  }
}
