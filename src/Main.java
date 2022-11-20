import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı girin: ");
        int ay = klavye.nextInt();
        System.out.print("Doğduğunuz günü girin: ");
        int gun = klavye.nextInt();

        if (ay == 1) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 22) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }

            } else {
                System.err.println("Geçerli Gün Girin.");
            }

        } else if (ay == 2) {
            if (gun <= 28 && gun >= 1) {
                if (gun < 20) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }


            } else {
                System.err.println("Geçerli Gün Girin.");
            }
        } else if (ay == 3) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 21) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            } else {
                System.err.println("Geçerli Gün Girin.");
            }
        } else if (ay == 4) {
            if (gun <= 30 && gun >= 1) {
                if (gun < 21) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            } else {
                System.err.println("Geçerli Gün Girin.");
            }
        } else if (ay == 5) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 22) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }

            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else if (ay == 6) {
            if (gun <= 30 && gun >= 1) {
                if (gun < 23) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else if (ay == 7) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 23) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else if (ay == 8) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 23) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else if (ay == 9) {
            if (gun <= 30 && gun >= 1) {
                if (gun < 23)
                    System.out.println("Başak Burcu");
                else
                    System.out.println("Terazi Burcu");
            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else if (ay == 10) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 23)
                    System.out.println("Terazi Burcu");
                else
                    System.out.println("Akrep Burcu");

            } else {
                System.err.println("Geçerli Gün Girin.");
            }

        } else if (ay == 11) {
            if (gun <= 30 && gun >= 1) {
                if (gun < 22)
                    System.out.println("Akrep Burcu");
                else
                    System.out.println("Yay Burcu");
            } else {
                System.err.println("Geçerli Gün Girin.");
            }

        } else if (ay == 12) {
            if (gun <= 31 && gun >= 1) {
                if (gun < 22)
                    System.out.println("Yay Burcu");
                else
                    System.out.println("Oğlak Burcu");
            } else {
                System.err.println("Geçerli Gün Girin.");

            }

        } else {
            System.err.println("GEÇERLİ BİR AY GİRİN.");
        }

    }}