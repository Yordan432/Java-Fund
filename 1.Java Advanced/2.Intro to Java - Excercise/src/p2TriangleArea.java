import java.util.Scanner;

public class p2TriangleArea {
    public static void main(String[] args) {
        // a - 5
        // b -55
        // c - 75
        // Ax(By −Cy)+Bx(Cy−Ay)+Cx(Ay−By)

        Scanner scanner = new Scanner(System.in);
        String[] firstPoints = scanner.nextLine().split("\\s+");
        int[] firstPointsParser = new int[firstPoints.length];
        firstPointsParser = parserNumber(firstPoints);

        String[] secondPoints = scanner.nextLine().split("\\s+");
        int[] secondPointsParser = new int[secondPoints.length];
        secondPointsParser = parserNumber(firstPoints);

        String[] thirdPoints = scanner.nextLine().split("\\s+");
        int[] thirdPointsParser = new int[thirdPoints.length];
        thirdPointsParser = parserNumber(firstPoints);

        int aX = firstPointsParser[1];
        int bY = secondPointsParser[1];
        int cY = thirdPointsParser[1];

        int bX = secondPointsParser[0];
        int cY2 = thirdPointsParser[1];
        int aY = firstPointsParser[0];

        int cX = thirdPointsParser[0];
        int aY2 = firstPointsParser[1];
        int bY2 = secondPointsParser[1];

        int calc = (aX + (bY - cY) + bX + (cY - aY) + cX + aY - bY) / 2;
        System.out.println(calc);
    }

    private static int[] parserNumber(String[] firstPoints) {
        int[] parserArray = new int[firstPoints.length];

        for (int i = 0; i <firstPoints.length; i++) {
            int parse = Integer.parseInt(firstPoints[i]);
            parserArray[i] = parse;
        }
        return parserArray;
    }
}
