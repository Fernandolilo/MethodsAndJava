package program;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

import javax.management.openmbean.OpenMBeanAttributeInfoSupport;

public class Application {

	public static void main(String[] args) {
		/**
		 * Exemplo de utilização dos metodos after e before
		 */
		
	
		/*Date dataNoPassado = new Date(1513124807691L);
		// Tue Dec 12 22:26:47 BRST 2017

		Date dataNoFuturo = new Date(1613124807691L);
		// Fri Feb 12 08:13:27 BRST 2021

		/** Comparando se a dataNoPassado é posterior a dataNoFuturo */
		/*boolean isAfter = dataNoPassado.after(dataNoFuturo);

		System.out.println(isAfter);
		// false

		/** Comparando se a dataNoPassado é anterior a dataNoFuturo */
		/*boolean isBefore = dataNoPassado.before(dataNoFuturo);

		System.out.println(isBefore); 
		// true*/
		

	/*	Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se as datas são iguais */
       /* boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
      /*  int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println("Quantos dias? " +compareCase1); // -1

        System.out.println("Quantos dias? " +compareCase2); // 1

        System.out.println("Quantos dias? " +compareCase3); // 0 */
		/*Date dataNoPassado = new Date(1513124807691L); //Tue Dec 12 22:26:47 BRST 2017

    /*    Date dataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        Date mesmaDataNoFuturo = new Date(1613124807691L); //Fri Feb 12 08:13:27 BRST 2021

        /** Comparando se as datas são iguais */
        /*boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** Comparando uma data com a outra */
        /*int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro

        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado

        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); //datas equivalentes

        System.out.println("Quantos dias? " +compareCase1); // -1

        System.out.println("Quantos dias? " +compareCase2); // 1

        System.out.println("Quantos dias? " +compareCase3); // 0

	*/
		
		/*Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		cal.add(Calendar.DATE, + 3);
		System.out.println("Tres dis a mais: " + cal.getTime());

		
		cal.add(Calendar.MONTH, + 4);
		System.out.println("Mais quatro meses: " + cal.getTime());
		
		cal.add(Calendar.YEAR, + 2);
		System.out.println("Mais 2 anos: " + cal.getTime());*/
		
		/*Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        //Dom jul 14 20:58:11 BRT 2019

        System.out.printf("%tF\n", agora);
        //2019-07-14

        System.out.printf("%tD\n", agora);
        //07/14/19

        System.out.printf("%tr\n", agora);
        //08:58:11 PM

        System.out.printf("%tT\n", agora);
        //20:58:11*/
		
		
		/* A parti do java 8 uma nova forma de manupular datas com ma facilidade */
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalTime agora = LocalTime.now();
		System.out.println(agora);
		
		LocalTime maisUmaHora = agora.plusHours(1);
		System.out.println(maisUmaHora);
		
		LocalDateTime ja = LocalDateTime.now();
		System.out.println(ja);
		
		LocalDateTime futuro = ja.plusDays(7);
		System.out.println("Seu boleto vence dia " + futuro);
	}

}
