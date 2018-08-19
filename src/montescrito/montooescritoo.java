package montescrito;

public class montooescritoo {

	private static String numero;

	public static String NumeroEnTexto(int ubicado) {

		System.out.println("Introduzca un numero");
		numero = null;
		int cant_carac = numero.length();
		char[] split_numero = numero.toCharArray();
		int ubicacion = cant_carac;
		String num_fin = "";
		int ubicacion1 = 0;
		for (int cont = 0; cont < cant_carac; cont++) {

			switch (ubicacion1)

			{
			case 1:
				if (ubicacion == cant_carac) {
					switch (split_numero[cont]) {
					case '0':
						break;

					case '1':
						num_fin = num_fin + "uno";
						break;

					case '2':
						num_fin = num_fin + "dos";
						break;

					case '3':
						num_fin = num_fin + "tres";
						break;

					case '4':
						num_fin = num_fin + "cuatro";
						break;

					case '5':
						num_fin = num_fin + "cinco";
						break;

					case '6':
						num_fin = num_fin + "seis";
						break;

					case '7':
						num_fin = num_fin + "siete";
						break;

					case '8':
						num_fin = num_fin + "ocho";
						break;

					case '9':
						num_fin = num_fin + "nueve";
						break;
					}
				} else {
					switch (split_numero[cont]) {
					case '0':
						break;

					case '1':
						num_fin = num_fin + " y uno";
						break;

					case '2':
						num_fin = num_fin + " y dos";
						break;

					case '3':
						num_fin = num_fin + " y tres";
						break;

					case '4':
						num_fin = num_fin + " y cuatro";
						break;

					case '5':
						num_fin = num_fin + " y cinco";
						break;

					case '6':
						num_fin = num_fin + " y seis";
						break;

					case '7':
						num_fin = num_fin + " y siete";
						break;

					case '8':
						num_fin = num_fin + " y ocho";
						break;

					case '9':
						num_fin = num_fin + " y nueve";
						break;
					}
				}
				break;
			case 2:
				switch (split_numero[cont]) {
				case '0':
					break;

				case '1':
					num_fin = num_fin + " diez";
					break;

				case '2':
					num_fin = num_fin + " veinte";
					break;

				case '3':
					num_fin = num_fin + " treinta";
					break;

				case '4':
					num_fin = num_fin + " cuarenta";
					break;

				case '5':
					num_fin = num_fin + " cincuenta";
					break;

				case '6':
					num_fin = num_fin + " sesenta";
					break;

				case '7':
					num_fin = num_fin + " setenta";
					break;

				case '8':
					num_fin = num_fin + " ochenta";
					break;

				case '9':
					num_fin = num_fin + " noventa";
					break;
				}
				break;

			case 3:
				switch (split_numero[cont]) {
				case '0':
					break;

				case '1':
					num_fin = num_fin + " cien";
					break;

				case '2':
					num_fin = num_fin + " doscientos";
					break;

				case '3':
					num_fin = num_fin + " trecientos";
					break;

				case '4':
					num_fin = num_fin + " cuatrocientos";
					break;

				case '5':
					num_fin = num_fin + " quinientos";
					break;

				case '6':
					num_fin = num_fin + " seiscientos";
					break;

				case '7':
					num_fin = num_fin + " setecientos";
					break;

				case '8':
					num_fin = num_fin + " ochocientos";
					break;

				case '9':
					num_fin = num_fin + " novecientos";
					break;
				}
				break;
			case 4:
				switch (split_numero[cont]) {
				case '0':
					num_fin = num_fin + " ";
					break;

				case '1':
					num_fin = num_fin + " y uno mil";
					break;

				case '2':
					num_fin = num_fin + " y dos mil";
					break;

				case '3':
					num_fin = num_fin + " y tres mil";
					break;

				case '4':
					num_fin = num_fin + " y cuatro mil";
					break;

				case '5':
					num_fin = num_fin + " y cinco mil";
					break;

				case '6':
					num_fin = num_fin + " y seis mil";
					break;

				case '7':
					num_fin = num_fin + " y siete mil";
					break;

				case '8':
					num_fin = num_fin + " y ocho mil";
					break;

				case '9':
					num_fin = num_fin + " y nueve mil";
					break;
				}
				break;

			case 5:
				switch (split_numero[cont]) {

				case '0':
					break;

				case '1':
					num_fin = num_fin + " diez";
					break;
				case '2':
					num_fin = num_fin + " diez";
					break;
				case '3':
					num_fin = num_fin + " diez";
					break;
				case '4':
					num_fin = num_fin + " diez";
					break;
				case '5':
					num_fin = num_fin + " diez";
					break;
				case '6':
					num_fin = num_fin + " diez";
					break;
				case '7':
					num_fin = num_fin + " diez";
					break;
				case '8':
					num_fin = num_fin + " diez";
					break;
				case '9':
					num_fin = num_fin + " diez";
					break;

				}
				break;

			case '6':
				switch (split_numero[cont]) {
				case '0':
					break;

				case '1':
					num_fin = num_fin + " cien";
					break;
				case '2':
					num_fin = num_fin + " doscientos";
					break;
				case '3':
					num_fin = num_fin + " trecientos";
					break;
				case '4':
					num_fin = num_fin + " cuatrocientos";
					break;
				case '5':
					num_fin = num_fin + " quinientos";
					break;
				case '6':
					num_fin = num_fin + " seicientos";
					break;
				case '7':
					num_fin = num_fin + " setecientos";
					break;
				case '8':
					num_fin = num_fin + " ochocientos";
					break;
				case '9':
					num_fin = num_fin + " novecientos";
					break;

				}
				break;

			case 7:
				switch (split_numero[cont]) {
				case '0':
					num_fin = num_fin + " ";
					break;

				case '1':
					num_fin = num_fin + " y uno millones";
					break;

				case '2':
					num_fin = num_fin + " y dos millones";
					break;

				case '3':
					num_fin = num_fin + " y tres millones";
					break;

				case '4':
					num_fin = num_fin + " y cuatro millones";
					break;

				case '5':
					num_fin = num_fin + " y cinco millones";
					break;

				case '6':
					num_fin = num_fin + " y seis millones";
					break;

				case '7':
					num_fin = num_fin + " y siete millones";
					break;

				case '8':
					num_fin = num_fin + " y ocho millones";
					break;

				case '9':
					num_fin = num_fin + " y nueve millones";
					break;
				}
				break;

			case 8:
				switch (split_numero[cont]) {
				case '0':
					break;

				case '1':
					num_fin = num_fin + " diez";
					break;
				case '2':
					num_fin = num_fin + " veinte";
					break;
				case '3':
					num_fin = num_fin + " treinta";
					break;
				case '4':
					num_fin = num_fin + " cuarenta";
					break;
				case '5':
					num_fin = num_fin + " cincuenta";
					break;
				case '6':
					num_fin = num_fin + " sesenta";
					break;
				case '7':
					num_fin = num_fin + " setenta ";
					break;
				case '8':
					num_fin = num_fin + " diez";
					break;
				case '9':
					num_fin = num_fin + " diez";
					break;
				}
				break;
			case 9:
				switch (split_numero[cont]) {
				case '0':
					break;

				case '1':
					num_fin = num_fin + " cien";
					break;
				case '2':
					num_fin = num_fin + " doscientos";
					break;
				case '3':
					num_fin = num_fin + " trecientos";
					break;
				case '4':
					num_fin = num_fin + " cuatrocientos";
					break;
				case '5':
					num_fin = num_fin + " quinientos";
					break;
				case '6':
					num_fin = num_fin + " seicientos";
					break;
				case '7':
					num_fin = num_fin + " setecientos";
					break;
				case '8':
					num_fin = num_fin + " ochocientos";
					break;
				case '9':
					num_fin = num_fin + " novecientos";
					break;
				}
				break;
			}
			ubicacion = ubicacion - 1;
		}
		System.out.println(num_fin);
		return num_fin;
	}
}
