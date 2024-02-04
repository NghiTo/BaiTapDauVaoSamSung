import java.util.HashMap;
import java.util.Map;

public class CountSpecificDigits {
    public static void main(String[] args) {
        int number = 123456; // Thay đổi số nhập vào ở đây

        Map<Character, Integer> digitCount = countSpecificDigits(number, '0', '2');

        // Hiển thị kết quả
        if (digitCount.isEmpty()) {
            System.out.println("Không có chữ số 0 và 2 trong số nhập vào.");
        } else {
            for (Map.Entry<Character, Integer> entry : digitCount.entrySet()) {
                System.out.println("Số " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
            }
        }
    }

    private static Map<Character, Integer> countSpecificDigits(int number, char... specificDigits) {
        Map<Character, Integer> digitCount = new HashMap<>();
        String numberString = Integer.toString(number);

        // Đếm số lần xuất hiện của chữ số cụ thể
        for (char digitChar : numberString.toCharArray()) {
            if (containsChar(specificDigits, digitChar)) {
                digitCount.put(digitChar, digitCount.getOrDefault(digitChar, 0) + 1);
            }
        }

        return digitCount;
    }

    private static boolean containsChar(char[] chars, char target) {
        for (char c : chars) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}
