package itsfreaky;

/**
 *
 * @author Luis Miguel Morales
 */
public class ItsFreaky {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("##########################################");
        System.out.println("EJEMPLO 1: Pruebas de cubrimiento (DAM/DAW)");
        System.out.println("##########################################");

        // Pruebas de casos de uso

        // Pruebas de cubrimiento

        /*
         * caso de uso 1:
         * videogames=1, manga=1, technology=1
         * return 1 o "eres un freaky!"
         */

        System.out.println(isFreaky(1, 1, 1));

        /*
         * Caso de uso 2:
         * videogames=1, manga=1, technology=0
         * este caso de prueba debera devolver 0
         */
        System.out.println(isFreaky(1, 1, 0));

        /*
         * Caso de uso 3:
         * videogames=1, manga=0, technology=1
         * este caso de prueba debera devolver 0
         */
        System.out.println(isFreaky(1, 0, 1));

        /*
         * Caso de uso 4:
         * videogames=0, manga=1, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 1));

        /*
         * Caso de uso 5:
         * videogames=0, manga=0, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 0, 1));

        /*
         * Caso de uso 6:
         * videogames=0, manga=1, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 1));

        /*
         * Caso de uso 7:
         * videogames=0, manga=1, technology=0
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 0));

        /*
         * Caso de uso 8:
         * videogames=0, manga=0, technology=0
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 0, 0));

        System.out.println("##########################################");
        System.out.println("EJEMPLO 2: Pruebas de condiciones (DAM/DAW)");
        System.out.println("##########################################");

        // Pruebas de casos de uso

        // Pruebas de cubrimiento

        /*
         * caso de prueba 1:
         * videogames=1, manga=1, technology=1
         * return 1 o "eres un freaky!"
         */

        System.out.println(isFreaky(1, 1, 1));

        /*
         * Caso de prueba 2:
         * videogames=1, manga=1, technology=0
         * este caso de prueba debera devolver 0
         */
        System.out.println(isFreaky(1, 1, 0));

        /*
         * Caso de prueba 3:
         * videogames=1, manga=0, technology=1
         * este caso de prueba debera devolver 0
         */
        System.out.println(isFreaky(1, 0, 1));

        /*
         * Caso de prueba 4:
         * videogames=0, manga=1, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 1));

        /*
         * Caso de prueba 5:
         * videogames=0, manga=0, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 0, 1));

        /*
         * Caso de prueba 6:
         * videogames=0, manga=1, technology=1
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 1));

        /*
         * Caso de prueba 7:
         * videogames=0, manga=1, technology=0
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 1, 0));

        /*
         * Caso de prueba 8:
         * videogames=0, manga=0, technology=0
         * este caso de prueba debera devolver 0
         * 
         */
        System.out.println(isFreaky(0, 0, 0));
    }

    /**
     * Método que nos devuelve si una persona es Freak o no, dependiendo de si le
     * gustan
     * los videojuegos, el manga y la tecnología.
     * 
     * @param videogames
     * @param manga
     * @param technology
     * @return 1 o 0 dependiendo de si la persona es Freaky o no lo es.
     */
    public static int isFreaky(int videogames, int manga, int technology) {
        if (videogames > 0) {
            if (manga > 0) {
                if (technology > 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
}
