public class PrintLabel {
    public static void main(String[] args) throws Exception {
        ArgumentSeparator argsSeparator = new ArgumentSeparator(args);
        ReadFile readObj = new ReadFile(argsSeparator.getFile());
        String data = readObj.readContent();
        Operations operation = new Operations(argsSeparator.getChoice(),data,argsSeparator.getValidators());
        operation.getLabel();
    }
}
