public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":
                System.out.println("5GB YouTube");
                break;
            case "M":
                System.out.println("WhatsApp e Instagram ilimitado");
                break;
            case "B":
                System.out.println("100 minutos de ligação");
                break;
            default:
                System.out.println("Plano não identificado");
                break;
        }
    }
}
