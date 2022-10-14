import java.util.Scanner;



        public class Main {

            public static void main(String[] args) {

                String burc = "";
                boolean isError = false;

                Scanner scanner = new Scanner(System.in);

                System.out.print("Doğduğunuz ay : ");
                int mounth = scanner.nextInt();

                System.out.print("Doğduğunuz gün : ");
                int day = scanner.nextInt();

                if(mounth == 1) {

                    if(day >=  1 && day <= 31) {
                        if(day < 22) {
                            burc = "Oğlak";
                        }else {
                            burc = "Kova";
                        }
                    }else {
                        isError = true;
                    }

                }else if (mounth == 2) {
                    if(day >= 1 && day <= 28) {
                        if(day < 20) {
                            burc = "Kova";
                        }else {
                            burc = "Balık";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 3) {
                    if(day >= 1 && day <= 31) {
                        if (day < 21) {
                            burc = "Balık";
                        }else {
                            burc = "Koç";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 4) {
                    if(day >= 1 && day <= 30) {
                        if(day < 21) {
                            burc = "Koç";
                        }else {
                            burc = "Boğa";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 5) {
                    if(day >= 1 && day <= 31) {
                        if(day < 22) {
                            burc = "Boğa";
                        }else {
                            burc = "İkizler";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 6) {
                    if(day >= 1 && day <= 30) {
                        if(day < 23) {
                            burc = "İkizler";
                        }else {
                            burc = "Yengeç";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 7) {
                    if(day >=1 && day <= 31) {
                        if(day < 23) {
                            burc = "Yengeç";
                        }else {
                            burc = "Aslan";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 8) {
                    if(day >= 1 && day <= 31) {
                        if(day < 23) {
                            burc = "Aslan";
                        }else {
                            burc = "Başak";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 9) {
                    if(day >= 1 && day <= 30) {
                        if(day < 23) {
                            burc = "Başak";
                        }else {
                            burc = "Terazi";
                        }
                    }else {
                        isError = true;
                    }
                }else if (mounth == 10) {
                    if(day >= 1 && day <= 31) {
                        if(day < 23) {
                            burc = "Terazi";
                        }else {
                            burc = "Akrep";
                        }
                    }else {
                        isError = true;
                    }
                }else if(mounth == 11) {
                    if(day >= 1 && day <= 30) {
                        if(day < 22) {
                            burc = "Akrep";
                        }else {
                            burc = "Yay";
                        }
                    }else {
                        isError = true;
                    }
                }else if(mounth == 12) {
                    if(day >= 1 && day <= 31) {
                        if(day < 22) {
                            burc = "Yay";
                        }else {
                            burc = "Oğlak";
                        }
                    }else {
                        isError = true;
                    }
                }

                if(isError) {
                    System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz.");
                }else {
                    System.out.println("Burcunuz : " + burc);
                }

            }

        }
























/*


        if (dogumtarihi>=21.03 && dogumtarihi<=20.04) System.out.println("Burcunuz Koc");
        else if(dogumtarihi>= 21.04 && dogumtarihi<= 21.05) System.out.println("Burcunuz Boga");
        else if(dogumtarihi>= 22.05 && dogumtarihi<= 22.05) System.out.println("Burcunuz Ikizler");
        else if(dogumtarihi>= 23.06 && dogumtarihi<= 22.07) System.out.println("Burcunuz Yengec");

        else if(dogumtarihi>= 23.07 && dogumtarihi<= 22.08) System.out.println("Burcunuz Aslan");
        else if(dogumtarihi>= 23.08 && dogumtarihi<=22.09) System.out.println("Burcunuz Basak");
        else if(dogumtarihi>= 23.09 && dogumtarihi<=22.10) System.out.println("Burcunuz Terazi");
        else if(dogumtarihi>= 23.10 && dogumtarihi<=21.11) System.out.println("Burcunuz Akrep");

        else if(dogumtarihi>= 22.11 && dogumtarihi<=21.12) System.out.println("Burcunuz Yay");

        else if(dogumtarihi>= 22.12 && dogumtarihi<= 21.01) System.out.println("Burcunuz Oglak");
        else if(dogumtarihi>= 22.01 && dogumtarihi<= 19.02) System.out.println("Burcunuz Kova");
        else if(dogumtarihi>= 20.02 && dogumtarihi<=20.03) System.out.println("Burcunuz Balik");


 */