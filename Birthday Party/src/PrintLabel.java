public class PrintLabel {
    public static void main(String[] args) throws Exception {
        ArgumentSeparator argsSeparator = new ArgumentSeparator(args);
        ReadFile readObj = new ReadFile(argsSeparator.getFile());
        String data = readObj.readContent();
        System.out.println(argsSeparator.getCountry()+"============"+argsSeparator.getAge());
        Operations operation = new Operations(argsSeparator.getChoice(),data,argsSeparator.getCountry(),argsSeparator.getAge());
        operation.getLabel();
    }
}
