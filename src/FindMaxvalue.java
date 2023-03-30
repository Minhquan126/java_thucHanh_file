import java.util.List;

public class FindMaxvalue {
    public static int findMaxValue(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws Exception {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
       String path_numbers = "C:\\Users\\ADMIN\\Desktop\\java\\Bai tap\\thucHanh_File\\src\\numbers.txt";
       String path_maxValue = "C:\\Users\\ADMIN\\Desktop\\java\\Bai tap\\thucHanh_File\\src\\maxvalue.txt";
       List<Integer> numbers = readAndWriteFile.readFile(path_numbers);
       int maxvalue = findMaxValue(numbers);
       readAndWriteFile.writeFile(path_maxValue,maxvalue);

    }
}
