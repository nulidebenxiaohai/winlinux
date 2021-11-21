package Assignment212;

public class Try {
    public static void main(String[] args) {
        StringBuilder sb = new java.lang.StringBuilder();
        sb.append("enter");
        sb.append("\n");
        sb.append("01");
        String abs = "enter\n01";
        System.out.println(sb);
        switch (abs){
            case "0":
                System.out.println("sdfsf");
                break;
            case "enter":
                System.out.println("enter");
                break;
            case "enter\n01":
                System.out.println("right");
                break;
        }
    }
}