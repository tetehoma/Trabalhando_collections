package dio.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturasAnuais = new ArrayList<Double>();
        temperaturasAnuais.add(3.0);
        temperaturasAnuais.add(5.4);
        temperaturasAnuais.add(7.1);
        temperaturasAnuais.add(5.7);
        temperaturasAnuais.add(2.8);
        temperaturasAnuais.add(2.7);

        System.out.println(temperaturasAnuais.toString());

        //Calculo da média
        Iterator<Double> iterator = temperaturasAnuais.iterator();
        Double soma = 0.0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println(soma);
        double media = (soma / temperaturasAnuais.size());
        System.out.println(media);

        Iterator <Double> iterator1 = temperaturasAnuais.iterator();
        for (int i = 1; i == 6; i++) {
            int mes = 0;
            double temperatura = 0;

            switch (mes) {
                case 1:
                    System.out.println("1 - Janeiro: " + temperatura);
                case 2:
                    System.out.println("1 - Fevereiro: " + temperatura);
                case 3:
                    System.out.println("1 - Março: " + temperatura);
                case 4:
                    System.out.println("1 - Abril: " + temperatura);
                case 5:
                    System.out.println("1 - Maio: " + temperatura);
                case 6:
                    System.out.println("1 - Junho: " + temperatura);
            }
        }


        }


                   /*[ switch (i) {
                        case 1 :
                            System.out.println("1 - Janeiro: " + temperatura);
                        case 2:
                            System.out.println("1 - Fevereiro: " + temperatura);
                        case 3:
                            System.out.println("1 - Março: " + temperatura);
                        case 4:
                            System.out.println("1 - Abril: " + temperatura);
                        case 5:
                            System.out.println("1 - Maio: " + temperatura);
                        case 6:
                            System.out.println("1 - Junho: " + temperatura);
                    }
        /*
                    ]*/
    }


                /*for (int i = 1; i == 6; i++) {
            System.out.println("Digite as médias dos 6 primeiros meses do ano:");
            double media = scanner.nextDouble();
            temperaturasAnuais.add(media);
            System.out.println(temperaturasAnuais.toString());
        }*/



