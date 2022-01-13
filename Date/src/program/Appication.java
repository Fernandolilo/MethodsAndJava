package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Appication {

	public static void main(String[] args) throws ParseException {
		// GMT: Greemwich Mean Time (time zone)
		// UTC Coordinated Universal Time (time Standard)
		/*
		 * Padrão ISO 8601 é a class Instant Formato: yyyy-MM-ddTHH:mm:ssZ Ex:
		 * "2021-08-01-T18:22:07Z
		 */
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		Date y1 = sdf1.parse("01/08/2021");
		Date y2 = sdf2.parse("01/08/2021 18:27:00");
		Date x1 = new Date(); // pega a data atual do sistema
		Date x2 = new Date(System.currentTimeMillis());
		/*
		 * Date x2 = new Date(System.currentTimeMillis()); pega a data atual do sistema,
		 * desta mesma forma posso passar os milissegundos de outra forma veja o ex:
		 * Date x3 = new Date(0L); o L é long veja a impressão: Wed Dec 31 21:00:00 BRT
		 * 1969 como estamos 3 horas atrasados em referencia a UTC Coordinated Universal
		 * Time (time Standard) então será impresso uma data 3 horas anterir ao
		 * referencial do java.
		 */

		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		// com isto é criado uma data as 01/01/1970 o horario 02:00:00

		/*
		 * vamos criar a data agora no padrão ISO 8601 no padrão UTC, porem se eu deixar
		 * desta forma é pegará o GMT: Greemwich Mean Time (time zone) com três horas de
		 * atraso, x5: 01/08/2021 15:57:00, para solucionar SERÁ TRATADO CONFORME EX:
		 * SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * sdf3.setTimeZone(TimeZone.getTimeZone("GMT")); NA IMPRESSÃO SERÁ COLOCADO O
		 * SDF3.
		 */
		Date x5 = Date.from(Instant.parse("2021-08-01T18:57:00Z"));

		/*
		 * um o bjeto Date internamente armazena, o número de milissegundos desde a meia
		 * noite do dia 01 de janeiro de 1970 GMT (UTC) GMT: Greemwich Mean Time (time
		 * zone) UTC Coordinated Universal Time (time Standard)
		 */
		
		System.out.println("__________________________________");
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("x5: " + x5);
		
		System.out.println("__________________________________");
		System.out.println("Y1: " + sdf2.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("x5: " + sdf2.format(x5));

		System.out.println("__________________________________");
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("x5: " + sdf3.format(x5));
		

		/* hora se formatação.
		 * Y1: Sun Aug 01 00:00:00 BRT 2021
		 * Y2: Sun Aug 01 18:27:00 BRT 2021
         * x1: Sat Jul 31 19:12:43 BRT 2021
         * x2: Sat Jul 31 19:12:43 BRT 2021
         * x3: Wed Dec 31 21:00:00 BRT 1969
         * x4: Thu Jan 01 02:00:00 BRT 1970
         * x5: Sun Aug 01 15:57:00 BRT 2021 
		 
		 * Horario Basileiro 
		 * Y1: 01/08/2021 00:00:00 
		 * Y2: 01/08/2021 18:27:00 
		 * x1: 31/07/2021 19:05:29 
		 * x2: 31/07/2021 19:05:29 
		 * x3: 31/12/1969 21:00:00 
		 * x4: 01/01/1970 02:00:00 
		 * x5: 01/08/2021 15:57:00
		 
		 * horario de Grenwich 
		 * Y1: 01/08/2021 03:00:00 
		 * Y2: 01/08/2021 21:27:00 
		 * x1: 31/07/2021 22:05:29 
		 * x2: 31/07/2021 22:05:29 
		 * x3: 01/01/1970 00:00:00 
		 * x4: 01/01/1970 05:00:00 
		 * x5: 01/08/2021 18:57:00
		 */

	}

}
