public class PrintLabel {
    public static void main(String[] args) throws Exception {
        if(args.length>2){
            Operations op1 = new Operations(args[0],args[1],args[2]);
            op1.getLabel();
        }
        else{
            Operations op = new Operations(args[0], args[1]);
            op.getLabel();
        }
    }
}
