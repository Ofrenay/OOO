package domain;

public interface GeheimschriftStrategy {
    String code(String s);
    String decode(String s);
}
