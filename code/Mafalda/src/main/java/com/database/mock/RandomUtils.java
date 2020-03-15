package com.database.mock;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe di utility per gestire la generazione pseudo random di valori
 *
 * @author odococo
 */
public class RandomUtils extends Utils {

    private final ThreadLocalRandom random;

    /**
     * Costruttore. Inizializza il seme
     */
    public RandomUtils() {
        super();
        random = ThreadLocalRandom.current();
    }

    /**
     * Genera un numero random tra minValue incluso e maxValue escluso
     *
     * @param minValue valore minimo dell'intervallo. Incluso
     * @param maxValue valore massimo dell'intervallo. Escluso
     * @return un numero intero pseudo casuale
     */
    public int randomInt(int minValue, int maxValue) {
    	if (minValue == maxValue) {
    		return minValue;
    	}
        return random.nextInt(minValue, maxValue);
    }

    /**
     * Richiama randomInt con minValue settato a 0
     *
     * @param maxValue
     * @return un numero intero pseudo casuale
     */
    public int randomInt(int maxValue) {
        return randomInt(0, maxValue);
    }

    /**
     * Genera un numero random tra minValue incluso e maxValue escluso
     *
     * @param minValue valore minimo dell'intervallo. Incluso
     * @param maxValue valore massimo dell'intervallo. Escluso
     * @return un numero reale pseudo casuale
     */
    public double randomDouble(int minValue, int maxValue) {
        return random.nextDouble(minValue, maxValue);
    }

    /**
     * Richiama randomDouble con minValue settato a 0
     *
     * @param maxValue
     * @return un numero reale pseudo casuale
     */
    public double randomDouble(int maxValue) {
        return randomDouble(0, maxValue);
    }

    /**
     * Genera un booleano
     *
     * @return un booleano pseudo casuale
     */
    public boolean randomBoolean() {
        return random.nextBoolean();
    }

    /**
     * Genera una stringa di una certa lunghezza e con un certo alfabeto
     *
     * @param seed il set di caratteri da usare
     * @param length la lunghezza della stringa da generare
     * @return una stringa con caratteri pseudo casuali
     */
    public String randomString(String seed, int length) {
        char[] str = new char[length];
        for (int i = 0; i < length; i++) {
            str[i] = seed.charAt(randomInt(seed.length()));
        }
        return new String(str);
    }

    /**
     * Genera una stringa di una certa lunghezza e con l'alfabeto classico e
     * numeri
     *
     * @param length la lunghezza della stringa da generare
     * @return una stringa con caratteri pseudo casuali
     */
    public String randomString(int length) {
        return randomString("1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm", length);
    }

    /**
     * Genera una password di una certa lunghezza e con un alfabeto classico e
     * numeri e caratteri speciali
     *
     * @param length la lunghezza della password da generare
     * @return la password con caratteri pseudo casuali
     */
    public String randomPassword(int length) {
        // rimosso ' perche' terminava la stringa
        // rimosso \\
        // rimosso ; perche' termina query
        // rimosso , per problemi con i file csv
        return randomString("1234567890QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm|!£$%&/()=?^*.:-_", length);
    }

    /**
     * Pesca un elemento casuale dato un array
     *
     * @param <T> il tipo dell'array
     * @param array l'array da cui pescare l'elemento
     * @return l'elemento scelto in maniera pseudo casuale
     */
    public <T> T randomElement(T[] array) {
        return array[randomInt(array.length)];
    }

    /**
     * Pesca un elemento casuale dato una lista
     *
     * @param <T> il tipo della lista
     * @param list la lista da cui pescare l'elemento
     * @return l'elemento scelto in maniera pseudo casuale
     */
    public <T> T randomElement(List<T> list) {
        return (T) list.get(randomInt(list.size()));
    }
    
    /**
     * Crea una data in un range di date
     * 
     * @param startYear int anno iniziale
     * @param endYear int anno finale
     * @param startMonth int mese iniziale
     * @param endMonth int mese finale
     * @param startDay int giorno iniziale
     * @param endDay int giorno finale
     * @return
     */
    public Date randomDate(int startYear, int endYear, int startMonth, int endMonth, int startDay, int endDay) {
    	int year = randomInt(startYear, endYear);
    	// TODO controllare mese e giorno per mese
    	int month = randomInt(startMonth, endMonth);
    	int day = randomInt(startDay, endDay);
    	String date = year + "-" + month + "-" + day;
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    	try {
			Date d = sdf.parse(date);
			return d;
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	return new Date();
    }
}