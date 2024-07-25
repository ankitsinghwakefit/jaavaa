package course.enumPkg;

public class Index {
    public static void main(String[] args) {
        ConstEnum e = ConstEnum.Idel;
        System.out.println(e);

        if (e == ConstEnum.Done) {
            System.out.println("word done");
        } else if (e == ConstEnum.Pending) {
            System.out.println("word pending");
        } else if (e == ConstEnum.Idel) {
            System.out.println("word idel");
        } else {
            System.out.println("word running");
        }

        switch (e) {
            case Done:
                System.out.println("done");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            case Idel:
                System.out.println("Idel");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
