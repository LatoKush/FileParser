import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ParsingCsv {

    //Основной метод приложения
    public static void main(String[] args) throws IOException {
        String filePath = "File3.csv";
        List<Product> products = ParseProductCsv(filePath);

    }

    private static List<Product> ParseProductCsv(String filePath) throws IOException {
        //Загружаем строки из файла
        List<Product> products = new ArrayList<Product>();
        List<String> fileLines = Files.readAllLines(Paths.get(filePath));
        for (String fileLine : fileLines) {
            String[] splitedText = fileLine.split(",");
            ArrayList<String> columnList = new ArrayList<String>();
            for (int i = 0; i < splitedText.length; i++) {
                //Если колонка начинается на кавычки или заканчиваеться на кавычки
                if (IsColumnPart(splitedText[i])) {
                    String lastText = columnList.get(columnList.size() - 1);
                    columnList.set(columnList.size() - 1, lastText + ","+ splitedText[i]);
                } else {
                    columnList.add(splitedText[i]);
                }
            }
            Product product = new Product();
            product.Name = columnList.get(0);
            product.PurchasePrice = columnList.get(1);
            product.Group = columnList.get(2);
            product.Amount = columnList.get(3);
            product.Composition = columnList.get(4);
            product.Count = columnList.get(5);
            products.add(product);

        }
        return products;
    }

    //Проверка является ли колонка частью предыдущей колонки
    private static boolean IsColumnPart(String text) {
        String trimText = text.trim();
        System.out.println(trimText);
        return trimText.indexOf("\"") == trimText.lastIndexOf("\"") && trimText.endsWith("\"");
    }
}