public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();
        config.setServerUrl("http://miapi.com");
        System.out.println("URL del Servidor: " + config.getServerUrl());

        System.out.println("Puerto por defecto: " + config.getPort());
        config.setCertificate("AdaSchoolValidation");
        System.out.println("Certificado: "+ config.getCertificate());
        config.setIp(1237823489);
        System.out.println("Ip: " + config.getIp());

    }
    
}
