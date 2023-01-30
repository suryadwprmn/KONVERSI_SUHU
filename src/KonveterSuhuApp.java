import java.util.Scanner;

public class KonveterSuhuApp {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String pilihan;
        label:
        while (true){
            KonveterSuhu konveter = new KonveterSuhu();
            System.out.println("==================================================");
            System.out.println("=============APLIKASI KONVETER SUHU===============");
            System.out.println("==================================================");
            System.out.print("Silahkan Masukkan Angka Suhu Mula- Mula: ");
            konveter.setSuhuMulamula(scanner.nextFloat());
            System.out.println("Pilihan Konveter Suhu : ");
            System.out.println("1. Celcius -> Reamur ");
            System.out.println("2. Celcius -> Fahrenheit ");
            System.out.println("3. Celcius -> Kelvin");
            System.out.println("4. Reamur -> Celcius");
            System.out.println("5. Reamur -> Fahrenheit");
            System.out.println("6. Reamur -> Kelvin");
            System.out.println("7. Fahrenheit -> Celcius");
            System.out.println("8. Fahrenheit -> Reamur");
            System.out.println("9. Fahrenheit -> Kelvin");
            System.out.println("10. Kelvin -> Celcius ");
            System.out.println("11. Kelvin -> Reamur");
            System.out.println("12. Kelvin -> Fahrenheit");
            System.out.println("x.EXIT PROGRAM");
            System.out.println("Masukkan Pilihan Anda");
            pilihan = scanner.next();
            switch (pilihan) {
                case "1":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " C = " + konveter.getCelciustoReamur() + " R ");
                    break;
                case "2":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " C = " + konveter.getCelciusToFahrenheit() + " F ");
                    break;
                case "3":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " C = " + konveter.getCelciustoKelvin() + " K ");
                    break;
                case "4":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " R = " + konveter.getReamurtoCelcius() + " C ");
                    break;
                case "5":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " R = " + konveter.getReamurtoFahrenheit() + " F ");
                    break;
                case "6":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " R = " + konveter.getReamurtoKelvin() + " K ");
                    break;
                case "7":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " F = " + konveter.getFahrenheitToCelcius() + " C ");
                    break;
                case "8":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " F = " + konveter.getFahrenheitToReamur() + " R ");
                    break;
                case "9":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " F = " + konveter.getFahrenheittoKelvin() + " K ");
                    break;
                case "10":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " K = " + konveter.getKelvitoCelcius() + " C ");
                    break;
                case "11":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " K = " + konveter.getKelvintoReamur() + " R ");
                    break;
                case "12":
                    System.out.println("Suhu " + konveter.getSuhuMulamula() + " K = " + konveter.getKelvintoFahrenheit() + " F ");
                    break;
                case "x":
                    break label;
                default:
                    System.err.println("PILIHAN ANDA TIDAK ADA!!! \n Silahkan Ulangi Lagi ");
                    break;
            }

        }
    }

}