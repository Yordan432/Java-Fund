import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String textEditor = "";
        boolean isAppend = false;
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String textCommand = command[0];
            String words = command[1];
            String appendWords = AppendsToEndOfText(textCommand, textEditor, words);
            textEditor = appendWords;
            IsAppend(isAppend , appendWords);
            if (!isAppend){
                continue;
            }
            ErasesLastElement(textCommand, textEditor, words);
            ElementPosition(textCommand, words, textEditor);
        }
    }

    private static boolean IsAppend(boolean isAppend , String words) {
        boolean isAppendNumber = false;
        int isNumber;
        try {
            isNumber = Integer.parseInt(words);
            return true;
        }catch (Exception ex){

        }
        return isAppendNumber;
    }

    private static void ElementPosition(String textCommand, String words, String textEditor) {
        int positionIndex = Integer.parseInt(words);
        if (textCommand.equals("3")) {
            String word = textEditor.substring(positionIndex);
            System.out.println(word);
        }
    }

    private static void ErasesLastElement(String textCommand, String textEditor, String words) {
        if (textCommand.equals("2")) {
            int countWordsPerRemove = Integer.parseInt(words);
            String remainder = "";
            for (int i = 0; i < countWordsPerRemove; i++) {
                remainder = textEditor.substring(textEditor.length() - 1 - i);
            }
            textEditor = textEditor.replace(remainder, "");
        }
    }

    private static String AppendsToEndOfText(String textCommand, String textEditor, String words) {
        if (textCommand.equals("1")) {
            textEditor += words;
        }
        return textEditor;
    }
}
